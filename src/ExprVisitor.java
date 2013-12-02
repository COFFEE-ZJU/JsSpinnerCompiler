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
			i=1;
		}
		else{
			if(haveRename)
				throw new SemanticErrorException("variable $ undefined");
			i=0;
		}

		expr.id_name = new ArrayList<Object>();
		for(; i<ctx.identifier().size(); i++){
			expr.id_name.add(ctx.identifier(i).getText());
		}
		JsonSchema tmpSch = prevSchema;
		String tmpString;
		int i;
		for(i=0;i<expr.id_name.size()-1;i++){
			tmpString = expr.id_name.get(i);
			checkAttrContaining(tmpSch, tmpString);
			if(tmpSch.nameToSchema.get(tmpString).type != Constants.JsonValueType.OBJECT)
				throw new SemanticErrorException("attribute "+tmpString+" is not an object type");
			tmpSch = tmpSch.nameToSchema.get(tmpString);
		}
		tmpString = expr.id_name.get(i);
		checkAttrContaining(tmpSch, tmpString);
		expr.retSchema = tmpSch.nameToSchema.get(tmpString);
		
		return expr;
	}
	
	private void dealWithIdWithArrays(JsonExpression expr, List<JaqlGrammarParser.IdWithArrayContext> ctxs, JsonSchema currSchema){
		expr.id_name = new ArrayList<Object>();
		JsonSchema tmpSchema = currSchema;
		
		String tmpString;
		int i;
		for(i=0;i<expr.id_name.size()-1;i++){
			tmpString = expr.id_name.get(i);
			checkAttrContaining(tmpSch, tmpString);
			if(tmpSch.nameToSchema.get(tmpString).type != Constants.JsonValueType.OBJECT)
				throw new SemanticErrorException("attribute "+tmpString+" is not an object type");
			tmpSch = tmpSch.nameToSchema.get(tmpString);
		}
		tmpString = expr.id_name.get(i);
		checkAttrContaining(tmpSch, tmpString);
		expr.retSchema = tmpSch.nameToSchema.get(tmpString);
	}
	
	@Override 
    public JsonExpression visitVarID(JaqlGrammarParser.VarIDContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		
		String rename = ctx.identifier(0).getText();
		if(! haveRename || ! rename.equals(renameId))
			throw new SemanticErrorException("variable "+rename+" undefined");
		expr.id_name = new ArrayList<String>();
		for(int i=1; i<ctx.identifier().size(); i++){
			expr.id_name.add(ctx.identifier(i).getText());
		}
		JsonSchema tmpSch = prevSchema;
		String tmpString;
		int i;
		for(i=0;i<expr.id_name.size()-1;i++){
			tmpString = expr.id_name.get(i);
			checkAttrContaining(tmpSch, tmpString);
			if(tmpSch.nameToSchema.get(tmpString).type != Constants.JsonValueType.OBJECT)
				throw new SemanticErrorException("attribute "+tmpString+" is not an object type");
			tmpSch = tmpSch.nameToSchema.get(tmpString);
		}
		tmpString = expr.id_name.get(i);
		checkAttrContaining(tmpSch, tmpString);
		expr.retSchema = tmpSch.nameToSchema.get(tmpString);
//		if(expr.retType == Constants.JsonValueType.ARRAY){
//			expr.arrayDataType = tmpSch.arrayNameToType.get(tmpString);
//			if(expr.arrayDataType == Constants.JsonValueType.OBJECT)
//				expr.objectSchema = tmpSch.objectNameToSchema.get(tmpString);
//		}
//		if(expr.retType == Constants.JsonValueType.OBJECT)
//			expr.objectSchema = tmpSch.objectNameToSchema.get(tmpString);
		
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
