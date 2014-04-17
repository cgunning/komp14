package se.cgunning.java.others;

import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.JavaVisitor;
import se.cgunning.java.models.JavaClass;

import java.util.HashMap;

/**
 * Created by christoffergunning on 4/15/14.
 */
public class StackSizeCalculator extends JavaBaseVisitor {
    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        ctx.formalList().accept(this);
        ctx.varDecl()

        return super.visitMethodDecl(ctx);
    }
}
