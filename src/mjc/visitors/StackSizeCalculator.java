    package mjc.visitors;
    
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
        int biggestStackInMethod;
        int stackInMethod;
        String currentMethodName;
        String currentClassName;
    
        public HashMap<String, Integer> methodStackSizes = new HashMap<>();

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
            stackInMethod = 0;
            biggestStackInMethod = 0;

            for(JavaParser.StmtContext stmt : ctx.stmt()) {
                Object o = stmt.accept(this);
                if(o == null)
                    System.out.println(stmt.getText());
                stackInMethod += (int) o;
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
            stackInMethod = 0;
            biggestStackInMethod = 0;
            int stackInStmt;

            for(JavaParser.StmtContext stmt : ctx.stmt()) {
                stackInStmt = (int) stmt.accept(this);
                if(stackInStmt > stackInMethod || stackInMethod == 0)
                    stackInMethod = stackInStmt;
            }
            stackInStmt = (int) ctx.exp().accept(this);
            if(stackInStmt > stackInMethod)
                stackInMethod = stackInStmt;

            methodStackSizes.put(currentClassName + "/" + currentMethodName, stackInMethod * 2);
    
            return null;
        }
    
        @Override
        public Object visitMethodCall(@NotNull JavaParser.MethodCallContext ctx) {
            int size1 = (int) ctx.exp().accept(this);
            int size2 = (int) ctx.expList().accept(this);

            return size1 + size2;
        }
    
        @Override
        public Object visitExpList(@NotNull JavaParser.ExpListContext ctx) {
            int size = 0;
            if(ctx.exp() != null) {
                size += (int) ctx.exp().accept(this);

                for (JavaParser.ExpRestContext expRest : ctx.expRest()) {
                    size += (int) expRest.exp().accept(this);
                }
            }

            return size;
        }

        @Override
        public Object visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            return size1 + size2;
        }

        @Override
        public Object visitDotLength(@NotNull JavaParser.DotLengthContext ctx) {
            return ctx.exp().accept(this);
        }

        @Override
        public Object visitWhile(@NotNull JavaParser.WhileContext ctx) {
            int size1 = (int) ctx.exp().accept(this);
            int size2 = (int) ctx.stmt().accept(this);
            return Math.max(size1, size2);
        }

        @Override
        public Object visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx) {
            int size = 0;

            for(JavaParser.StmtContext stmt : ctx.stmt()) {
                size += (int) stmt.accept(this);
            }
            return size;
        }

        @Override
        public Object visitIf(@NotNull JavaParser.IfContext ctx) {
            int size1 = (int) ctx.exp().accept(this);
            int size2 = 0;
            for(JavaParser.StmtContext stmt : ctx.stmt()) {
                size2 += (int) stmt.accept(this);
            }
            return Math.max(size1, size2);
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

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }

        @Override
        public Object visitArrAccess(@NotNull JavaParser.ArrAccessContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            return size1 + size2;
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
            return 1;
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

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitLessThan(@NotNull JavaParser.LessThanContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitSub(@NotNull JavaParser.SubContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
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

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }
    
        @Override
        public Object visitProd(@NotNull JavaParser.ProdContext ctx) {
            int size1 = (int) ctx.exp(0).accept(this);
            int size2 = (int) ctx.exp(1).accept(this);

            if(size1 > size2)
                return size1;
            else
                return size2 + 1;
        }

        @Override
        public Object visitAssign(@NotNull JavaParser.AssignContext ctx) {
            return ctx.exp().accept(this);
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
            // Borde hantera long också (2)
            return 1;
        }
    }
