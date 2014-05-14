// Generated from Java.g4 by ANTLR 4.2

  package se.cgunning.java;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#NotEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(@NotNull JavaParser.NotEqualsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#LessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(@NotNull JavaParser.LessThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#expRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRest(@NotNull JavaParser.ExpRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull JavaParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ArrAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAssign(@NotNull JavaParser.ArrAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ArrAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAccess(@NotNull JavaParser.ArrAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#MethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull JavaParser.MethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull JavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#This}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(@NotNull JavaParser.ThisContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(@NotNull JavaParser.ClassDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#False}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(@NotNull JavaParser.FalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#NewIntArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntArr(@NotNull JavaParser.NewIntArrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalList(@NotNull JavaParser.FormalListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#GreaterThanOrEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(@NotNull JavaParser.GreaterThanOrEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull JavaParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#expList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpList(@NotNull JavaParser.ExpListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull JavaParser.MainClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#GreaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(@NotNull JavaParser.GreaterThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull JavaParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(@NotNull JavaParser.MethodDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull JavaParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#BlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(@NotNull JavaParser.BlockStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#formalRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalRest(@NotNull JavaParser.FormalRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull JavaParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(@NotNull JavaParser.MainMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#NotExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(@NotNull JavaParser.NotExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#LongLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLit(@NotNull JavaParser.LongLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#IntLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull JavaParser.IntLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#extendString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendString(@NotNull JavaParser.ExtendStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(@NotNull JavaParser.ProdContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#NewLongArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLongArr(@NotNull JavaParser.NewLongArrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#NewObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(@NotNull JavaParser.NewObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#LessThanOrEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqual(@NotNull JavaParser.LessThanOrEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull JavaParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull JavaParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#True}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(@NotNull JavaParser.TrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Sout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSout(@NotNull JavaParser.SoutContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(@NotNull JavaParser.EqualsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#Id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull JavaParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#DotLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLength(@NotNull JavaParser.DotLengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#ParExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(@NotNull JavaParser.ParExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull JavaParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull JavaParser.AndContext ctx);
}