package se.cgunning.java.visitors;

import org.antlr.v4.runtime.misc.NotNull;
import se.cgunning.java.JavaBaseVisitor;
import se.cgunning.java.JavaParser;
import se.cgunning.java.models.BlockStmt;
import se.cgunning.java.models.JavaClass;
import se.cgunning.java.models.JavaMethod;
import se.cgunning.java.models.JavaType;
import sun.org.mozilla.javascript.ast.Block;

import java.util.ArrayList;
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
            jc.addVariable(v.ID().getText(), new JavaType(v.ID().getText() ,v.type().getText(), ctx.getStart().getLine()));
            variables.put(ctx.ID().getText() + "/" + v.ID().getText(), v.type().getText());
        }
        for(JavaParser.MethodDeclContext m : ctx.methodDecl()) {
            jc.addMethod(m.ID().getText(), (JavaMethod) m.accept(this));
        }
        classes.put(jc.getID(), jc);
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
        return null;
    }

    @Override
    public Object visitMainMethod(@NotNull JavaParser.MainMethodContext ctx) {
        JavaMethod jm = new JavaMethod("main");
        for(JavaParser.VarDeclContext v : ctx.varDecl()) {
            jm.addVariable(v.ID().getText(), new JavaType(v.ID().getText(), v.type().getText(), ctx.getStart().getLine()));
        }

        for(JavaParser.StmtContext stmt : ctx.stmt()) {
            Object o = stmt.accept(this);

            if(o instanceof BlockStmt) {
                jm.addBlockStmt((BlockStmt) o);
            }
        }
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

            if(o instanceof BlockStmt) {
                jm.addBlockStmt((BlockStmt) o);
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
}
