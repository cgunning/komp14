package se.cgunning.java.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaVariable;

import java.util.HashMap;

/**
 * Created by christoffergunning on 3/28/14.
 */
public class TypeCheckVisitor extends JavaBaseVisitor {

    private JavaClass currentClass = null;
    private JavaMethod currentMethod = null;
    HashMap<String, JavaClass> classes = new HashMap<String, JavaClass>();

    public TypeCheckVisitor(HashMap<String, JavaClass> classes) {
        this.classes = classes;
    }

    @Override
    public Object visitPackageDecl(@NotNull JavaParser.PackageDeclContext ctx) {
        return super.visitPackageDecl(ctx);
    }

    @Override
    public Object visitBrackExp(@NotNull JavaParser.BrackExpContext ctx) {
        return super.visitBrackExp(ctx);
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        return super.visitLessThan(ctx);
    }

    @Override
    public Object visitExpRest(@NotNull JavaParser.ExpRestContext ctx) {
        return super.visitExpRest(ctx);
    }

    @Override
    public Object visitVarDecl(@NotNull JavaParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Object visitType(@NotNull JavaParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        currentClass = classes.get(ctx.CLASSID().getText());

        return super.visitClassDecl(ctx);
    }

    @Override
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return super.visitThis(ctx);
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return super.visitFalse(ctx);
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        return super.visitNewIntArr(ctx);
    }

    @Override
    public Object visitFormalList(@NotNull JavaParser.FormalListContext ctx) {
        return super.visitFormalList(ctx);
    }

    @Override
    public Object visitExpList(@NotNull JavaParser.ExpListContext ctx) {
        return super.visitExpList(ctx);
    }

    @Override
    public Object visitMainClass(@NotNull JavaParser.MainClassContext ctx) {
        return super.visitMainClass(ctx);
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        return super.visitAdd(ctx);
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        currentMethod = currentClass.getMethod(ctx.ID().getText());
        ctx.
        currentMethod = null;
        return super.visitMethodDecl(ctx);
    }

    @Override
    public Object visitFormalRest(@NotNull JavaParser.FormalRestContext ctx) {
        return super.visitFormalRest(ctx);
    }

    @Overridectx.accept();
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        return super.visitSub(ctx);
    }

    @Override
    public Object visitOp(@NotNull JavaParser.OpContext ctx) {
        return super.visitOp(ctx);
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        return super.visitNotExp(ctx);
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {

        return super.visitIntLit(ctx);
    }

    @Override
    public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
        System.out.println("HALALLALALA");
        JavaVariable jv = null;
        if(currentMethod != null)
            jv = currentMethod.getVariable(ctx.ID().getText());

        if(jv == null)
            jv = currentClass.getVariable(ctx.ID().getText());

        if(jv == null)
            System.out.println("Variabeln finns inte i scope");

        return super.visitArrAssign(ctx);
    }

    @Override
    public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
        JavaVariable jv = null;
        if(currentMethod != null)
            jv = currentMethod.getVariable(ctx.ID().getText());

        if(jv == null)
            jv = currentClass.getVariable(ctx.ID().getText());

        if(jv == null)
            System.out.println("Variabeln finns inte i scope");
        return super.visitAssign(ctx);
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        return super.visitProd(ctx);
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        return super.visitNewObject(ctx);
    }

    @Override
    public Object visitProgram(@NotNull JavaParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return super.visitTrue(ctx);
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
        return super.visitDotLength(ctx);
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return super.visitParExp(ctx);
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        return super.visitAnd(ctx);
    }
}
