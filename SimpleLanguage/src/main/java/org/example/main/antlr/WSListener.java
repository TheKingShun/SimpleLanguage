// Generated from D:/tk_01/IDEA project location/SimpleLanguage/src/main/java/org/example/antlr\WS.g4 by ANTLR 4.9.1
package org.example.main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WSParser}.
 */
public interface WSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WSParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(WSParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(WSParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSParser#wsClass}.
	 * @param ctx the parse tree
	 */
	void enterWsClass(WSParser.WsClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSParser#wsClass}.
	 * @param ctx the parse tree
	 */
	void exitWsClass(WSParser.WsClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WSParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WSParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(WSParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(WSParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wsFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterWsFunctionCall(WSParser.WsFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wsFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitWsFunctionCall(WSParser.WsFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(WSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(WSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(WSParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(WSParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(WSParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(WSParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(WSParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(WSParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(WSParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(WSParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(WSParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(WSParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(WSParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(WSParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(WSParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(WSParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(WSParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(WSParser.NotExpressionContext ctx);
}