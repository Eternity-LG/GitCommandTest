package main.graphql.Cal;

import java.util.HashMap;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/14 10:57
 */
public class Labledexprvisitorimpl extends labledexprBaseVisitor<Integer> {
    HashMap<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitPrintExpr(labledexprParser.PrintExprContext ctx) {
        Integer visit = visit(ctx.expr());
        System.out.println(visit);
        return 0;
    }

    @Override
    public Integer visitAssign(labledexprParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        return 0;
    }

}
