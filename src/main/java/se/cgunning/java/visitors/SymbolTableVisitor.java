package se.cgunning.java.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.Main;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaVariable;

import java.util.HashMap;


public class SymbolTableVisitor extends JavaBaseVisitor {

    HashMap<String, JavaClass> classes = new HashMap<String, JavaClass>();

    public HashMap<String, JavaClass> getClasses() {
        return classes;
    }

    @Override
    public Object visitVarDecl(@NotNull JavaParser.VarDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitPackageDecl(@NotNull JavaParser.PackageDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitBrackExp(@NotNull JavaParser.BrackExpContext ctx) {
        return null;
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        return null;
    }

    @Override
    public Object visitExpRest(@NotNull JavaParser.ExpRestContext ctx) {
        return null;
    }

    @Override
    public Object visitType(@NotNull JavaParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        return null;
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        JavaClass jc = new JavaClass();
        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            JavaVariable jv = new JavaVariable();
            jv.setType(v.type().getText());
            jc.addVariable(v.ID().getText(), jv);
            System.out.println(v.ID().getText());
        }
        for(JavaParser.MethodDeclContext m : ctx.methodDecl()) {
            jc.addMethod(m.ID().getText(), (JavaMethod) visit(m));
        }
        classes.put(ctx.CLASSID().getText(), jc);
        return null;
    }

    @Override
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return null;
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return null;
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        return null;
    }

    @Override
    public Object visitFormalList(@NotNull JavaParser.FormalListContext ctx) {
        return null;
    }

    @Override
    public Object visitExpList(@NotNull JavaParser.ExpListContext ctx) {
        return null;
    }

    @Override
    public Object visitMainClass(@NotNull JavaParser.MainClassContext ctx) {
        return null;
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        JavaMethod jm = new JavaMethod();

        JavaVariable jv = new JavaVariable();
        jv.setType(ctx.formalList().type().getText());
        jm.addArgument(ctx.formalList().ID().getText(), jv);

        for(JavaParser.FormalRestContext fr : ctx.formalList().formalRest()) {
            jv = new JavaVariable();
            jv.setType(fr.type().getText());
            jm.addArgument(fr.ID().getText(), jv);
        }
        // Lägg till argument

        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            // Add to variables in jm
            jv = new JavaVariable();
            jv.setType(v.type().getText());
            jm.addVariable(v.ID().getText(), jv);
        }
        return jm;
    }

    @Override
    public Object visitFormalRest(@NotNull JavaParser.FormalRestContext ctx) {
        return null;
    }

    @Override
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        return null;
    }

    @Override
    public Object visitOp(@NotNull JavaParser.OpContext ctx) {
        return null;
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        return null;
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {
        return null;
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        return null;
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        return null;
    }

    @Override
    public Object visitProgram(@NotNull JavaParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return null;
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        return null;
    }

    @Override
    public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
        return null;
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return null;
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        return null;
    }

    @Override
    public Object visit(@NotNull ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(@NotNull RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(@NotNull TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(@NotNull ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(@NotNull RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
