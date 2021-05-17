package main.graphql;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/14 9:36
 */
public class ShortToUnicodeStringVisitor implements ArrayInitVisitor{
    @Override
    public Object visitInit(ArrayInitParser.InitContext ctx) {
        return null;
    }

    @Override
    public Object visitValue(ArrayInitParser.ValueContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
