package visitors;

import java.util.ArrayList;
import java.util.HashMap;

import jsonAPI.JsonProjection;
import others.JsonSchema;

import antlrGen.JaqlGrammarBaseVisitor;
import antlrGen.JaqlGrammarParser;

import constants.Constants.*;
import constants.SemanticErrorException;



public class ProjectionVisitor extends JaqlGrammarBaseVisitor<JsonProjection>{
	private boolean haveDollar;
	private String[] renameIds;
	private JsonSchema[] prevSchemas;
	private OperationType opType = null; 
	
	public ProjectionVisitor(boolean haveDollar, String[] renameIds, JsonSchema[] prevSchemas){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
	}
	public ProjectionVisitor(boolean haveDollar, String[] renameIds, JsonSchema[] prevSchemas, OperationType opType){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
		this.opType = opType;
	}
	
	public ProjectionVisitor(boolean haveDollar, String renameId, JsonSchema prevSchema){
		this.haveDollar = haveDollar;
		this.prevSchemas = new JsonSchema[]{prevSchema};
		if(haveDollar)
			this.renameIds = null;
		else
			this.renameIds = new String[]{renameId};
	}
	
	@Override 
	public JsonProjection visitJsonGen(JaqlGrammarParser.JsonGenContext ctx) { 
		if(ctx.arrayGen() != null) return visit(ctx.arrayGen());
		else if(ctx.objectGen() != null) return visit(ctx.objectGen());
		else{
			JsonProjection proj = new JsonProjection();
			proj.projection_type = JsonProjectionType.direct;
			proj.expression = new ExprVisitor(haveDollar, renameIds, prevSchemas, opType).visit(ctx.exprs());
			proj.retSchema = proj.expression.retSchema;
			return proj;
		}
	}
	
	@Override 
	public JsonProjection visitArrayGen(JaqlGrammarParser.ArrayGenContext ctx) { 
		JsonProjection proj = new JsonProjection();
		proj.projection_type = JsonProjectionType.array;
		proj.array_items = new ArrayList<JsonProjection>();
		proj.retSchema = new JsonSchema(JsonValueType.ARRAY);
		
		int i;
		JsonProjection tmpProj;
		for(i=0;i<ctx.jsonGen().size();i++){
			tmpProj = visit(ctx.jsonGen(i));
			if(proj.retSchema.items == null) 
				proj.retSchema.items = tmpProj.retSchema;
			else if(! proj.retSchema.items.equals(tmpProj.retSchema))
				throw new SemanticErrorException("data type varies in array");
			
			proj.array_items.add(tmpProj);
		}
		
		return proj;
	}
	
	@Override 
	public JsonProjection visitObjectGen(JaqlGrammarParser.ObjectGenContext ctx) {
		JsonProjection proj = new JsonProjection();
		proj.projection_type = JsonProjectionType.object;
		proj.fields = new HashMap<String, JsonProjection>();
		proj.retSchema = new JsonSchema(JsonValueType.OBJECT);
		
		int i;
		JsonProjection tmpProj;
		for(i=0;i<ctx.field().size();i++){
			tmpProj = visit(ctx.field(i));
			String name;
			if(tmpProj.need_rename == false)
				name = tmpProj.expression.getLastIdName();
			else
				name = tmpProj.rename;

			
			checkDuplication(proj.retSchema, name);
			proj.retSchema.properties.put(name, tmpProj.retSchema);
			proj.fields.put(name, tmpProj);
		}
		
		return proj; 
	}
	
	@Override 
	public JsonProjection visitField(JaqlGrammarParser.FieldContext ctx) {
		JsonProjection proj;
		if(ctx.var() != null){
			proj = new JsonProjection();
			proj.projection_type = JsonProjectionType.direct;
			proj.need_rename = false;
			proj.expression = new ExprVisitor(haveDollar, renameIds, prevSchemas, opType).visit(ctx.var());
			proj.retSchema = proj.expression.retSchema;
		}
		else{
			proj = visit(ctx.jsonGen());
			proj.need_rename = true;
			proj.rename = ctx.identifier().getText();
		}
		
		return proj;
	}
	
	private void checkDuplication(JsonSchema schema, String id){
		if(schema.properties.containsKey(id))
			throw new SemanticErrorException("variable "+id+" duplicated");
	}
}
