// Generated from JaqlSample.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JaqlSampleVisitor<T> extends ParseTreeVisitor<T> {
	T visitStream(JaqlSampleParser.StreamContext ctx);

	T visitExprAddSubLabel(JaqlSampleParser.ExprAddSubLabelContext ctx);

	T visitExprSubExprLabel(JaqlSampleParser.ExprSubExprLabelContext ctx);

	T visitCondCompLabel(JaqlSampleParser.CondCompLabelContext ctx);

	T visitVar(JaqlSampleParser.VarContext ctx);

	T visitAssignView(JaqlSampleParser.AssignViewContext ctx);

	T visitAggrExpr(JaqlSampleParser.AggrExprContext ctx);

	T visitStreamLabel(JaqlSampleParser.StreamLabelContext ctx);

	T visitWindowTimeLabel(JaqlSampleParser.WindowTimeLabelContext ctx);

	T visitPipe(JaqlSampleParser.PipeContext ctx);

	T visitAggrExprs(JaqlSampleParser.AggrExprsContext ctx);

	T visitProg(JaqlSampleParser.ProgContext ctx);

	T visitJoinOut(JaqlSampleParser.JoinOutContext ctx);

	T visitWindowRowLabel(JaqlSampleParser.WindowRowLabelContext ctx);

	T visitTimeUnit(JaqlSampleParser.TimeUnitContext ctx);

	T visitAggrFunc(JaqlSampleParser.AggrFuncContext ctx);

	T visitCondVarLabel(JaqlSampleParser.CondVarLabelContext ctx);

	T visitExprBoolLabel(JaqlSampleParser.ExprBoolLabelContext ctx);

	T visitExprMulDivLabel(JaqlSampleParser.ExprMulDivLabelContext ctx);

	T visitExprVarLabel(JaqlSampleParser.ExprVarLabelContext ctx);

	T visitComprator(JaqlSampleParser.CompratorContext ctx);

	T visitSetMaster(JaqlSampleParser.SetMasterContext ctx);

	T visitTransformLabel(JaqlSampleParser.TransformLabelContext ctx);

	T visitCondAndLabel(JaqlSampleParser.CondAndLabelContext ctx);

	T visitAggrFuncName(JaqlSampleParser.AggrFuncNameContext ctx);

	T visitCondSubLabel(JaqlSampleParser.CondSubLabelContext ctx);

	T visitTransExprVar(JaqlSampleParser.TransExprVarContext ctx);

	T visitCondOrLabel(JaqlSampleParser.CondOrLabelContext ctx);

	T visitReadStream(JaqlSampleParser.ReadStreamContext ctx);

	T visitJoin(JaqlSampleParser.JoinContext ctx);

	T visitStat(JaqlSampleParser.StatContext ctx);

	T visitVarID(JaqlSampleParser.VarIDContext ctx);

	T visitGroupSingleLabel(JaqlSampleParser.GroupSingleLabelContext ctx);

	T visitWindowLabel(JaqlSampleParser.WindowLabelContext ctx);

	T visitFilterLabel(JaqlSampleParser.FilterLabelContext ctx);

	T visitWindowPartitionLabel(JaqlSampleParser.WindowPartitionLabelContext ctx);

	T visitExprIntLabel(JaqlSampleParser.ExprIntLabelContext ctx);

	T visitJoinOutVar(JaqlSampleParser.JoinOutVarContext ctx);

	T visitExprStringLabel(JaqlSampleParser.ExprStringLabelContext ctx);

	T visitJoinVar(JaqlSampleParser.JoinVarContext ctx);

	T visitIdentifier(JaqlSampleParser.IdentifierContext ctx);

	T visitExprNullLabel(JaqlSampleParser.ExprNullLabelContext ctx);

	T visitTransExpr(JaqlSampleParser.TransExprContext ctx);
}