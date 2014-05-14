package se.cgunning.java.visitors;

import com.sun.org.apache.xpath.internal.SourceTree;
import jasmin.Main;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.models.BlockStmt;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaType;

import java.util.HashMap;

/**
 * Created by christoffergunning on 3/28/14.
 */
public class TypeCheckVisitor extends JavaBaseVisitor {

    public static boolean success = true;

    public JavaClass currentClass = null;
    public JavaMethod currentMethod = null;
    private BlockStmt currentBlockStmt = null;
    public String error = "";
    HashMap<String, JavaClass> classes;
    HashMap<Integer, BlockStmt> blockStmts;

    public TypeCheckVisitor(HashMap<String, JavaClass> classes, HashMap<Integer, BlockStmt> blockStmts) {
        this.classes = classes;
        this.blockStmts = blockStmts;
    }

    @Override
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return new JavaType(null, currentClass.getID(), ctx.getStart().getLine());
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);
        if(jt1 == null || jt2 == null)
            return null;

        if(jt1.equals(jt2) && (jt1.getType().equals("int") || jt1.getType().equals("long")))
            return new JavaType(null, "boolean", ctx.getStart().getLine());

        addError(ctx, "Invalid types in less than : " + jt1.getType() + " and " + jt2.getType());
        return null;
    }

    @Override
    public Object visitEquals(@NotNull JavaParser.EqualsContext ctx) {
        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);
        if(jt1 == null || jt2 == null)
            return null;
        if(isCompatibleTypes(jt1, jt2) || isCompatibleTypes(jt2, jt1))
            return new JavaType(null, "boolean", ctx.getStart().getLine());

        addError(ctx, "Incompatible types: " + jt1.getType() + " and " + jt2.getType());
        return null;
    }

    @Override
    public Object visitType(@NotNull JavaParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        JavaClass jc = null;
        JavaType jcType = null;

        jcType = (JavaType) ctx.exp().accept(this);
        if(jcType == null)
            return null;

        jc = classes.get(jcType.getType());

        if(jc == null) {
            addError(ctx, "No such class");
            return null;
        }

        JavaMethod jm = jc.getMethod(ctx.ID().getText());
        if(jm == null) {
            String superClass = jc.getSuperClass();
            while(superClass != null) {
                JavaClass tmpJC = classes.get(superClass);
                if(tmpJC == null)
                    break;

                jm = tmpJC.getMethod(ctx.ID().getText());
                if(jm != null)
                    break;
                superClass = classes.get(superClass).getSuperClass();
            }
        }
        if(jm == null) {
            addError(ctx, "No such method");
            return null;
        }

        int index = 0;
        HashMap<Integer, JavaType> arguments = jm.getArguments();
        // Kolla argument
        JavaParser.ExpListContext el = ctx.expList();

        if(el.exp() != null) {
            JavaType jt = (JavaType) el.exp().accept(this);

            // Checking arguments
            if (!isCompatibleTypes(arguments.get(index++), jt)) {
                addError(ctx, "Mismatched arguments");
                return null;
            }
            for (JavaParser.ExpRestContext er : el.expRest()) {
                JavaType jt1 = (JavaType) er.exp().accept(this);
                JavaType jt2 = arguments.get(index++);
                if(jt2 == null) {
                    addError(ctx, "too many arguments to method: " + ctx.ID().getText());
                    return null;
                }
                if (!isCompatibleTypes(jt1, jt2)) {
                    addError(ctx, "Mismatched arguments");
                }
            }
            if(index < arguments.size()) {
                addError(ctx, "too few arguments to method: " + ctx.ID().getText());
                return null;
            }
        }
        if(index != arguments.size()) {
            addError(ctx, "not enough arguments. Got " + index + ", expected " + arguments.size());
        }

        return jm.getReturnType();
    }

    @Override
    public Object visitMainClass(@NotNull JavaParser.MainClassContext ctx) {
        currentClass = classes.get(ctx.ID().getText());

        ctx.mainMethod().accept(this);

        currentClass = null;
        return null;
    }

    @Override
    public Object visitMainMethod(@NotNull JavaParser.MainMethodContext ctx) {

        currentMethod = currentClass.getMethod("main");
        for(JavaParser.VarDeclContext varDecl : ctx.varDecl()) {
            varDecl.accept(this);
        }

        for(JavaParser.StmtContext stmt : ctx.stmt())
            stmt.accept(this);
        currentMethod = null;
        return null;
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        currentClass = classes.get(ctx.ID().getText());

        for(JavaParser.MethodDeclContext methodDecl : ctx.methodDecl()) {
            methodDecl.accept(this);
        }

        currentClass = null;
        return null;
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return new JavaType(null, "boolean", ctx.getStart().getLine());
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        JavaType sizeType = (JavaType) ctx.exp().accept(this);
        if(!sizeType.getType().equals("int")) {
            addError(ctx, "invalid size in array. Expected int, got " + sizeType.getType());
        }
        return new JavaType(null, "int[]", ctx.getStart().getLine());
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);

        if(type1 == null || type2 == null)
            return null;

        if(type1.equals(type2)) {
            return type1;
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "long", 0);
        }

        addError(ctx, "missmatch in type in add with: " + type1.getID() + "(" + type1.getType() + ") and " + type2.getID() + "(" + type2.getType() + ")");
        return null;
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        currentMethod = currentClass.getMethod(ctx.ID().getText());
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stmt.accept(this);
        }
        JavaType returnType = (JavaType) ctx.exp().accept(this);
        if(returnType == null) {
            return null;
        }
        if(!isCompatibleTypes(currentMethod.getReturnType(), returnType)) {
            addError(ctx, "Incorrect return type");
            currentMethod = null;
        }
       // if(Main.DEBUG)
            System.out.println(error);
        return null;
    }

    @Override
    public Object visitIf(@NotNull JavaParser.IfContext ctx) {

        JavaType condition = (JavaType) ctx.exp().accept(this);
        if(condition == null)
            return null;

        if(!condition.getType().equals("boolean")) {
            addError(ctx, "invalid condition in if statement");
            return null;
        }

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stmt.accept(this);
        }

        return null;
    }

    @Override
    public Object visitWhile(@NotNull JavaParser.WhileContext ctx) {
        JavaType condition = (JavaType) ctx.exp().accept(this);
        if(condition == null)
            return null;

        if(!condition.getType().equals("boolean")) {
            addError(ctx, "invalid condition in while statement");
            return null;
        }

        ctx.stmt().accept(this);

        return null;
    }

    @Override
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;
        if(type1.equals(type2)) {
            return type1;
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "long", 0);
        }
        return null;
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        JavaType type = (JavaType) ctx.exp().accept(this);
        if(type == null)
            return null;

        if(!type.getType().equals("boolean")) {
            addError(ctx, "Not boolean in not expression. Got : " + type.getType());
            return null;
        }
        return type;
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {
        try {
            Integer.parseInt(ctx.getText());
        } catch (NumberFormatException e) {
            addError(ctx, "invalid number format");
        }
        return new JavaType(null, "int", ctx.getStart().getLine());
    }

    @Override
    public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null) {
            addError(ctx, "Variabeln finns inte i scope");
            return null;
        }

        if(getSingleTypeFromArray(jt) == null) {
            addError(ctx, "Not an array in assignment");
            return null;
        }

        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        if(jt1 == null) {
            return null;
        }

        if(!jt1.getType().equals("int")) {
            addError(ctx, "Not int in array index");
            return null;
        }

        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);

        if(jt2 == null)
            return null;

        if(!(new JavaType(null, getSingleTypeFromArray(jt), 0)).equals(jt2))
            addError(ctx, "missmatch in type in arr assign");

        return jt;
    }

    @Override
    public Object visitLongLit(@NotNull JavaParser.LongLitContext ctx) {
        return new JavaType(null, "long", ctx.getStart().getLine());
    }

    @Override
    public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null) {
            addError(ctx, "Variabeln " + ctx.ID().getText() + " finns inte i scope");
            return null;
        }

        JavaType jt2 = (JavaType) ctx.exp().accept(this);

        if(jt2 == null) {
            return null;
        }
        if(!isCompatibleTypes(jt, jt2)) {
            addError(ctx, "Missmatch in type in assign with variables: " + jt.getID() + "(" + jt.getType() + ") and " + jt2.getID() + "(" + jt2.getType() + ")");
            return null;
        }
        return jt;
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;
        if(type1.equals(type2)) {
            return type1;
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "long", 0);
        }

        addError(ctx, "Mismatch in type");
        return null;
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        return new JavaType(null, ctx.ID().getText(), ctx.getStart().getLine());
    }

    @Override
    public Object visitProgram(@NotNull JavaParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return new JavaType(null, "boolean", ctx.getStart().getLine());
    }

    @Override
    public Object visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx) {
        currentBlockStmt = blockStmts.get(ctx.getStart().getLine());

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stmt.accept(this);
        }
        currentBlockStmt = currentBlockStmt.getSuperBlock();

        return null;
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        JavaType jt = getVariableIfInScope(ctx.ID().getText());

        if(jt == null) {
            addError(ctx, "Variabeln " + ctx.ID().getText() + " finns inte i scope");
        }
        return jt;
    }

    @Override
    public Object visitSout(@NotNull JavaParser.SoutContext ctx) {
        JavaType type = (JavaType) ctx.exp().accept(this);
        if(type == null) {
            addError(ctx, "Invalid argument to sout");
        }
        return null;
    }

    @Override
    public Object visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx) {
        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);
        if(jt1 == null || jt2 == null)
            return null;
        if(isCompatibleTypes(jt1, jt2) || isCompatibleTypes(jt2, jt1))
            return new JavaType(null, "boolean", ctx.getStart().getLine());

        addError(ctx, "Incompatible types: " + jt1.getType() + " and " + jt2.getType());
        return null;
    }

    @Override
    public Object visitArrAccess(@NotNull JavaParser.ArrAccessContext ctx) {
        // Check that this is an array
        JavaType jt1 = (JavaType) ctx.exp(0).accept(this);
        if(!jt1.getType().contains("[]"))
            addError(ctx, "Array access on non array");

        JavaType jt2 = (JavaType) ctx.exp(1).accept(this);
        if(jt2 == null)
            return null;

        if(!jt2.getType().equals("int"))
            addError(ctx, "Non integer in array access");

        return new JavaType(null, getSingleTypeFromArray(jt1), ctx.getStart().getLine());
    }

    @Override
    public Object visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;

        if(type1.equals(type2) && (type1.getType().equals("int") || type1.getType().equals("long"))) {
            return new JavaType(null, "boolean", 0);
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "boolean", 0);
        }

        addError(ctx, "Mismatch in type in >=");
        return null;
    }

    @Override
    public Object visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;

        if(type1.equals(type2) && (type1.getType().equals("int") || type1.getType().equals("long"))) {
            return new JavaType(null, "boolean", 0);
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "boolean", 0);
        }

        addError(ctx, "Mismatch in type in >");
        return null;
    }

    @Override
    public Object visitNewLongArr(@NotNull JavaParser.NewLongArrContext ctx) {
        JavaType sizeType = (JavaType) ctx.exp().accept(this);
        if(!sizeType.getType().equals("int")) {
            addError(ctx, "invalid size in array. Expected int, got " + sizeType.getType());
        }
        return new JavaType(null, "long[]", ctx.getStart().getLine());
    }

    @Override
    public Object visitLessThanOrEqual(@NotNull JavaParser.LessThanOrEqualContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;

        if(type1.equals(type2) && (type1.getType().equals("int") || type1.getType().equals("long"))) {
            return new JavaType(null, "boolean", 0);
        } else if(type1.getType().equals("int") && type2.getType().equals("long") || type1.getType().equals("long") && type2.getType().equals("int")){
            return new JavaType(null, "boolean", 0);
        }

        addError(ctx, "Mismatch in type in <=");
        return null;
    }

    @Override
    public Object visitOr(@NotNull JavaParser.OrContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;
        if(type1.equals(type2) && type1.getType().equals("boolean")) {
            return type1;
        }

        addError(ctx, "Mismatch in type in or");
        return null;
    }

    @Override
    public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
        JavaType jt = (JavaType) ctx.exp().accept(this);

        if(jt == null)
            return null;

        if(!jt.getType().contains("[]")) {
            addError(ctx, ".length called on non-array: " + jt.getID() + "(" + jt.getType() + ")");
            return null;
        }

        return new JavaType(null, "int", ctx.getStart().getLine());
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return (JavaType) ctx.exp().accept(this);
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        JavaType type1 = (JavaType) ctx.exp(0).accept(this);
        JavaType type2 = (JavaType) ctx.exp(1).accept(this);
        if(type1 == null || type2 == null)
            return null;
        if(!type1.equals(type2) || !type1.getType().equals("boolean")) {
            addError(ctx, "Mismatch in type in and expression. Got " + type1.getID() + "(" + type1.getType() + ") and " + type2.getID() + "(" + type2.getType() + ")");
            return null;
        }

        return type1;
    }

    private JavaType getVariableIfInScope(String ID) {
        JavaType jt = null;
        BlockStmt bs = currentBlockStmt;

        if(bs != null) {
            jt = bs.getVariable(ID);
        }

        while(bs != null && jt == null) {
            jt = bs.getVariable(ID);
            bs = bs.getSuperBlock();
        }

        if(jt == null && currentMethod != null) {
            jt = currentMethod.getVariable(ID);
            if(jt == null) {
                for(int i : currentMethod.getArguments().keySet()) {
                    if(currentMethod.getArgument(i).getID().equals(ID)) {
                        jt = currentMethod.getArgument(i);
                        if (jt != null)
                            break;
                    }
                }
            }
        }

        if(jt == null)
            jt = currentClass.getVariable(ID);

        if(jt == null) {
            if(currentClass.getSuperClass() != null)
                jt = classes.get(currentClass.getSuperClass()).getVariable(ID);
        }

        return jt;
    }

    private String getSingleTypeFromArray(JavaType array) {
        if(array.getType() == null)
            return null;

        if(array.getType().indexOf("[") > 0)
            return array.getType().substring(0, array.getType().indexOf("["));
        else
            return null;
    }

    private void addError(ParserRuleContext ctx, String error) {
        success = false;
        this.error += ctx.getStart().getLine() + " - " + error + "\n";
    }

    private boolean isCompatibleTypes(JavaType jt1, JavaType jt2) {
        if(jt1 == null || jt2 == null)
            System.out.println("#" + jt2.getType());
        if(jt1.equals(jt2))
            return true;

        JavaClass jc = classes.get(jt2.getType());
        if(jc != null) {
            String superClass = jc.getSuperClass();
            while(superClass != null) {
                if(superClass.equals(jt1.getType()))
                    return true;

                superClass = classes.get(superClass).getSuperClass();
            }
        }

        return false;
    }
}
