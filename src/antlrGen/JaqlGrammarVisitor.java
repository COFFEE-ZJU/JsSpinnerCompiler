// Generated from JaqlGrammar.g4 by ANTLR 4.0
package antlrGen;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JaqlGrammarVisitor<T> extends ParseTreeVisitor<T> {
	T visitStream(JaqlGrammarParser.StreamContext ctx);

	T visitExprAddSubLabel(JaqlGrammarParser.ExprAddSubLabelContext ctx);

	T visitExprSubExprLabel(JaqlGrammarParser.ExprSubExprLabelContext ctx);

	T visitCondCompLabel(JaqlGrammarParser.CondCompLabelContext ctx);

	T visitVar(JaqlGrammarParser.VarContext ctx);

	T visitCondNegLabel(JaqlGrammarParser.CondNegLabelContext ctx);

	T visitExpandLabel(JaqlGrammarParser.ExpandLabelContext ctx);

	T visitExprAggrFuncLabel(JaqlGrammarParser.ExprAggrFuncLabelContext ctx);

	T visitAssignView(JaqlGrammarParser.AssignViewContext ctx);

	T visitStreamLabel(JaqlGrammarParser.StreamLabelContext ctx);

	T visitWindowTimeLabel(JaqlGrammarParser.WindowTimeLabelContext ctx);

	T visitPipe(JaqlGrammarParser.PipeContext ctx);

	T visitIdWithArray(JaqlGrammarParser.IdWithArrayContext ctx);

	T visitProg(JaqlGrammarParser.ProgContext ctx);

	T visitWindowRowLabel(JaqlGrammarParser.WindowRowLabelContext ctx);

	T visitTimeUnit(JaqlGrammarParser.TimeUnitContext ctx);

	T visitAggrFunc(JaqlGrammarParser.AggrFuncContext ctx);

	T visitCondVarLabel(JaqlGrammarParser.CondVarLabelContext ctx);

	T visitArraySymbol(JaqlGrammarParser.ArraySymbolContext ctx);

	T visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx);

	T visitExprVarLabel(JaqlGrammarParser.ExprVarLabelContext ctx);

	T visitComprator(JaqlGrammarParser.CompratorContext ctx);

	T visitTransformLabel(JaqlGrammarParser.TransformLabelContext ctx);

	T visitTimeRange(JaqlGrammarParser.TimeRangeContext ctx);

	T visitArrayGen(JaqlGrammarParser.ArrayGenContext ctx);

	T visitAggrFuncName(JaqlGrammarParser.AggrFuncNameContext ctx);

	T visitCondAndLabel(JaqlGrammarParser.CondAndLabelContext ctx);

	T visitCondSubLabel(JaqlGrammarParser.CondSubLabelContext ctx);

	T visitJsonGen(JaqlGrammarParser.JsonGenContext ctx);

	T visitCondOrLabel(JaqlGrammarParser.CondOrLabelContext ctx);

	T visitReadStream(JaqlGrammarParser.ReadStreamContext ctx);

	T visitJoin(JaqlGrammarParser.JoinContext ctx);

	T visitExprMulDivModLabel(JaqlGrammarParser.ExprMulDivModLabelContext ctx);

	T visitStat(JaqlGrammarParser.StatContext ctx);

	T visitField(JaqlGrammarParser.FieldContext ctx);

	T visitGroupSingleLabel(JaqlGrammarParser.GroupSingleLabelContext ctx);

	T visitWindowLabel(JaqlGrammarParser.WindowLabelContext ctx);

	T visitObjectGen(JaqlGrammarParser.ObjectGenContext ctx);

	T visitExprFloatLabel(JaqlGrammarParser.ExprFloatLabelContext ctx);

	T visitFilterLabel(JaqlGrammarParser.FilterLabelContext ctx);

	T visitWindowPartitionLabel(JaqlGrammarParser.WindowPartitionLabelContext ctx);

	T visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx);

	T visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx);

	T visitJoinVar(JaqlGrammarParser.JoinVarContext ctx);

	T visitIdentifier(JaqlGrammarParser.IdentifierContext ctx);

	T visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx);
}