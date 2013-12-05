package antlrGen;
// Generated from JaqlGrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class JaqlGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JaqlGrammarVisitor<T> {
	@Override public T visitStream(JaqlGrammarParser.StreamContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprAddSubLabel(JaqlGrammarParser.ExprAddSubLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprSubExprLabel(JaqlGrammarParser.ExprSubExprLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondCompLabel(JaqlGrammarParser.CondCompLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar(JaqlGrammarParser.VarContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpandLabel(JaqlGrammarParser.ExpandLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprAggrFuncLabel(JaqlGrammarParser.ExprAggrFuncLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignView(JaqlGrammarParser.AssignViewContext ctx) { return visitChildren(ctx); }

	@Override public T visitStreamLabel(JaqlGrammarParser.StreamLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowTimeLabel(JaqlGrammarParser.WindowTimeLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitPipe(JaqlGrammarParser.PipeContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdWithArray(JaqlGrammarParser.IdWithArrayContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(JaqlGrammarParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowRowLabel(JaqlGrammarParser.WindowRowLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitTimeUnit(JaqlGrammarParser.TimeUnitContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggrFunc(JaqlGrammarParser.AggrFuncContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondVarLabel(JaqlGrammarParser.CondVarLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitArraySymbol(JaqlGrammarParser.ArraySymbolContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprMulDivLabel(JaqlGrammarParser.ExprMulDivLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprVarLabel(JaqlGrammarParser.ExprVarLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitComprator(JaqlGrammarParser.CompratorContext ctx) { return visitChildren(ctx); }

	@Override public T visitTransformLabel(JaqlGrammarParser.TransformLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitTimeRange(JaqlGrammarParser.TimeRangeContext ctx) { return visitChildren(ctx); }

	@Override public T visitArrayGen(JaqlGrammarParser.ArrayGenContext ctx) { return visitChildren(ctx); }

	@Override public T visitAggrFuncName(JaqlGrammarParser.AggrFuncNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondAndLabel(JaqlGrammarParser.CondAndLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondSubLabel(JaqlGrammarParser.CondSubLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitJsonGen(JaqlGrammarParser.JsonGenContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondOrLabel(JaqlGrammarParser.CondOrLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitReadStream(JaqlGrammarParser.ReadStreamContext ctx) { return visitChildren(ctx); }

	@Override public T visitJoin(JaqlGrammarParser.JoinContext ctx) { return visitChildren(ctx); }

	@Override public T visitStat(JaqlGrammarParser.StatContext ctx) { return visitChildren(ctx); }

	@Override public T visitField(JaqlGrammarParser.FieldContext ctx) { return visitChildren(ctx); }

	@Override public T visitGroupSingleLabel(JaqlGrammarParser.GroupSingleLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowLabel(JaqlGrammarParser.WindowLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitObjectGen(JaqlGrammarParser.ObjectGenContext ctx) { return visitChildren(ctx); }

	@Override public T visitFilterLabel(JaqlGrammarParser.FilterLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitWindowPartitionLabel(JaqlGrammarParser.WindowPartitionLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitJoinVar(JaqlGrammarParser.JoinVarContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdentifier(JaqlGrammarParser.IdentifierContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx) { return visitChildren(ctx); }
}