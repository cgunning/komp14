package mjc.visitors;

import mjc.models.BlockStmt;
import mjc.models.JavaMethod;
import org.antlr.v4.runtime.misc.NotNull;
import mjc.JavaBaseVisitor;
import mjc.JavaParser;
import mjc.JavaVisitor;
import mjc.models.JavaClass;
import mjc.models.JavaType;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by christoffergunning on 4/15/14.
 */
public class StackSizeCalculator extends JavaBaseVisitor {

    Stack<String> stack = new Stack<>();
    String currentMethodName;
    String currentClassName;
    TypeCheckVisitor typeCheckVisitor;
    HashMap<String, JavaClass> classes;
    HashMap<Integer, BlockStmt> blockStmts;

    public HashMap<String, Integer> methodStackSizes = new HashMap<>();
    private BlockStmt currentBlockStmt;

    public StackSizeCalculator(TypeCheckVisitor typeCheckVisitor, HashMap<String, JavaClass> classes, HashMap<Integer, BlockStmt> blockStmts) {
        this.typeCheckVisitor = typeCheckVisitor;
        this.classes = classes;
        this.blockStmts = blockStmts;
    }

    @Override
    public Object visitMainClass(@NotNull JavaParser.MainClassContext ctx) {
        currentClassName = ctx.ID().getText();
        super.visitMainClass(ctx);
        currentClassName = null;
        return null;
    }

    @Override
    public Object visitMainMethod(@NotNull JavaParser.MainMethodContext ctx) {
        currentMethodName = "main";
        int stackInMethod = 0;
        int stackInStmt;

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stackInStmt = (int) stmt.accept(this);
            if(stackInStmt > stackInMethod)
                stackInMethod = stackInStmt;
        }

        methodStackSizes.put(currentClassName + "/" + currentMethodName, stackInMethod);

        return null;
    }

    @Override
    public Object visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx) {
        currentClassName = ctx.ID().getText();
        super.visitClassDecl(ctx);
        currentClassName = null;
        return null;
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {

        currentMethodName = ctx.ID().getText();
        int stackInMethod = 0;
        int stackInStmt;

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stackInStmt = (int) stmt.accept(this);
            if(stackInStmt > stackInMethod)
                stackInMethod = stackInStmt;
        }
        stackInStmt = (int) ctx.exp().accept(this);
        if(classes.get(currentClassName).getMethod(currentMethodName).getReturnType().getType().equals("long"))
            stackInStmt = Math.max(stackInStmt, 2);

        if(stackInStmt > stackInMethod)
            stackInMethod = stackInStmt;

        methodStackSizes.put(currentClassName + "/" + currentMethodName, stackInMethod);

        return null;
    }

    @Override
    public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
        int size1 = (int) ctx.exp().accept(this);
        int size2 = (int) ctx.expList().accept(this);
        System.out.println(size1 + " and " + size2);

        prepareTypeChecker();

        JavaType jt = (JavaType) typeCheckVisitor.visit(ctx.exp());
        JavaType returnType = getMethodFromId(jt.getType(), ctx.ID().getText()).getReturnType();
        if(returnType.getType().equals("long")) {
            return Math.max(size1 + size2, 2);
        } else {
            return size1 + size2;
        }
    }

    @Override
    public Object visitExpList(@NotNull JavaParser.ExpListContext ctx) {
        int size = 0;
        int extraStackCounter = 0;

        prepareTypeChecker();
        if(ctx.exp() != null) {
            size = (int) ctx.exp().accept(this);

            JavaType jt = (JavaType) typeCheckVisitor.visit(ctx.exp());
            if(jt.getType().equals("long"))
                extraStackCounter += 2;
            else
                extraStackCounter += 1;

            for (JavaParser.ExpRestContext expRest : ctx.expRest()) {
                int tmpSize = (int) expRest.exp().accept(this);
                if(tmpSize + extraStackCounter > size) {
                    size = tmpSize + extraStackCounter;
                }

                jt = (JavaType) typeCheckVisitor.visit(expRest.exp());
                if(jt.getType().equals("long"))
                    extraStackCounter += 2;
                else
                    extraStackCounter += 1;
            }
        }
        return size;
    }

    @Override
    public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        if(size1 > size2)
            return size1 + 1;
        else
            return size2 + 2;
    }

    @Override
    public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
        int size1 = (int) ctx.exp().accept(this);
        int size2 = 1;
        if(size1 > size2)
            return size1;
        else
            return size2 + 1;
    }

    @Override
    public Object visitWhile(@NotNull JavaParser.WhileContext ctx) {
        int stackInWhile = (int) ctx.exp().accept(this);
        int stackInStmt;
        stackInStmt = (int) ctx.stmt().accept(this);
        if(stackInStmt > stackInWhile)
            stackInWhile = stackInStmt;

        return stackInWhile;
    }

    @Override
    public Object visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx) {
        currentBlockStmt = blockStmts.get(ctx.getStart().getLine());

        int stackInBlockStmt = 0;
        int stackInStmt;
        BlockStmt before = currentBlockStmt;
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stackInStmt = (int) stmt.accept(this);
            if(stackInStmt > stackInBlockStmt)
                stackInBlockStmt = stackInStmt;
        }

        currentBlockStmt = before.getSuperBlock();
        return stackInBlockStmt;
    }

    @Override
    public Object visitIf(@NotNull JavaParser.IfContext ctx) {
        int stackInIf = (int) ctx.exp().accept(this);
        int stackInStmt;
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            stackInStmt = (int) stmt.accept(this);
            if(stackInStmt > stackInIf)
                stackInIf = stackInStmt;
        }

        return stackInIf;
    }

    @Override
    public Object visitAnd(@NotNull JavaParser.AndContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        if(size1 > size2)
            return size1;
        else
            return size2 + 1;
    }

    @Override
    public Object visitParExp(@NotNull JavaParser.ParExpContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitLongLit(@NotNull JavaParser.LongLitContext ctx) {
        return 2;
    }

    @Override
    public Object visitNotExp(@NotNull JavaParser.NotExpContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitEquals(@NotNull JavaParser.EqualsContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);
        System.out.println("Got " + size1 + " and " + size2 + " from " + ctx.getText());

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);

        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitArrAccess(@NotNull JavaParser.ArrAccessContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        if(size1 < 3 && size2 < 3)
            return 3;
        else if(size1 > size2)
            return size1;
        else
            return size2 + 1;
    }

    @Override
    public Object visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitNewLongArr(@NotNull JavaParser.NewLongArrContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitNewObject(@NotNull JavaParser.NewObjectContext ctx) {
        return 2;
    }

    @Override
    public Object visitSout(@NotNull JavaParser.SoutContext ctx) {
        return 1 + (int) ctx.exp().accept(this);
    }

    @Override
    public Object visitIntLit(@NotNull JavaParser.IntLitContext ctx) {
        return 1;
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);
        System.out.println("Got " + size1 + " and " + size2 + " from " + ctx.getText());

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);

        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitSub(@NotNull JavaParser.SubContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        if(ctx.getText().equals("n-1"))
            System.out.println(size1 + " - " + size2);
        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitOr(@NotNull JavaParser.OrContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        if(size1 > size2)
            return size1;
        else
            return size2 + 1;
    }

    @Override
    public Object visitLessThanOrEqual(@NotNull JavaParser.LessThanOrEqualContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
        int size1 = (int) ctx.exp(0).accept(this);
        int size2 = (int) ctx.exp(1).accept(this);
        System.out.println("Got sizes " + size1 + " and " + size2 + " in " + ctx.getText());

        prepareTypeChecker();
        JavaType jt1 = (JavaType) typeCheckVisitor.visit(ctx.exp(0));
        JavaType jt2 = (JavaType) typeCheckVisitor.visit(ctx.exp(1));
        if(jt1.getType().equals("long") && jt2.getType().equals("int"))
            size2 = Math.max(size2, 2);
        if(jt1.getType().equals("int") && jt2.getType().equals("long"))
            size1 = Math.max(size1, 2);
        if(size1 > size2)
            return size1;
        else {
            if(jt1.getType().equals("long"))
                return size2 + 2;
            return size2 + 1;
        }
    }

    @Override
    public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
        JavaType jt = getVariableFromId(ctx.ID().getText());

        int size = (int) ctx.exp().accept(this);
        if(jt.isClassVariable())
            size += 1;
        return size;
    }

    @Override
    public Object visitFalse(@NotNull JavaParser.FalseContext ctx) {
        return 1;
    }

    @Override
    public Object visitThis(@NotNull JavaParser.ThisContext ctx) {
        return 1;
    }

    @Override
    public Object visitTrue(@NotNull JavaParser.TrueContext ctx) {
        return 1;
    }

    @Override
    public Object visitId(@NotNull JavaParser.IdContext ctx) {
        return getStackSizeForId(ctx.ID().getText());
    }

    private int getStackSizeForId(String ID) {
        int size;
        JavaType jt = getVariableFromId(ID);
        if(jt.getType().equals("long"))
            size = 2;
        else
            size = 1;

        if(jt.isClassVariable())
            size += 1;
        return size;
    }

    private JavaType getVariableFromId(String ID) {
        JavaType jt = null;
        JavaClass jc = classes.get(currentClassName);
        JavaMethod jm = jc.getMethod(currentMethodName);

        BlockStmt bs = currentBlockStmt;

        if(bs != null) {
            jt = bs.getVariable(ID);
        }

        while(bs != null && jt == null) {
            jt = bs.getVariable(ID);
            bs = bs.getSuperBlock();
        }

        if(jm != null && jt == null) {
            for (int i = 0; i < jm.getArguments().size(); i++) {
                if (jm.getArgument(i).getID().equals(ID)) {
                    return jm.getArgument(i);
                }
            }
            jt = jm.getVariable(ID);
        }

        if(jt == null)
            jt = jc.getVariable(ID);

        if(jt == null) {
            while(jc.getSuperClass() != null && jt == null) {

                jc = classes.get(jc.getSuperClass());
                jt = jc.getVariable(ID);
            }
        }
        return jt;
    }

    private JavaMethod getMethodFromId(String classID, String methodID) {
        JavaClass jc = classes.get(classID);
        JavaMethod jm = jc.getMethod(methodID);

        while(jm == null) {
            if(jc.getSuperClass() == null)
                break;
            jc = classes.get(jc.getSuperClass());
            jm = jc.getMethod(methodID);
        }

        return jm;
    }

    private void prepareTypeChecker() {
        typeCheckVisitor.currentClass = classes.get(currentClassName);
        typeCheckVisitor.currentMethod = classes.get(currentClassName).getMethod(currentMethodName);
        typeCheckVisitor.currentBlockStmt = currentBlockStmt;
    }
}
