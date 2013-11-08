// Generated from JaqlSample.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class JaqlSampleBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JaqlSampleVisitor<T> {
	@Override public T visitStream(JaqlSampleParser.StreamContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar(JaqlSampleParser.VarContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignView(JaqlSampleParser.AssignViewContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggrExpr(JaqlSampleParser.AggrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitStreamLabel(JaqlSampleParser.StreamLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowTimeLabel(JaqlSampleParser.WindowTimeLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitPipe(JaqlSampleParser.PipeContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(JaqlSampleParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitJoinOut(JaqlSampleParser.JoinOutContext ctx) { return visitChildren(ctx); }

	@Override public T visitConditions2(JaqlSampleParser.Conditions2Context ctx) { return visitChildren(ctx); }

	@Override public T visitTansformLabel(JaqlSampleParser.TansformLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowRowLabel(JaqlSampleParser.WindowRowLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggrFuncNames(JaqlSampleParser.AggrFuncNamesContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggrFunc(JaqlSampleParser.AggrFuncContext ctx) { return visitChildren(ctx); }

	@Override public T visitComprator(JaqlSampleParser.CompratorContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondition(JaqlSampleParser.ConditionContext ctx) { return visitChildren(ctx); }

	@Override public T visitReadStream(JaqlSampleParser.ReadStreamContext ctx) { return visitChildren(ctx); }

	@Override public T visitJoin(JaqlSampleParser.JoinContext ctx) { return visitChildren(ctx); }

	@Override public T visitStat(JaqlSampleParser.StatContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarID(JaqlSampleParser.VarIDContext ctx) { return visitChildren(ctx); }

	@Override public T visitGroupSingleLabel(JaqlSampleParser.GroupSingleLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitConditions(JaqlSampleParser.ConditionsContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowLabel(JaqlSampleParser.WindowLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterLabel(JaqlSampleParser.FilterLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowPartitionLabel(JaqlSampleParser.WindowPartitionLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitJoinVar(JaqlSampleParser.JoinVarContext ctx) { return visitChildren(ctx); }

	@Override public T visitTransExpr(JaqlSampleParser.TransExprContext ctx) { return visitChildren(ctx); }
}