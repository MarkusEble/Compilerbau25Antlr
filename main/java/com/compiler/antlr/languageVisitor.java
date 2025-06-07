// Generated from c:/git/Compilerbau25/src/main/antlr4/language.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by the {@code exprSumOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumOp(languageParser.ExprSumOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(languageParser.ExprNumberContext ctx);
}