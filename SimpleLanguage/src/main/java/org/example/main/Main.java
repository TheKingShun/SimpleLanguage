package org.example.main;

import edu.emory.mathcs.backport.java.util.Collections;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.main.antlr.WSLexer;
import org.example.main.antlr.WSParser;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author HDU_WS
 * @Classname Main
 * @Description TODO
 * @Date 2021/8/11 17:50
 * @Created by TheKing_Shun
 */

public class Main {
    public static void main(String[] args) {
        String filePath = args[0];
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("文件不存在");
                System.exit(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("当前文件路径为：" + filePath);
        try {
            WSLexer lexer = new WSLexer(CharStreams.fromFileName(filePath));
            // WSLexer lexer = new WSLexer(CharStreams.fromFileName("src/main/resources/mytest"));
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
