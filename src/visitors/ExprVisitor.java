package visitors;

import java.util.ArrayList;
import java.util.List;

import others.JsonSchema;

import antlrGen.JaqlGrammarBaseVisitor;
import antlrGen.JaqlGrammarParser;
import constants.Constants.*;
import constants.SemanticErrorException;

import JsonAPI.JsonExpression;

public class ExprVisitor extends JaqlGrammarBaseVisitor<JsonExpression> {
	private boolean haveDollar;
	private String[] renameIds;
	private JsonSchema[] prevSchemas;
	private OperationType opType = null;
	
	public ExprVisitor(boolean haveDollar, String[] renameIds, JsonSchema[] prevSchemas){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
	}
	public ExprVisitor(boolean haveDollar, String[] renameIds, JsonSchema[] prevSchemas, OperationType opType){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
		this.opType = opType;
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
		int i,nestTimes=0,schPos;
		if(ctx.idWithArray(0).identifier().dollar == null){
			String rename = ctx.idWithArray(0).identifier().getText();
			schPos = getSchemaPos(rename);
		}
		else{
			if(! haveDollar)
				throw new SemanticErrorException("variable $ undefined");
			schPos = prevSchemas.length-1;
		}
		expr.retSchema = prevSchemas[schPos];
		
		expr.id_name = new ArrayList<Object>();
		JsonSchema tmpSch = prevSchemas[schPos];
		for(i=0;i<ctx.idWithArray(0).arraySymbol().size();i++){
			if(tmpSch.items == null)
				throw new SemanticErrorException("variable "+ctx.idWithArray(0).identifier().getText()+"'s type is mismatched");
			
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
		
		if(ctx.idWithArray(0).arraySymbol().size() ==0 && ctx.idWithArray(0).identifier().dollar == null) expr.lastNameIsArray = false;
		else expr.lastNameIsArray = true;
		
		if(ctx.idWithArray().size() > 1 ){
			if(tmpSch.type != JsonValueType.OBJECT)
				throw new SemanticErrorException("variable "+ctx.idWithArray(0).identifier().getText()+"'s type is mismatched");
		}
		nestTimes += dealWithIdWithArrays(expr, ctx.idWithArray().subList(1, ctx.idWithArray().size()), tmpSch);
		
		for(i=0;i<nestTimes;i++){
			tmpSch = new JsonSchema(JsonValueType.ARRAY);
			tmpSch.items = expr.retSchema;
			expr.retSchema = tmpSch;
		}
		
		if(opType == OperationType.JOIN){
			if(schPos == 0) expr.attribute_source = JsonAttrSource.left;
			else expr.attribute_source = JsonAttrSource.right;
		}
		else if(opType == OperationType.GROUP){
			if(schPos == 0) expr.attribute_source = JsonAttrSource.group_key_var;
			else expr.attribute_source = JsonAttrSource.group_array;
		}
		return expr;
	}
	
	
	private int dealWithIdWithArrays(JsonExpression expr, List<JaqlGrammarParser.IdWithArrayContext> ctxs, JsonSchema currSchema){
		JsonSchema tmpSch = currSchema;
		int nestTimes=0;
			
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
			
			if(i != ctxs.size()-1 && tmpSch.type != JsonValueType.OBJECT)
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
			expr.aggregate_operations = AggrFuncNames.sum;
			break;
		case "avg":
			expr.aggregate_operations = AggrFuncNames.average;
			break;
		case "cnt":
			expr.aggregate_operations = AggrFuncNames.count;
			break;
		case "min":
			throw new SemanticErrorException("aggrFunc \"min\"currently not supported");
		case "max":
			throw new SemanticErrorException("aggrFunc \"max\"currently not supported");
		default:
			break;
		}
		expr.aggregate_projection = new ProjectionVisitor(haveDollar, renameIds, prevSchemas, opType).visit(ctx.jsonGen());
		expr.retSchema = expr.aggregate_projection.retSchema;
		if(expr.retSchema.type != JsonValueType.ARRAY)
			throw new SemanticErrorException("expecting array input type");
		if(expr.aggregate_operations == AggrFuncNames.sum || expr.aggregate_operations == AggrFuncNames.average){
			if(expr.retSchema.items.type != JsonValueType.NUMBER && expr.retSchema.items.type != JsonValueType.INTEGER)
				throw new SemanticErrorException("expecting array of number or integer");
			else expr.retSchema = expr.retSchema.items;
		}
		else{
			expr.retSchema = new JsonSchema(JsonValueType.INTEGER);
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
		
		if((expr.left.retSchema.type != JsonValueType.INTEGER && expr.left.retSchema.type != JsonValueType.NUMBER) ||
				(expr.right.retSchema.type != JsonValueType.INTEGER && expr.right.retSchema.type != JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide"+expr.left.id_name);
			
		if(expr.left.retSchema.type == JsonValueType.INTEGER && expr.right.retSchema.type == JsonValueType.INTEGER)
			expr.retSchema.type = JsonValueType.INTEGER;
		else
			expr.retSchema.type = JsonValueType.NUMBER;
		
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
		
		if((expr.left.retSchema.type != JsonValueType.INTEGER && expr.left.retSchema.type != JsonValueType.NUMBER) ||
				(expr.right.retSchema.type != JsonValueType.INTEGER && expr.right.retSchema.type != JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide");
		
		if(expr.left.retSchema.type == JsonValueType.INTEGER && expr.right.retSchema.type == JsonValueType.INTEGER)
			expr.retSchema.type = JsonValueType.INTEGER;
		else
			expr.retSchema.type = JsonValueType.NUMBER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "int";
		expr.int_value = Integer.parseInt(ctx.INT().getText());
		expr.retSchema.type = JsonValueType.INTEGER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "bool";
		if(ctx.TRUE() != null) expr.bool_value = true;
		else expr.bool_value = false;
		
		expr.retSchema.type = JsonValueType.BOOLEAN;
		
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "null";
		expr.retSchema.type = JsonValueType.NULL;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "string";
		expr.string_value = ctx.STRING().getText().replaceAll("\"", "");
		expr.retSchema.type = JsonValueType.STRING;
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
	
	private int getSchemaPos(String rename){
		if(renameIds == null || renameIds.length == 0)
			throw new SemanticErrorException("variable "+rename+"undefined");
		
		for(int i=0;i<renameIds.length;i++){
			if(rename.equals(renameIds[i])) return i;
		}
		
		throw new SemanticErrorException("variable "+rename+"undefined");
	}
	
	private void checkAttrContaining(JsonSchema schema, String attrName){
    	if(! schema.nameToSchema.containsKey(attrName))
    		throw new SemanticErrorException("attribute name "+attrName+" is not valid.");
    }
}
