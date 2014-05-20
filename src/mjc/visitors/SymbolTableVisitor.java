package mjc.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import mjc.JavaBaseVisitor;
import mjc.JavaParser;
import mjc.models.BlockStmt;
import mjc.models.JavaClass;
import mjc.models.JavaMethod;
import mjc.models.JavaType;
import java.util.HashMap;
import java.util.HashSet;

public class SymbolTableVisitor extends JavaBaseVisitor {

    HashMap<String, JavaClass> classes = new HashMap<String, JavaClass>();
    HashMap<Integer, BlockStmt> blockStmts = new HashMap<>();
    public HashMap<String, String> variables = new HashMap<>();

    public HashMap<String, JavaClass> getClasses() {
        return classes;
    }

    @Override
    public Object visitVarDecl(@NotNull JavaParser.VarDeclContext ctx) {
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
        JavaClass jc = new JavaClass(ctx.ID().getText());

        if(ctx.extendString() != null) {
           jc.setSuperClass(ctx.extendString().ID().getText());
        }

        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            JavaType jt = new JavaType(v.ID().getText() ,v.type().getText(), ctx.getStart().getLine());
            jt.setIsClassVariable();
            jc.addVariable(v.ID().getText(), jt);
            variables.put(ctx.ID().getText() + "/" + v.ID().getText(), v.type().getText());
        }
        for(JavaParser.MethodDeclContext m : ctx.methodDecl()) {
            jc.addMethod(m.ID().getText(), (JavaMethod) m.accept(this));
        }
        if(classes.keySet().contains(jc.getID()))
            System.exit(1);
        classes.put(jc.getID(), jc);
        uglyCheck();
        return null;
    }

    @Override
    public Object visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx) {
        BlockStmt blockStmt = new BlockStmt(ctx.getStart().getLine());

        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            blockStmt.addVariable(v.ID().getText(), new JavaType(v.ID().getText(), v.type().getText(), ctx.getStart().getLine()));
        }

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            Object o = stmt.accept(this);

            if(o instanceof BlockStmt) {
                ((BlockStmt) o).setSuperBlock(blockStmt);
                blockStmt.addBlockStmt((BlockStmt) o);
            } else if(o instanceof HashSet) {
                for(BlockStmt b : (HashSet<BlockStmt>) o) {
                    b.setSuperBlock(blockStmt);
                    blockStmt.addBlockStmt(b);
                }
            }
        }
        blockStmts.put(blockStmt.getID(), blockStmt);
        return blockStmt;
    }

    @Override
    public Object visitWhile(@NotNull JavaParser.WhileContext ctx) {
        return ctx.stmt().accept(this);
    }

    @Override
    public Object visitIf(@NotNull JavaParser.IfContext ctx) {
        HashSet<BlockStmt> blockStmts = new HashSet<>();
        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            Object o = stmt.accept(this);
            if(o instanceof BlockStmt)
                blockStmts.add((BlockStmt) o);
        }
        return blockStmts;
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
        JavaClass jc = new JavaClass(ctx.ID().getText());
        jc.addMethod("main", (JavaMethod) ctx.mainMethod().accept(this));
        classes.put(jc.getID(), jc);
        uglyCheck();
        return null;
    }

    @Override
    public Object visitMainMethod(@NotNull JavaParser.MainMethodContext ctx) {
        if(!ctx.ID(0).getText().equals("main")) {
            System.exit(1);
        }
        JavaMethod jm = new JavaMethod("main");
        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            jm.addVariable(v.ID().getText(), new JavaType(v.ID().getText(), v.type().getText(), ctx.getStart().getLine()));
        }

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            Object o = stmt.accept(this);

            if(o instanceof BlockStmt) {
                BlockStmt block = (BlockStmt) o;
                block.setSuperMethod(jm);
                jm.addBlockStmt(block);
            }
        }
        jm.setMainMethod();
        return jm;
    }

    @Override
    public Object visitAdd(@NotNull JavaParser.AddContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx) {
        JavaMethod jm = new JavaMethod(ctx.ID().getText());
        JavaType jv;

        if(ctx.formalList().ID() != null) {
            jv = new JavaType(ctx.formalList().ID().getText(), ctx.formalList().type().getText(), ctx.getStart().getLine());
            jm.addArgument(ctx.formalList().ID().getText(), jv);
        }

        for(JavaParser.FormalRestContext fr : ctx.formalList().formalRest()) {
            jv = new JavaType(fr.ID().getText(), fr.type().getText(), ctx.getStart().getLine());
            jm.addArgument(fr.ID().getText(), jv);
        }

        jm.setReturnType(new JavaType(null, ctx.type().getText(), ctx.getStart().getLine()));

        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            // Add to variables in jm
            jv = new JavaType(v.ID().getText(), v.type().getText(), ctx.getStart().getLine());
            jm.addVariable(v.ID().getText(), jv);
        }

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            Object o = stmt.accept(this);
            if(o != null) {
            }
            if(o instanceof BlockStmt) {
                BlockStmt block = (BlockStmt) o;
                block.setSuperMethod(jm);
                jm.addBlockStmt(block);
            }
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

    public HashMap<Integer,BlockStmt> getBlockStmts() {
        return blockStmts;
    }

    private void uglyCheck() {
        BlockStmt blockStmt;
        for(int blockID : blockStmts.keySet()) {
            System.out.println("checking block at line " + blockID);
            blockStmt = blockStmts.get(blockID);
            for(String variableID : blockStmt.getVariables().keySet()) {
                System.out.println("checking variable " + variableID + " int block at line " + blockID);

                if(blockStmt.getSuperBlock() == null) {
                    if(blockStmt.getSuperMethod() != null && blockStmt.getSuperMethod().isVariableAlreadyUsed(variableID))
                        System.exit(1);
                }

                BlockStmt currentBlock = blockStmt.getSuperBlock();
                while(currentBlock != null) {
                    if(currentBlock.isVariableAlreadyUsed(variableID))
                        System.exit(1);
                    if(currentBlock.getSuperBlock() == null) {
                        if(currentBlock.getSuperMethod() != null && currentBlock.getSuperMethod().isVariableAlreadyUsed(variableID))
                            System.exit(1);
                    }
                    currentBlock = currentBlock.getSuperBlock();
                }
            }
        }
    }
}
