// Generated from D:/tk_01/IDEA project location/SimpleLanguage/src/main/java/org/example/antlr\WS.g4 by ANTLR 4.9.1
package org.example.main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WSParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(WSParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSParser#wsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsClass(WSParser.WsClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(WSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WSParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(WSParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wsFunctionCall}
	 * labeled alternative in {@link WSParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsFunctionCall(WSParser.WsFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(WSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(WSParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(WSParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(WSParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(WSParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(WSParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(WSParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(WSParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link WSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(WSParser.NotExpressionContext ctx);
}