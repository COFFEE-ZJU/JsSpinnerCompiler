import java.util.ArrayList;
import java.util.List;

public class ExprVisitor extends JaqlGrammarBaseVisitor<JsonExpression> {
	private boolean haveRename;
	private String renameId;
	private JsonSchema prevSchema;
	
	public ExprVisitor(boolean haveRename, String renameId, JsonSchema prevSchema){
		this.haveRename = haveRename;
		this.renameId = renameId;
		this.prevSchema = prevSchema;
	}
	
	@Override 
    public JsonExpression visitVar(JaqlGrammarParser.VarContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		int i;
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
			if(ctx.arraySymbol().get(i).INT() != null)
				expr.id_name.add(Integer.parseInt(ctx.arraySymbol().get(i).INT().getText()));
			else expr.id_name.add(-1);
			
			tmpSch = tmpSch.items;
		}
		
		if(ctx.arraySymbol().size() ==0 ) expr.lastNameIsArray = false;
		else expr.lastNameIsArray = true;
		dealWithIdWithArrays(expr, ctx.idWithArray(), tmpSch);
		
		return expr;
	}
	
	@Override 
    public JsonExpression visitVarID(JaqlGrammarParser.VarIDContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		int i;
		
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
			if(ctx.idWithArray(0).arraySymbol().get(i).INT() != null)
				expr.id_name.add(Integer.parseInt(ctx.idWithArray(0).arraySymbol().get(i).INT().getText()));
			else expr.id_name.add(-1);
			
			tmpSch = tmpSch.items;
		}
		
		if(ctx.idWithArray(0).arraySymbol().size() ==0 ) expr.lastNameIsArray = false;
		else expr.lastNameIsArray = true;
		dealWithIdWithArrays(expr, ctx.idWithArray().subList(1, ctx.idWithArray().size()), tmpSch);
		return expr;
	}
	
	private void dealWithIdWithArrays(JsonExpression expr, List<JaqlGrammarParser.IdWithArrayContext> ctxs, JsonSchema currSchema){
		JsonSchema tmpSch = currSchema;
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
				if(arrays.get(j).INT() != null)
					expr.id_name.add(Integer.parseInt(arrays.get(j).INT().getText()));
				else expr.id_name.add(-1);
				
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
