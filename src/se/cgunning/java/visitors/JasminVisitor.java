package se.cgunning.java.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.models.BlockStmt;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaType;

import java.util.Collections;
import java.util.HashMap;

/**
 * Created by christoffergunning on 4/22/14.
 */
public class JasminVisitor extends JavaBaseVisitor {

    HashMap<String, Integer> offset = new HashMap<>();
    HashMap<String, JavaClass> classes;
    HashMap<Integer, BlockStmt> blockStmts;
    String currentClass;
    String currentMethod;
    boolean firstLabelInStatement;
    int currentLabel = 0;
    int currentOffset;
    public HashMap<String, Integer> methodStackSizes;
    HashMap<String, String> variables = new HashMap<>();
    TypeCheckVisitor typeCheckVisitor;

    public JasminVisitor() {
    }

    public JasminVisitor(HashMap<String, JavaClass> classes, HashMap<String, Integer> methodStackSizes, HashMap<String, String> variables, HashMap<Integer, BlockStmt> blockStmts) {
        this.classes = classes;
        this.methodStackSizes = methodStackSizes;
        this.variables = variables;
        this.typeCheckVisitor = new TypeCheckVisitor(classes, blockStmts);
    }

    @Override
    public Object visitProgram(@NotNull JavaParser.ProgramContext ctx) {
        String s = (String) ctx.mainClass().accept(this);
        for(JavaParser.ClassDeclContext javaClass : ctx.classDecl()) {
            s += javaClass.accept(this);
        }
        s = fixJasminCode(s);
        System.out.println(s);
        return null;
    }

    @Override
    public Object visitMainClass(@NotNull JavaParser.MainClassContext ctx) {
        currentClass = ctx.ID().getText();

        String s = ".class " + ctx.ID().getText() + "\n";
        String superClass = classes.get(ctx.ID().getText()).getSuperClass();
        if(superClass == null) {
            s += ".super java/lang/Object\n";
        } else {
            s += ".super " + superClass + "\n";
        }

        s += getStandardInit();

        s += ctx.mainMethod().accept(this);


        currentClass = null;

        return s;
    }

    @Override
    public Object visitMainMethod(@NotNull JavaParser.MainMethodContext ctx) {
        currentOffset = 0;
        currentMethod = "main";
        offset.put("this", currentOffset++);

        for(JavaParser.VarDeclContext varDecl : ctx.varDecl()) {
            offset.put(varDecl.ID().getText(), currentOffset++);
        }
//        for(String key : offset.keySet()) {
//            System.out.println(key + " - " + offset.get(key));
//        }

        String s = ".method main\n";
        s += ".limit stack " + methodStackSizes.get(currentClass + "/main") + "\n";
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            firstLabelInStatement = true;
            s += (String) stmt.accept(this);
        }
        s += "return\n";
        s += ".end method\n";
        currentMethod = null;
        return s;
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        currentClass = ctx.ID().getText();

        String s = ".class " + ctx.ID().getText() + "\n";
        String superClass = classes.get(ctx.ID().getText()).getSuperClass();
        if(superClass == null) {
            s += ".super java/lang/Object\n";
        } else {
            s += ".super " + superClass + "\n";
        }


        s += getStandardInit();

        for(JavaParser.MethodDeclContext method : ctx.methodDecl()) {
            s += method.accept(this);
        }

        currentClass = null;

        return s;
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        currentOffset = 0;
        currentMethod = ctx.ID().getText();
        offset.put("this", currentOffset++);
        String s = ".method " + ctx.ID().getText() + "(";

        if(ctx.formalList() != null) {
            offset.put(ctx.formalList().ID().getText(), currentOffset++);
            s += getDescriptorFromType(classes.get(currentClass).getMethod(currentMethod).getArgument(0).getType());

            int i = 1;
            for (JavaParser.FormalRestContext formalRest : ctx.formalList().formalRest()) {
                offset.put(formalRest.ID().getText(), currentOffset++);
                s += getDescriptorFromType(classes.get(currentClass).getMethod(currentMethod).getArgument(i).getType());
                i++;
            }
        }

        s += ")";
        s += getDescriptorFromType(classes.get(currentClass).getMethod(currentMethod).getReturnType().getType());
        s += "\n";

        for(JavaParser.VarDeclContext varDecl : ctx.varDecl()) {
            offset.put(varDecl.ID().getText(), currentOffset++);
        }
//        for(String key : offset.keySet()) {
//            System.out.println(key + " - " + offset.get(key));
//        }


        s += ".limit stack " + methodStackSizes.get(currentClass + "/" + ctx.ID().getText()) + "\n";
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            firstLabelInStatement = true;
            s += (String) stmt.accept(this);
        }
        s += ctx.exp().accept(this);
        s += "ireturn\n";
        s += ".end method\n";
        currentMethod = null;
        return s;
    }

    @Override
    public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
        String s = (String) ctx.exp().accept(this);

        s += "istore " + offset.get(ctx.ID().getText()) + "\n";
        return s;
    }

    @Override
    public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
        return ctx.exp(1).accept(this);
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        return ctx.exp().accept(this) + "newarray int\n";
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        typeCheckVisitor.currentClass = classes.get(currentClass);
        typeCheckVisitor.currentMethod = classes.get(currentClass).getMethod(currentMethod);
        String s = (String) ctx.exp().accept(this);
        String currentClassToCall = ((JavaType) typeCheckVisitor.visit(ctx.exp())).getType();
        String returnType = classes.get(currentClassToCall).getMethod(ctx.ID().getText()).getReturnType().getType();

        if(ctx.expList() != null) {
            s += ctx.expList().exp().accept(this);
            for(JavaParser.ExpRestContext expRest : ctx.expList().expRest()) {
                s += expRest.exp().accept(this);
            }
        }
        s += "invokevirtual " + currentClassToCall + "/" + ctx.ID().getText() + "(";

        if(ctx.expList() != null) {
            JavaType jt = (JavaType) typeCheckVisitor.visit(ctx.expList().exp());
            s += getDescriptorFromType(jt.getType());
            for(JavaParser.ExpRestContext expRest : ctx.expList().expRest()) {
                jt = (JavaType) typeCheckVisitor.visit(expRest.exp());
                s += getDescriptorFromType(jt.getType());
            }
        }

        s += ")" + getDescriptorFromType(returnType) + "\n";

        return s;
    }


    @Override
    public Object visitIf(@NotNull JavaParser.IfContext ctx) {
        String s = (String) ctx.exp().accept(this);
        s += "ifcmple label" + ++currentLabel + "\n";
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            s += stmt.accept(this);
        }

        s += "label" + currentLabel + "\n";
        s += "goto label" + currentLabel+1 + "\n";
        s += "label" + ++currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitWhile(@NotNull JavaParser.WhileContext ctx) {
        int beforeWhileLabel = ++currentLabel;
        String s = "label" + beforeWhileLabel + ":\n";
        s += ctx.exp().accept(this);
        s += "ifeq label" + ++currentLabel + "\n";
        s += ctx.stmt().accept(this);
        s += "goto label" + beforeWhileLabel + "\n";
        s += "label" + currentLabel + ":\n";
        return s;
    }

    @Override
    public Object visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx) {
        String s = "";

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            s += stmt.accept(this);
        }
        return s;
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        String s = "new " + ctx.ID() + "\n";
        s += "dup\n";
        s += "invokespecial Test/<init>()V";
        return s;
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        String s = "";
        s += (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "iadd\n";
        return s;
    }

    @Override
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        String s = "";
        s += (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "isub\n";
        return s;
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        String s = "";
        s += (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "imul\n";
        return s;
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {
        return "bipush " + ctx.INT_LIT().getText() + "\n";
    }

    @Override
    public Object visitLongLit(@NotNull JavaParser.LongLitContext ctx) {
        return "bipush " + ctx.LONG_LIT().getText() + "\n";
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        System.out.println("Getting offset for " + ctx.ID().getText());
        JavaType jt = getVariableFromId(ctx.ID().getText());
        switch(jt.getType()) {
            case "int":
                return "iload " + offset.get(ctx.ID().getText()) + "\n";
            case "long":
                return "lload " + offset.get(ctx.ID().getText()) + "\n";
            default:
                return "aload " + offset.get(ctx.ID().getText()) + "\n";
        }

    }

    @Override
    public Object visitSout(@NotNull JavaParser.SoutContext ctx) {
        typeCheckVisitor.currentClass = classes.get(currentClass);
        typeCheckVisitor.currentMethod = classes.get(currentClass).getMethod(currentMethod);
        String s = "";

        s += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        s += (String) ctx.exp().accept(this);
        s += "invokevirtual java/io/PrintStream/println(";
        String argumentType = ((JavaType) typeCheckVisitor.visit(ctx.exp())).getType();
        s += getDescriptorFromType(argumentType);
        s += ")V\n";
        return s;
    }

    @Override
    public Object visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        return "ineg\n";
    }

    @Override
    public Object visitOr(@NotNull JavaParser.OrContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitLessThanOrEqual(@NotNull JavaParser.LessThanOrEqualContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitEquals(@NotNull JavaParser.EqualsContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        String s = (String) ctx.exp(0).accept(this);
        s += (String) ctx.exp(1).accept(this);
        s += "if label" + ++currentLabel + "\n";
        s += "bipush 0\n";
        s += "goto label" + ++currentLabel + "\n";
        s += "label" + (currentLabel - 1) + "\n";
        s += "bipush 1\n";
        s += "label" + currentLabel + "\n";
        return s;
    }

    @Override
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return "aload 0\n";
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return "bipush 0\n";
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return "bipush 1\n";
    }

    private String getStandardInit() {
        return ".method public <init>()V\n" +
                "aload_0\n" +
                "invokenonvirtual java/lang/Object/<init>()V\n" +
                "return\n" +
                ".end method\n";
    }

    private JavaType getVariableFromId(String ID) {
        JavaClass jc = classes.get(currentClass);
        JavaMethod jm = jc.getMethod(currentMethod);
        System.out.println("got method " + jm + " for " + currentMethod);
        JavaType jt = null;
        if(jm != null) {
            for (int i = 0; i < jm.getArguments().size(); i++) {
                if (jm.getArgument(i).getID().equals(ID)) {
                    return jm.getArgument(i);
                }
            }
            jt = jm.getVariable(ID);
        }

        if(jt == null)
            jt = jc.getVariable(ID);

        return jt;
    }

    private String getDescriptorFromType(String type) {
        switch(type) {
            case "int":
                return "I";
            case "long":
                return  "J";
            case "int[]":
                return "[I";
            case "long[]":
                return "[J";
            case "boolean":
                return "Z";
            default:
                return "L" + type;
        }
    }

    private String fixJasminCode(String jasminCode) {
        String[] lines = jasminCode.split("\n");
        String returnString = "";

        for(String s : lines) {
            if(s.startsWith(".class") || s.startsWith(".super") || s.startsWith(".end"))
                returnString += s + "\n";
            else if(s.startsWith(".method"))
                returnString += "\n" + s +"\n";
            else
                returnString += "\t" + s + "\n";
        }

        return returnString;
    }
}

