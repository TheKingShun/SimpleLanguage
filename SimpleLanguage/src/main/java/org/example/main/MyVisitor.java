package org.example.main;

import org.example.main.antlr.WSBaseVisitor;
import org.example.main.antlr.*;

import java.util.Map;

/**
 * @author HDU_WS
 * @Classname MyVisitor
 * @Description TODO
 * @Date 2021/8/13 18:08
 * @Created by TheKing_Shun
 */

public class MyVisitor extends WSBaseVisitor<WSValue> {

    private Scope scope;
    private Map<String, Function> functions;

    public MyVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    @Override
    public WSValue visitParse(WSParser.ParseContext ctx) {
        return super.visitParse(ctx);
    }

    // wsClass
    // : ClassDef Identifier '{' block '}'
    // ;
    @Override
    public WSValue visitWsClass(WSParser.WsClassContext ctx) {
        scope = new Scope(this.scope, false);
        this.visit(ctx.block());
        return WSValue.VOID;
    }

    // block
    // : (statement)*
    // ;
    @Override
    public WSValue visitBlock(WSParser.BlockContext ctx) {
        for (WSParser.StatementContext sx : ctx.statement()) {
            this.visit(sx);
        }
        scope = scope.parent();
        return WSValue.VOID;
    }

    @Override
    public WSValue visitStatement(WSParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    // assignment
    // : Identifier indexes? '=' expression
    // ;
    @Override
    public WSValue visitAssignment(WSParser.AssignmentContext ctx) {
        WSValue newVal = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();
        scope.assign(id,newVal);
        return WSValue.VOID;
    }

    @Override
    public WSValue visitPrintFunctionCall(WSParser.PrintFunctionCallContext ctx) {
        WSValue ret = this.visit(ctx.expression());
        if (ret.isNumber()) {
            if (ret.asDouble() % 1 < 0.0000001) {
                System.out.println(ret.asDouble().intValue());
            } else {
                System.out.println(ret.asDouble());
            }
        } else {
            System.out.println(ret);
        }

        return WSValue.VOID;
    }

    @Override
    public WSValue visitWsFunctionCall(WSParser.WsFunctionCallContext ctx) {
        return super.visitWsFunctionCall(ctx);
    }

    // '-' expression
    @Override
    public WSValue visitUnaryMinusExpression(WSParser.UnaryMinusExpressionContext ctx) {
        WSValue value = this.visit(ctx.expression());
        if (!value.isNumber()) {
            throw new RuntimeException("?");
        } else {
            return new WSValue(-1 * value.asDouble());
        }
    }

    // expression '^' expression
    @Override
    public WSValue visitPowerExpression(WSParser.PowerExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (!lhs.isNumber() || !rhs.isNumber()) {
            throw new EvalException(ctx);
        } else {
            return new WSValue(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
    }

    // string
    @Override
    public WSValue visitStringExpression(WSParser.StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        return new WSValue(text);
    }

    @Override
    public WSValue visitBoolExpression(WSParser.BoolExpressionContext ctx) {
        return super.visitBoolExpression(ctx);
    }

    // expression op=( '+' | '-' ) expression
    @Override
    public WSValue visitAddExpression(WSParser.AddExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case WSLexer.Add:
                return add(ctx);
            case WSLexer.Subtract:
                return sub(ctx);
            default:
                throw new RuntimeException("???");
        }
    }

    private WSValue sub(WSParser.AddExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new WSValue(lhs.asDouble() - rhs.asDouble());
        }
        throw new RuntimeException();
    }

    private WSValue add(WSParser.AddExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (lhs == null || rhs == null) {
            throw new RuntimeException();
        }


        if (lhs.isNumber() && rhs.isNumber()) {
            return new WSValue(lhs.asDouble() + rhs.asDouble());
        }

        if (lhs.isString()) {
            if (rhs.isNumber()) {
                rhs = rhs.asDouble() % 1 < 0.0000001 ? new WSValue(rhs.asDouble().intValue()) : new WSValue(rhs.asDouble());
            }
            return new WSValue(lhs.asString() + rhs.toString());
        }
        throw new RuntimeException("?");

    }

    @Override
    public WSValue visitNumberExpression(WSParser.NumberExpressionContext ctx) {
        return new WSValue(Double.parseDouble(ctx.getText()));
    }

    // Identifier
    @Override
    public WSValue visitIdentifierExpression(WSParser.IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        WSValue val = scope.resolve(id);

        return val;
    }

    // expression op=( '*' | '/' | '%' ) expression
    @Override
    public WSValue visitMultExpression(WSParser.MultExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case WSLexer.Multiply:
                return multiply(ctx);
            case WSLexer.Divide:
                return divide(ctx);
            case WSLexer.Modulus:
                return modulus(ctx);
            default:
                throw new RuntimeException("???");
        }
    }

    // a % b;
    private WSValue modulus(WSParser.MultExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new WSValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // a / b;
    private WSValue divide(WSParser.MultExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (!lhs.isNumber() || !rhs.isNumber()) {
            throw new EvalException(ctx);
        }
        return new WSValue(lhs.asDouble() / rhs.asDouble());
    }

    // a * b;
    private WSValue multiply(WSParser.MultExpressionContext ctx) {
        WSValue lhs = this.visit(ctx.expression(0));
        WSValue rhs = this.visit(ctx.expression(1));
        if (lhs == null || rhs == null) {
            throw new EvalException(ctx);
        }

        if (lhs.isNumber() && rhs.isNumber()) {
            return new WSValue(lhs.asDouble() * rhs.asDouble());
        }

        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder sb = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                sb.append(lhs.asString());
            }
            return new WSValue(sb.toString());
        }
        throw new EvalException(ctx);
    }

    @Override
    public WSValue visitNotExpression(WSParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }
}
