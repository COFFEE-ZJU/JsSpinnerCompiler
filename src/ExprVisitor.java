import java.util.ArrayList;
import java.util.List;

public class ExprVisitor extends JaqlGrammarBaseVisitor<JsonExpression> {
	private boolean haveDollar;
	private String[] renameIds;
	private JsonSchema[] prevSchemas;
	
	public ExprVisitor(boolean haveDollar, String[] renameIds, JsonSchema[] prevSchemas){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
	}
	public ExprVisitor(boolean haveDollar, String renameId, JsonSchema prevSchema){
		this.haveDollar = haveDollar;
		this.prevSchemas = new JsonSchema[]{prevSchema};
		if(haveDollar)
			this.renameIds = null;
		else
			this.renameIds = new String[]{renameId};
	}
	
	@Override 
    public JsonExpression visitVar(JaqlGrammarParser.VarContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		expr.retSchema = prevSchema;
		int i,nestTimes=0;
		if(ctx.dollar == null){
			String rename = ctx.identifier().getText();
			if(! haveRename || ! rename.equals(renameId))
				throw new SemanticErrorException("variable "+rename+" undefined");
		}
		else{
			if(haveRename)
				throw new SemanticErrorException("variable $ undefined");
		}
		
		expr.id_name = new ArrayList<Object>();
		JsonSchema tmpSch = prevSchema;
		for(i=0;i<ctx.arraySymbol().size();i++){
			if(tmpSch.items == null){
				if(haveRename)
					throw new SemanticErrorException("variable "+renameId+"'s type is mismatched");
				else
					throw new SemanticErrorException("variable $'s type is mismatched");
			}
			if(ctx.arraySymbol().get(i).star != null){
				expr.id_name.add(-1);
				nestTimes ++;
			}
			else if(ctx.arraySymbol().get(i).range != null){
				int[] ranges = new int[2];
				ranges[0] = Integer.parseInt(ctx.arraySymbol().get(i).INT(0).getText());
				ranges[1] = Integer.parseInt(ctx.arraySymbol().get(i).INT(1).getText());
				if(ranges[0]>ranges[1])
					throw new SemanticErrorException("array range less than 1");
				expr.id_name.add(ranges);
				nestTimes ++;
			}
			else expr.id_name.add(Integer.parseInt(ctx.arraySymbol().get(i).INT(0).getText()));
			
			tmpSch = tmpSch.items;
		}
		
		if(ctx.arraySymbol().size() ==0 && ctx.dollar == null) expr.lastNameIsArray = false;
		else expr.lastNameIsArray = true;
		nestTimes += dealWithIdWithArrays(expr, ctx.idWithArray(), tmpSch);
		
		for(i=0;i<nestTimes;i++){
			tmpSch = new JsonSchema(Constants.JsonValueType.ARRAY);
			tmpSch.items = expr.retSchema;
			expr.retSchema = tmpSch;
		}
		return expr;
	}
	
	@Override 
    public JsonExpression visitVarID(JaqlGrammarParser.VarIDContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		expr.retSchema = prevSchema;
		int i,nestTimes=0;
		
		String rename = ctx.idWithArray(0).identifier().getText();
		if(! haveRename || ! rename.equals(renameId))
			throw new SemanticErrorException("variable "+rename+" undefined");
		expr.id_name = new ArrayList<Object>();
		JsonSchema tmpSch = prevSchema;
		for(i=0;i<ctx.idWithArray(0).arraySymbol().size();i++){
			if(tmpSch.items == null){
				if(haveRename)
					throw new SemanticErrorException("variable "+renameId+"'s type is mismatched");
				else
					throw new SemanticErrorException("variable $'s type is mismatched");
			}
			if(ctx.idWithArray(0).arraySymbol().get(i).star != null){
				expr.id_name.add(-1);
				nestTimes ++;
			}
			else if(ctx.idWithArray(0).arraySymbol().get(i).range != null){
				int[] ranges = new int[2];
				ranges[0] = Integer.parseInt(ctx.idWithArray(0).arraySymbol().get(i).INT(0).getText());
				ranges[1] = Integer.parseInt(ctx.idWithArray(0).arraySymbol().get(i).INT(1).getText());
				if(ranges[0]>ranges[1])
					throw new SemanticErrorException("array range less than 1");
				expr.id_name.add(ranges);
				nestTimes ++;
			}
			else expr.id_name.add(Integer.parseInt(ctx.idWithArray(0).arraySymbol().get(i).INT(0).getText()));
			
			tmpSch = tmpSch.items;
		}
		
		if(ctx.idWithArray(0).arraySymbol().size() ==0 ) expr.lastNameIsArray = false;
		else expr.lastNameIsArray = true;
		nestTimes += dealWithIdWithArrays(expr, ctx.idWithArray().subList(1, ctx.idWithArray().size()), tmpSch);
		
		for(i=0;i<nestTimes;i++){
			tmpSch = new JsonSchema(Constants.JsonValueType.ARRAY);
			tmpSch.items = expr.retSchema;
			expr.retSchema = tmpSch;
		}
		return expr;
	}
	
	private int dealWithIdWithArrays(JsonExpression expr, List<JaqlGrammarParser.IdWithArrayContext> ctxs, JsonSchema currSchema){
		JsonSchema tmpSch = currSchema;
		int nestTimes=0;
		if(ctxs.size() != 0 && tmpSch.type != Constants.JsonValueType.OBJECT){
			if(haveRename)
				throw new SemanticErrorException("variable "+renameId+"'s type is mismatched");
			else
				throw new SemanticErrorException("variable $'s type is mismatched");
		}
			
		String tmpString;
		int i,j;
		for(i=0;i<ctxs.size();i++){
			List<JaqlGrammarParser.ArraySymbolContext> arrays = ctxs.get(i).arraySymbol();
			tmpString = ctxs.get(i).identifier().getText();
			checkAttrContaining(tmpSch, tmpString);
			expr.id_name.add(tmpString);
			tmpSch = tmpSch.nameToSchema.get(tmpString);
			for(j=0;j<arrays.size();j++){
				if(tmpSch.items == null)
					throw new SemanticErrorException("attribute "+tmpString+"'s type is mismatched");
				if(arrays.get(j).star != null){
					expr.id_name.add(-1);
					nestTimes ++;
				}
				else if(arrays.get(j).range != null){
					int[] ranges = new int[2];
					ranges[0] = Integer.parseInt(arrays.get(j).INT(0).getText());
					ranges[1] = Integer.parseInt(arrays.get(j).INT(1).getText());
					if(ranges[0]>ranges[1])
						throw new SemanticErrorException("array range less than 1");
					expr.id_name.add(ranges);
					nestTimes ++;
				}
				else expr.id_name.add(Integer.parseInt(arrays.get(j).INT(0).getText()));
				
				tmpSch = tmpSch.items;
			}
			
			if(i != ctxs.size()-1 && tmpSch.type != Constants.JsonValueType.OBJECT)
				throw new SemanticErrorException("attribute "+tmpString+"'s type is mismatched");
		}
		
		if(ctxs.size() != 0){
			if(ctxs.get(ctxs.size()-1).arraySymbol().size() == 0) expr.lastNameIsArray = false;
			else expr.lastNameIsArray = true;
		}
		expr.retSchema = tmpSch;
		return nestTimes;
	}
	
	@Override
	public JsonExpression visitExprAggrFuncLabel(JaqlGrammarParser.ExprAggrFuncLabelContext ctx) {
		return visit(ctx.aggrFunc());
	}
	
	@Override
	public JsonExpression visitAggrFunc(JaqlGrammarParser.AggrFuncContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "aggregation";
		switch (ctx.aggrFuncName().getText()) {
		case "sum":
			expr.aggregate_operations = Constants.AggrFuncNames.sum;
			break;
		case "avg":
			expr.aggregate_operations = Constants.AggrFuncNames.average;
			break;
		case "cnt":
			expr.aggregate_operations = Constants.AggrFuncNames.count;
			break;
		case "min":
			throw new SemanticErrorException("aggrFunc \"min\"currently not supported");
		case "max":
			throw new SemanticErrorException("aggrFunc \"max\"currently not supported");
		default:
			break;
		}
		expr.aggregate_projection = new ProjectionVisitor(haveDollar, renameIds, prevSchemas).visit(ctx.jsonGen());
		expr.retSchema = expr.aggregate_projection.retSchema;
		if(expr.retSchema.type != Constants.JsonValueType.ARRAY)
			throw new SemanticErrorException("expecting array input type");
		if(expr.aggregate_operations == Constants.AggrFuncNames.sum || expr.aggregate_operations == Constants.AggrFuncNames.average){
			if(expr.retSchema.items.type != Constants.JsonValueType.NUMBER || expr.retSchema.items.type != Constants.JsonValueType.INTEGER)
				throw new SemanticErrorException("expecting array of number or integer");
			else expr.retSchema = expr.retSchema.items;
		}
		else{
			expr.retSchema = new JsonSchema(Constants.JsonValueType.INTEGER);
		}
		
		return expr;
	}

	@Override 
	public JsonExpression visitExprMulDivLabel(JaqlGrammarParser.ExprMulDivLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		switch (ctx.op.getText()) {
		case "*":
			expr.type = "mul";
			break;
		case "/":
			expr.type = "div";
			break;
		default:
			break;
		}
		expr.left = visit(ctx.exprs(0));
		expr.right = visit(ctx.exprs(1));
		
		if((expr.left.retSchema.type != Constants.JsonValueType.INTEGER && expr.left.retSchema.type != Constants.JsonValueType.NUMBER) ||
				(expr.right.retSchema.type != Constants.JsonValueType.INTEGER && expr.right.retSchema.type != Constants.JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide");
			
		if(expr.left.retSchema.type == Constants.JsonValueType.INTEGER && expr.right.retSchema.type == Constants.JsonValueType.INTEGER)
			expr.retSchema.type = Constants.JsonValueType.INTEGER;
		else
			expr.retSchema.type = Constants.JsonValueType.NUMBER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprAddSubLabel(JaqlGrammarParser.ExprAddSubLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		switch (ctx.op.getText()) {
		case "+":
			expr.type = "add";
			break;
		case "-":
			expr.type = "sub";
			break;
		default:
			break;
		}
		expr.left = visit(ctx.exprs(0));
		expr.right = visit(ctx.exprs(1));
		
		if((expr.left.retSchema.type != Constants.JsonValueType.INTEGER && expr.left.retSchema.type != Constants.JsonValueType.NUMBER) ||
				(expr.right.retSchema.type != Constants.JsonValueType.INTEGER && expr.right.retSchema.type != Constants.JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide");
		
		if(expr.left.retSchema.type == Constants.JsonValueType.INTEGER && expr.right.retSchema.type == Constants.JsonValueType.INTEGER)
			expr.retSchema.type = Constants.JsonValueType.INTEGER;
		else
			expr.retSchema.type = Constants.JsonValueType.NUMBER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "int";
		expr.int_value = Integer.parseInt(ctx.INT().getText());
		expr.retSchema.type = Constants.JsonValueType.INTEGER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "bool";
		if(ctx.TRUE() != null) expr.bool_value = true;
		else expr.bool_value = false;
		
		expr.retSchema.type = Constants.JsonValueType.BOOLEAN;
		
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "null";
		expr.retSchema.type = Constants.JsonValueType.NULL;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "string";
		expr.string_value = ctx.STRING().getText().replaceAll("\"", "");
		expr.retSchema.type = Constants.JsonValueType.STRING;
		return expr; 
	}
	
	
	@Override 
	public JsonExpression visitExprSubExprLabel(JaqlGrammarParser.ExprSubExprLabelContext ctx) {
		
		return visit(ctx.exprs()); 
	}
	
	@Override 
	public JsonExpression visitExprVarLabel(JaqlGrammarParser.ExprVarLabelContext ctx) {
		
		return visit(ctx.var()); 
	}
	
	
	
	private void checkAttrContaining(JsonSchema schema, String attrName){
    	if(! schema.nameToSchema.containsKey(attrName))
    		throw new SemanticErrorException("attribute name "+attrName+" is not valid.");
    }
}
