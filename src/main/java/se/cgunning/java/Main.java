package se.cgunning.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import se.cgunning.java.visitors.SymbolTableVisitor;
import se.cgunning.java.visitors.TypeCheckVisitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by christoffergunning on 3/26/14.
 */
public class Main {
    public static void main(String args[]) {
        File file = new File("/home/christoffergunning/workspace/miniJava/src/main/java/se/cgunning/java/programs/P1.j");
        int j = 0;
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

        SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor();
        TypeCheckVisitor typeCheckerVisitor = new TypeCheckVisitor(symbolTableVisitor.getClasses());
        symbolTableVisitor.visit(tree);
        typeCheckerVisitor.visit(tree);
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
