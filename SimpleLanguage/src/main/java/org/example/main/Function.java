package org.example.main;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author HDU_WS
 * @Classname Function
 * @Description TODO
 * @Date 2021/8/13 18:06
 * @Created by TheKing_Shun
 */

public class Function {
    private Scope parentScope;
    private List<TerminalNode> params;
    private ParseTree block;
}
