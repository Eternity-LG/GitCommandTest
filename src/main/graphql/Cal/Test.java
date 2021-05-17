//package main.graphql.Cal;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CodePointCharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
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
//        labledexprLexer lexer = new labledexprLexer(stream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        labledexprParser parser = new labledexprParser(tokens);
//        ParseTree tree = parser.prog();
//        Labledexprvisitorimpl labledexprvisitorimpl = new Labledexprvisitorimpl();
//        labledexprvisitorimpl.visit(tree);
//    }
//}
