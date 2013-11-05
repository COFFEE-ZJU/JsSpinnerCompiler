// Generated from JaqlSample.g4 by ANTLR 4.0
package jaqlSample;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JaqlSampleVisitor<T> extends ParseTreeVisitor<T> {
	T visitCondition(JaqlSampleParser.ConditionContext ctx);

	T visitVar(JaqlSampleParser.VarContext ctx);

	T visitAggrExpr(JaqlSampleParser.AggrExprContext ctx);

	T visitJoin(JaqlSampleParser.JoinContext ctx);

	T visitStat(JaqlSampleParser.StatContext ctx);

	T visitPipe(JaqlSampleParser.PipeContext ctx);

	T visitVarID(JaqlSampleParser.VarIDContext ctx);

	T visitConditions(JaqlSampleParser.ConditionsContext ctx);

	T visitGroupSingleLabel(JaqlSampleParser.GroupSingleLabelContext ctx);

	T visitProg(JaqlSampleParser.ProgContext ctx);

	T visitConditions2(JaqlSampleParser.Conditions2Context ctx);

	T visitJoinOut(JaqlSampleParser.JoinOutContext ctx);

	T visitFilterLabel(JaqlSampleParser.FilterLabelContext ctx);

	T visitTansformLabel(JaqlSampleParser.TansformLabelContext ctx);

	T visitAggrFuncNames(JaqlSampleParser.AggrFuncNamesContext ctx);

	T visitAggrFunc(JaqlSampleParser.AggrFuncContext ctx);

	T visitTransExpr(JaqlSampleParser.TransExprContext ctx);
}