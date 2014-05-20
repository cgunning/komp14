package mjc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTree;
import mjc.visitors.JasminVisitor;
import mjc.visitors.StackSizeCalculator;
import mjc.visitors.SymbolTableVisitor;
import mjc.visitors.TypeCheckVisitor;

import java.io.*;
import java.util.BitSet;

/**
 * Created by christoffergunning on 3/26/14.
 */
public class JVMMain {
    static boolean DEBUG = false;

    public static void main(String args[]) {
        if(args.length > 1) {
            runTest(args[0], DEBUG);
        } else
            runTest("/home/christoffergunning/workspace/miniJava/test/P1.java", true);

    }

    public static boolean runTest(String path, boolean DEBUG) {

        File file = new File(path);

        System.out.println(file);
        FileInputStream fs = null;

        // create a CharStream that reads from standard input
        ANTLRInputStream input = null;
        ANTLRErrorListener parserErrorListener = new ANTLRErrorListener() {
            @Override
            public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object o, int i, int i2, @NotNull String s, @Nullable RecognitionException e) {
                System.exit(1);
            }

            @Override
            public void reportAmbiguity(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, boolean b, @Nullable BitSet bitSet, @NotNull ATNConfigSet atnConfigs) {

            }

            @Override
            public void reportAttemptingFullContext(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, @Nullable BitSet bitSet, @NotNull ATNConfigSet atnConfigs) {

            }

            @Override
            public void reportContextSensitivity(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, int i3, @NotNull ATNConfigSet atnConfigs) {

            }

        };

        ANTLRErrorListener lexerErrorListener = new ANTLRErrorListener() {
            @Override
            public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object o, int i, int i2, @NotNull String s, @Nullable RecognitionException e) {
                System.exit(1);
            }

            @Override
            public void reportAmbiguity(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, boolean b, @Nullable BitSet bitSet, @NotNull ATNConfigSet atnConfigs) {

            }

            @Override
            public void reportAttemptingFullContext(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, @Nullable BitSet bitSet, @NotNull ATNConfigSet atnConfigs) {

            }

            @Override
            public void reportContextSensitivity(@NotNull Parser parser, @NotNull DFA dfa, int i, int i2, int i3, @NotNull ATNConfigSet atnConfigs) {

            }

        };

        try {
            fs = new FileInputStream(file);
            input = new ANTLRInputStream(fs);
        } catch(IOException e) {

        }


        // create a lexer that feeds off of input CharStream
        JavaLexer lexer = new JavaLexer(input);
        lexer.addErrorListener(lexerErrorListener);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        JavaParser parser = new JavaParser(tokens);
        parser.addErrorListener(parserErrorListener);

        ParseTree tree = parser.program(); // begin parsing at program rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        // Symbol table
        SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor();
        symbolTableVisitor.visit(tree);

        // Type checker
        TypeCheckVisitor typeCheckerVisitor = new TypeCheckVisitor(symbolTableVisitor.getClasses(), symbolTableVisitor.getBlockStmts());
        typeCheckerVisitor.visit(tree);
        if(!typeCheckerVisitor.success) {
            System.err.println(typeCheckerVisitor.error);
            System.exit(1);
        }

        // Stack size calculator
        StackSizeCalculator stackSizeCalculator = new StackSizeCalculator();
        stackSizeCalculator.visit(tree);
        for(String method : stackSizeCalculator.methodStackSizes.keySet()) {
            System.out.println("Stack size for method: " + method + " = " + stackSizeCalculator.methodStackSizes.get(method));
        }

        JasminVisitor jasminVisitor = new JasminVisitor(symbolTableVisitor.getClasses(), stackSizeCalculator.methodStackSizes, symbolTableVisitor.variables, symbolTableVisitor.getBlockStmts());
        System.out.println("### Jasmin Visitor ###");
        jasminVisitor.visit(tree);

        saveToFiles(jasminVisitor.jasminCode);
        return TypeCheckVisitor.success;
    }

    private static void saveToFiles(String code) {
        String filePath = "./";

        String[] javaClasses = code.split("===");

        for(String javaClass : javaClasses) {
            String className = null;
            for(String line : javaClass.split("\n")) {
                if(line.startsWith(".class"))
                    className = line.split(" ")[1];
            }

            if(className != null) {
                try {
                    File f = new File(filePath + className + ".j");
                    if(f.exists()) {
                        f.delete();
                    }
                    f.createNewFile();

                    BufferedWriter writer = null;
                    writer = new BufferedWriter(new FileWriter(filePath + className + ".j"));
                    writer.write(javaClass);
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }
    }
}
