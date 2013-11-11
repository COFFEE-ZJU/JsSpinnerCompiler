// Generated from JaqlSample.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JaqlSampleVisitor<T> extends ParseTreeVisitor<T> {
	T visitStream(JaqlSampleParser.StreamContext ctx);

	T visitCondCompLabel(JaqlSampleParser.CondCompLabelContext ctx);

	T visitVar(JaqlSampleParser.VarContext ctx);

	T visitAssignView(JaqlSampleParser.AssignViewContext ctx);

	T visitAggrExpr(JaqlSampleParser.AggrExprContext ctx);

	T visitStreamLabel(JaqlSampleParser.StreamLabelContext ctx);

	T visitWindowTimeLabel(JaqlSampleParser.WindowTimeLabelContext ctx);

	T visitPipe(JaqlSampleParser.PipeContext ctx);

	T visitProg(JaqlSampleParser.ProgContext ctx);

	T visitJoinOut(JaqlSampleParser.JoinOutContext ctx);

	T visitTansformLabel(JaqlSampleParser.TansformLabelContext ctx);

	T visitWindowRowLabel(JaqlSampleParser.WindowRowLabelContext ctx);

	T visitTimeUnit(JaqlSampleParser.TimeUnitContext ctx);

	T visitAggrFuncNames(JaqlSampleParser.AggrFuncNamesContext ctx);

	T visitExprs(JaqlSampleParser.ExprsContext ctx);

	T visitAggrFunc(JaqlSampleParser.AggrFuncContext ctx);

	T visitCondVarLabel(JaqlSampleParser.CondVarLabelContext ctx);

	T visitComprator(JaqlSampleParser.CompratorContext ctx);

	T visitCondAndLabel(JaqlSampleParser.CondAndLabelContext ctx);

	T visitCondSubLabel(JaqlSampleParser.CondSubLabelContext ctx);

	T visitCondOrLabel(JaqlSampleParser.CondOrLabelContext ctx);

	T visitReadStream(JaqlSampleParser.ReadStreamContext ctx);

	T visitJoin(JaqlSampleParser.JoinContext ctx);

	T visitStat(JaqlSampleParser.StatContext ctx);

	T visitVarID(JaqlSampleParser.VarIDContext ctx);

	T visitGroupSingleLabel(JaqlSampleParser.GroupSingleLabelContext ctx);

	T visitWindowLabel(JaqlSampleParser.WindowLabelContext ctx);

	T visitFilterLabel(JaqlSampleParser.FilterLabelContext ctx);

	T visitWindowPartitionLabel(JaqlSampleParser.WindowPartitionLabelContext ctx);

	T visitJoinVar(JaqlSampleParser.JoinVarContext ctx);

	T visitTransExpr(JaqlSampleParser.TransExprContext ctx);
}