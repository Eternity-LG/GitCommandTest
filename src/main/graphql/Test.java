//package main.graphql;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CodePointCharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//
//import java.io.IOException;
//
///**
// * @author ：liugeng
// * @date ：Created in 2021/4/13 15:48
// */
//public class Test {
//    public static void main(String[] args) throws IOException {
//        CodePointCharStream stream = CharStreams.fromString("{99,3,4,5}");
//        ArrayInitLexer lexer = new ArrayInitLexer(stream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        ArrayInitParser parser = new ArrayInitParser(tokens);
//
//        ParseTree tree = parser.init();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new ShortToUnicodeString(),tree);
//        System.out.println("");
//    }
//}
