package se.cgunning.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import se.cgunning.java.visitors.JasminVisitor;
import se.cgunning.java.visitors.StackSizeCalculator;
import se.cgunning.java.visitors.SymbolTableVisitor;
import se.cgunning.java.visitors.TypeCheckVisitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by christoffergunning on 3/26/14.
 */
public class Main {
    static boolean DEBUG = true;

    public static void main(String args[]) {
        if(args.length > 1) {
            if (args.length > 2)
                if(args[1].equals("1"))
                    DEBUG = true;
                else
                    DEBUG = false;
            runTest(args[0], DEBUG);
        } else
            runTest("/home/christoffergunning/workspace/miniJava/src/se/cgunning/java/programs/P3.txt", true);

    }

    public static boolean runTest(String path, boolean DEBUG) {

        File file = new File(path);

        System.out.println(file);
        FileInputStream fs = null;

        // create a CharStream that reads from standard input
        ANTLRInputStream input = null;

        try {
            fs = new FileInputStream(file);
            input = new ANTLRInputStream(fs);
        } catch(IOException e) {

        }


        // create a lexer that feeds off of input CharStream
        JavaLexer lexer = new JavaLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at program rule

        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

        SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor();
        System.out.println("### Symbol Table Visitor ###");
        symbolTableVisitor.visit(tree);

        TypeCheckVisitor typeCheckerVisitor = new TypeCheckVisitor(symbolTableVisitor.getClasses(), symbolTableVisitor.getBlockStmts());
        System.out.println("### Type Checker Visitor ###");
        typeCheckerVisitor.visit(tree);

        StackSizeCalculator stackSizeCalculator = new StackSizeCalculator();
        System.out.println("### Stack Size Calculator Visitor ###");
        stackSizeCalculator.visit(tree);
        for(String method : stackSizeCalculator.methodStackSizes.keySet()) {
            System.out.println("Stack size for method: " + method + " = " + stackSizeCalculator.methodStackSizes.get(method));
        }

        JasminVisitor jasminVisitor = new JasminVisitor(symbolTableVisitor.getClasses(), stackSizeCalculator.methodStackSizes, symbolTableVisitor.variables, symbolTableVisitor.getBlockStmts());
        System.out.println("### Jasmin Visitor ###");
        jasminVisitor.visit(tree);

        System.out.println(typeCheckerVisitor.error);
        return TypeCheckVisitor.success;
    }
}
