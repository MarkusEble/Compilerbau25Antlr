// Generated from /Users/i587961/Documents/Compilerbau25Antlr/language.g4 by ANTLR 4.13.2
package com.compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code exprCmpOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCmpOp(languageParser.ExprCmpOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSumOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumOp(languageParser.ExprSumOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprQm}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprQm(languageParser.ExprQmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnaryOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryOp(languageParser.ExprUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(languageParser.ExprNumberContext ctx);
}