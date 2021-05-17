// Generated from D:/IdeaProjects/设计模式/src/main/graphql/Cal\labledexpr.g4 by ANTLR 4.9.1
package main.graphql.Cal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link labledexprParser}.
 */
public interface labledexprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link labledexprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(labledexprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link labledexprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(labledexprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(labledexprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(labledexprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(labledexprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(labledexprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(labledexprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link labledexprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(labledexprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(labledexprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(labledexprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(labledexprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(labledexprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(labledexprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(labledexprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(labledexprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(labledexprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(labledexprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link labledexprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(labledexprParser.IntContext ctx);
}