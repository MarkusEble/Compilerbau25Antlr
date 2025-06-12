// Generated from /Users/i589213/Documents/dhbw/semester4/compilerbau/Compilerbau25Antlr/language.g4 by ANTLR 4.13.1
package com.compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code exprMulDivOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivOp(languageParser.ExprMulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMulDivOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivOp(languageParser.ExprMulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSumOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSumOp(languageParser.ExprSumOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSumOp}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSumOp(languageParser.ExprSumOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(languageParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumber}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(languageParser.ExprNumberContext ctx);
}