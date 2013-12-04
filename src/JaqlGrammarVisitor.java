// Generated from JaqlGrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JaqlGrammarVisitor<T> extends ParseTreeVisitor<T> {
	T visitStream(JaqlGrammarParser.StreamContext ctx);

	T visitExprAddSubLabel(JaqlGrammarParser.ExprAddSubLabelContext ctx);

	T visitExprSubExprLabel(JaqlGrammarParser.ExprSubExprLabelContext ctx);

	T visitCondCompLabel(JaqlGrammarParser.CondCompLabelContext ctx);

	T visitVar(JaqlGrammarParser.VarContext ctx);

	T visitExpandLabel(JaqlGrammarParser.ExpandLabelContext ctx);

	T visitAssignView(JaqlGrammarParser.AssignViewContext ctx);

	T visitAggrExpr(JaqlGrammarParser.AggrExprContext ctx);

	T visitStreamLabel(JaqlGrammarParser.StreamLabelContext ctx);

	T visitWindowTimeLabel(JaqlGrammarParser.WindowTimeLabelContext ctx);

	T visitPipe(JaqlGrammarParser.PipeContext ctx);

	T visitAggrExprs(JaqlGrammarParser.AggrExprsContext ctx);

	T visitIdWithArray(JaqlGrammarParser.IdWithArrayContext ctx);

	T visitProg(JaqlGrammarParser.ProgContext ctx);

	T visitJoinOut(JaqlGrammarParser.JoinOutContext ctx);

	T visitWindowRowLabel(JaqlGrammarParser.WindowRowLabelContext ctx);

	T visitTimeUnit(JaqlGrammarParser.TimeUnitContext ctx);

	T visitAggrFunc(JaqlGrammarParser.AggrFuncContext ctx);

	T visitCondVarLabel(JaqlGrammarParser.CondVarLabelContext ctx);

	T visitArraySymbol(JaqlGrammarParser.ArraySymbolContext ctx);

	T visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx);

	T visitExprMulDivLabel(JaqlGrammarParser.ExprMulDivLabelContext ctx);

	T visitExprVarLabel(JaqlGrammarParser.ExprVarLabelContext ctx);

	T visitComprator(JaqlGrammarParser.CompratorContext ctx);

	T visitTransformLabel(JaqlGrammarParser.TransformLabelContext ctx);

	T visitTimeRange(JaqlGrammarParser.TimeRangeContext ctx);

	T visitCondAndLabel(JaqlGrammarParser.CondAndLabelContext ctx);

	T visitAggrFuncName(JaqlGrammarParser.AggrFuncNameContext ctx);

	T visitCondSubLabel(JaqlGrammarParser.CondSubLabelContext ctx);

	T visitTransExprVar(JaqlGrammarParser.TransExprVarContext ctx);

	T visitCondOrLabel(JaqlGrammarParser.CondOrLabelContext ctx);

	T visitReadStream(JaqlGrammarParser.ReadStreamContext ctx);

	T visitJoin(JaqlGrammarParser.JoinContext ctx);

	T visitStat(JaqlGrammarParser.StatContext ctx);

	T visitVarID(JaqlGrammarParser.VarIDContext ctx);

	T visitGroupSingleLabel(JaqlGrammarParser.GroupSingleLabelContext ctx);

	T visitWindowLabel(JaqlGrammarParser.WindowLabelContext ctx);

	T visitFilterLabel(JaqlGrammarParser.FilterLabelContext ctx);

	T visitWindowPartitionLabel(JaqlGrammarParser.WindowPartitionLabelContext ctx);

	T visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx);

	T visitJoinOutVar(JaqlGrammarParser.JoinOutVarContext ctx);

	T visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx);

	T visitJoinVar(JaqlGrammarParser.JoinVarContext ctx);

	T visitIdentifier(JaqlGrammarParser.IdentifierContext ctx);

	T visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx);

	T visitTransExpr(JaqlGrammarParser.TransExprContext ctx);
}