import java.util.ArrayList;
import java.util.List;


public class ProjectionVisitor extends JaqlGrammarBaseVisitor<JsonProjection>{
	private boolean haveDollar;
	private List<String> renameIds;
	private List<JsonSchema> prevSchemas;
	
	public ProjectionVisitor(boolean haveDollar, List<String> renameIds, List<JsonSchema> prevSchemas){
		this.haveDollar = haveDollar;
		this.renameIds = renameIds;
		this.prevSchemas = prevSchemas;
	}
	
	@Override 
	public JsonProjection visitJsonGen(JaqlGrammarParser.JsonGenContext ctx) { 
		if(ctx.arrayGen() != null) return visit(ctx.arrayGen());
		else if(ctx.objectGen() != null) return visit(ctx.objectGen());
		else{
			JsonProjection proj = new JsonProjection();
			proj.type = Constants.JsonProjectionType.direct;
			proj.expression = new ExprVisitor(haveDollar, renameIds, prevSchemas).visit(ctx.exprs());
			proj.retSchema = proj.expression.retSchema;
			return proj;
		}
	}
	
	@Override 
	public JsonProjection visitArrayGen(JaqlGrammarParser.ArrayGenContext ctx) { 
		JsonProjection proj = new JsonProjection();
		proj.type = Constants.JsonProjectionType.array;
		proj.array_items = new ArrayList<JsonProjection>();
		proj.retSchema.type = Constants.JsonValueType.ARRAY;
		
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
		proj.type = Constants.JsonProjectionType.object;
		proj.fields = new ArrayList<JsonProjection>();
		proj.retSchema.type = Constants.JsonValueType.OBJECT;
		
		int i;
		JsonProjection tmpProj;
		for(i=0;i<ctx.field().size();i++){
			tmpProj = visit(ctx.field(i));
			if(tmpProj.need_rename == false)
				proj.retSchema.nameToSchema.put(tmpProj.expression.getLastIdName(), tmpProj.retSchema);
			else
				proj.retSchema.nameToSchema.put(tmpProj.rename, tmpProj.retSchema);
			
			proj.fields.add(tmpProj);
		}
		
		return proj; 
	}
	
	@Override 
	public JsonProjection visitField(JaqlGrammarParser.FieldContext ctx) {
		JsonProjection proj;
		if(ctx.var() != null){
			proj = new JsonProjection();
			proj.need_rename = false;
			proj.expression = new ExprVisitor(haveDollar, renameIds, prevSchemas).visit(ctx.var());
			proj.retSchema = proj.expression.retSchema;
		}
		else{
			proj = visit(ctx.jsonGen());
			proj.need_rename = true;
			proj.rename = ctx.identifier().getText();
		}
		
		return proj;
	}
}
