package org.example.main;

import edu.emory.mathcs.backport.java.util.Collections;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.main.antlr.WSLexer;
import org.example.main.antlr.WSParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.DelayQueue;

/**
 * @author HDU_WS
 * @Classname Main
 * @Description TODO
 * @Date 2021/8/11 17:50
 * @Created by TheKing_Shun
 */

public class Main {
    public static void main(String[] args) {
        try {
            WSLexer lexer = new WSLexer(CharStreams.fromFileName("src/main/resources/mytest"));
            WSParser parser = new WSParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            WSParser.ParseContext tree = parser.parse();
            Scope scope = new Scope();
            Map<String, Function> functions = Collections.emptyMap();
            MyVisitor visitor = new MyVisitor(scope, functions);
            System.out.println();
            visitor.visit(tree);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }


    }
}






















