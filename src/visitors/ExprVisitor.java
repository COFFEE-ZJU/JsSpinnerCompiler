package visitors;

import java.util.ArrayList;
import java.util.List;

import jsonAPI.JsonExpression;

import others.JsonSchema;

import antlrGen.JaqlGrammarBaseVisitor;
import antlrGen.JaqlGrammarParser;
import constants.Constants.*;
import constants.SemanticErrorException;


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
		expr.expression_type = JsonExprType.ID;
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
			if(tmpSch.getType() != JsonValueType.OBJECT)
				throw new SemanticErrorException("variable "+ctx.idWithArray(0).identifier().getText()+"'s type is mismatched" + tmpSch.getType());
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
			tmpSch = tmpSch.properties.get(tmpString);
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
			
			if(i != ctxs.size()-1 && tmpSch.getType() != JsonValueType.OBJECT)
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
		expr.expression_type = JsonExprType.AGGREGATION;
		switch (ctx.aggrFuncName().getText()) {
		case "sum":
			expr.aggregate_operation = AggrFuncNames.sum;
			break;
		case "avg":
			expr.aggregate_operation = AggrFuncNames.average;
			break;
		case "cnt":
			expr.aggregate_operation = AggrFuncNames.count;
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
		if(expr.retSchema.getType() != JsonValueType.ARRAY)
			throw new SemanticErrorException("expecting array input type");
		if(expr.aggregate_operation == AggrFuncNames.sum || expr.aggregate_operation == AggrFuncNames.average){
			if(expr.retSchema.items.getType() != JsonValueType.NUMBER && expr.retSchema.items.getType() != JsonValueType.INTEGER)
				throw new SemanticErrorException("expecting array of number or integer");
			else if(expr.aggregate_operation == AggrFuncNames.sum) expr.retSchema = expr.retSchema.items;
			else expr.retSchema = new JsonSchema(JsonValueType.NUMBER);
		}
		else{
			expr.retSchema = new JsonSchema(JsonValueType.INTEGER);
		}
		
		return expr;
	}

	@Override 
	public JsonExpression visitExprMulDivModLabel(JaqlGrammarParser.ExprMulDivModLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		switch (ctx.op.getText()) {
		case "*":
			expr.expression_type = JsonExprType.MUL;
			break;
		case "/":
			expr.expression_type = JsonExprType.DIV;
			break;
		case "%":
			expr.expression_type = JsonExprType.MOD;
			break;
		default:
			break;
		}
		expr.left = visit(ctx.exprs(0));
		expr.right = visit(ctx.exprs(1));
		
		if(expr.expression_type == JsonExprType.MOD && (expr.left.retSchema.getType() != JsonValueType.INTEGER || expr.right.retSchema.getType() != JsonValueType.INTEGER) )
			throw new SemanticErrorException("mod only support integers");
		
		if((expr.left.retSchema.getType() != JsonValueType.INTEGER && expr.left.retSchema.getType() != JsonValueType.NUMBER) ||
				(expr.right.retSchema.getType() != JsonValueType.INTEGER && expr.right.retSchema.getType() != JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide/mod"+expr.left.id_name);
			
		if(expr.left.retSchema.getType() == JsonValueType.INTEGER && expr.right.retSchema.getType() == JsonValueType.INTEGER)
			expr.retSchema.setType(JsonValueType.INTEGER);
		else
			expr.retSchema.setType(JsonValueType.NUMBER);
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprAddSubLabel(JaqlGrammarParser.ExprAddSubLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		switch (ctx.op.getText()) {
		case "+":
			expr.expression_type = JsonExprType.ADD;
			break;
		case "-":
			expr.expression_type = JsonExprType.SUB;
			break;
		default:
			break;
		}
		expr.left = visit(ctx.exprs(0));
		expr.right = visit(ctx.exprs(1));
		
		if((expr.left.retSchema.getType() != JsonValueType.INTEGER && expr.left.retSchema.getType() != JsonValueType.NUMBER) ||
				(expr.right.retSchema.getType() != JsonValueType.INTEGER && expr.right.retSchema.getType() != JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for addition/subtraction");
		
		if(expr.left.retSchema.getType() == JsonValueType.INTEGER && expr.right.retSchema.getType() == JsonValueType.INTEGER)
			expr.retSchema.setType(JsonValueType.INTEGER);
		else
			expr.retSchema.setType(JsonValueType.NUMBER);
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprIntLabel(JaqlGrammarParser.ExprIntLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.expression_type = JsonExprType.INT;
		expr.int_value = Integer.parseInt(ctx.INT().getText());
		expr.retSchema.setType(JsonValueType.INTEGER);
		
		return expr; 
	}
	
	@Override
	public JsonExpression visitExprFloatLabel(JaqlGrammarParser.ExprFloatLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.expression_type = JsonExprType.NUMBER;
		expr.number_value = Double.parseDouble(ctx.FLOAT().getText());
		expr.retSchema.setType(JsonValueType.NUMBER);
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprBoolLabel(JaqlGrammarParser.ExprBoolLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.expression_type = JsonExprType.BOOL;
		if(ctx.TRUE() != null) expr.bool_value = true;
		else expr.bool_value = false;
		
		expr.retSchema.setType(JsonValueType.BOOLEAN);
		
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprNullLabel(JaqlGrammarParser.ExprNullLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.expression_type = JsonExprType.NULL;
		expr.retSchema.setType(JsonValueType.NULL);
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprStringLabel(JaqlGrammarParser.ExprStringLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.expression_type = JsonExprType.STRING;
		expr.string_value = ctx.STRING().getText().replaceAll("\"", "");
		expr.retSchema.setType(JsonValueType.STRING);
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
    	if(! schema.properties.containsKey(attrName))
    		throw new SemanticErrorException("attribute name "+attrName+" is not valid.");
    }
}
