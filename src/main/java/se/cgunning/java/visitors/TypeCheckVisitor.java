package se.cgunning.java.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.errors.IncompatibleTypesError;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaType;
import se.cgunning.java.models.JavaType;

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
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return currentClass;
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        return super.visitLessThan(ctx);
    }

    @Override
    public Object visitType(@NotNull JavaParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        JavaClass jc = (JavaClass) ctx.exp().accept(this);
        JavaMethod jm = jc.getMethod(ctx.ID().getText());

        if(jm == null)
            System.out.println("ERROR - No such method");

        int index = 0;
        HashMap<Integer, JavaType> arguments = jm.getArguments();
        // Kolla argument
        JavaParser.ExpListContext el = ctx.expList();
        JavaType jt = (JavaType) el.exp().accept(this);
        if(!jt.equals(arguments.get(index++))) {
            System.out.println("ERROR - mismatched arguments");
        }
        for(JavaParser.ExpRestContext er : el.expRest()) {
            JavaType jtt = (JavaType) er.exp().accept(this);
            if(!jtt.equals(arguments.get(index++))) {
                System.out.println("ERROR - mismatched arguments");
            }
        }
        if(index != arguments.size()) {
            System.out.println("ERROR - not enough arguments");
        }

        return jm.getReturnType();
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        currentClass = classes.get(ctx.CLASSID().getText());
        for(JavaParser.VarDeclContext varDecl : ctx.varDecl()) {
            varDecl.accept(this);
        }

        for(JavaParser.MethodDeclContext methodDecl : ctx.methodDecl()) {
            methodDecl.accept(this);
        }

        currentClass = null;
        return null;
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return new JavaType("boolean");
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        return new JavaType("int[]");
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        return super.visitAdd(ctx);
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        currentMethod = currentClass.getMethod(ctx.ID().getText());
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stmt.accept(this);
        }
        JavaType returnType = (JavaType) ctx.exp().accept(this);
        System.out.println(currentMethod.getReturnType());
        System.out.println(returnType);
        if(!currentMethod.getReturnType().equals(returnType))
            System.out.println("ERROR - incorrect return type");
        currentMethod = null;
        return null;
    }

    @Override
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);

        if(!type1.equals(type2)) {
            System.out.println("Mismatch in type");
            return null;
        }

        return type1;
    }

    @Override
    public Object visitOp(@NotNull JavaParser.OpContext ctx) {
        return super.visitOp(ctx);
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        String type = (String) ctx.exp().accept(this);
        if(type != "boolean") {
            System.out.println("Not boolean");
            return null;
        }
        return type;
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {
        return new JavaType("int");
    }

    @Override
    public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null)
            System.out.println("Variabeln finns inte i scope");

        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        if(!jt1.getType().equals("int"))
            System.out.println("ERROR - not int in array index");

        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);

        if(!getSingleTypeFromArray(jt).equals(jt2))
            System.out.println("ERROR - missmatch in type in arr assign");

        return jt;
    }

    @Override
    public Object visitLongLit(@NotNull JavaParser.LongLitContext ctx) {
        return new JavaType("long");
    }

    @Override
    public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null)
            System.out.println("Variabeln finns inte i scope");

        JavaType jt2 = (JavaType) ctx.exp().accept(this);

        if(!jt.equals(jt2))
            System.out.println("ERROR - missmatch in type in assign");

        return jt;
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);

        if(!type1.equals(type2)) {
            System.out.println("Mismatch in type");
            return null;
        }

        return type1;
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        return new JavaType(ctx.ID().getText());
    }

    @Override
    public Object visitProgram(@NotNull JavaParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return new JavaType("boolean");
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null)
            System.out.println("Variabeln finns inte i scope");

        return jt;
    }

    @Override
    public Object visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx) {
        return checkCommonType(ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Object visitArrAccess(@NotNull JavaParser.ArrAccessContext ctx) {
        // Check that this is an array
        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        if(!jt1.getType().contains("[]"))
            System.out.println("ERROR - array access on non array");

        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);
        if(!jt2.getType().equals("int"))
            System.out.println("ERROR - non integer in array access");

        return new JavaType(jt1.getType().substring(0, jt1.getType().indexOf("[")));
    }

    @Override
    public Object visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx) {
        return checkCommonType(ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Object visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx) {
        return checkCommonType(ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Object visitNewLongArr(@NotNull JavaParser.NewLongArrContext ctx) {
        return super.visitNewLongArr(ctx);
    }

    @Override
    public Object visitLessThanOrEqual(@NotNull JavaParser.LessThanOrEqualContext ctx) {
        return checkCommonType(ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Object visitOr(@NotNull JavaParser.OrContext ctx) {
        JavaType type = checkCommonType(ctx.exp(0), ctx.exp(1));

        if(type != null && !type.getType().equals("boolean")) {
            System.out.println("ERROR - not boolean in OR");
        }
        return type;
    }

    @Override
    public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
        return super.visitDotLength(ctx);
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return (JavaType) ctx.exp().accept(this);
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        String type1 = (String) ctx.exp(0).accept(this);
        String type2 = (String) ctx.exp(1).accept(this);

        if(!type1.equals(type2)) {
            System.out.println("Mismatch in type");
            return null;
        }

        return type1;
    }

    private JavaType getVariableIfInScope(String ID) {
        JavaType jt = null;
        if(currentMethod != null)
            jt = currentMethod.getVariable(ID);

        if(jt == null)
            jt = currentClass.getVariable(ID);

        return jt;
    }

    private JavaType getSingleTypeFromArray(JavaType array) {
        return new JavaType(array.getType().substring(0, array.getType().indexOf("[")));
    }

    private JavaType checkCommonType(JavaParser.ExpContext exp1, JavaParser.ExpContext exp2) {
        JavaType type1 = (JavaType) exp1.accept(this);
        JavaType type2 = (JavaType) exp2.accept(this);

        if(!type1.equals(type2)) {
            System.out.println("Mismatch in type");
            return null;
        }

        return type1;
    }
}
