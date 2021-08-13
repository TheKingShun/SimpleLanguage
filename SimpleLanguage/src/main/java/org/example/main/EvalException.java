package org.example.main;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author HDU_WS
 * @Classname EvalException
 * @Description TODO
 * @Date 2021/8/13 18:13
 * @Created by TheKing_Shun
 */

public class EvalException extends RuntimeException{
    public EvalException(ParserRuleContext ctx) {
        this("Illegal expression: " + ctx.getText(), ctx);
    }

    public EvalException(String msg, ParserRuleContext ctx) {
        super(msg + " line:" + ctx.start.getLine());
    }
}
