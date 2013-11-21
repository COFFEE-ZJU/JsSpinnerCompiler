

public class ExprVisitor extends JaqlSampleBaseVisitor<JsonExpression> {
	@Override 
    public JsonExpression visitVar(JaqlSampleParser.VarContext ctx) { 
		JsonExpression expr = new JsonExpression();
		expr.type = "id";
		if(ctx.identifier().size() == 2){
			String rename = ctx.identifier(0).getText();
			if(! TransVisitor.haveRename || ! rename.equals(TransVisitor.renameId))
				throw new SemanticErrorException("variable "+rename+" undefined");
			
			expr.id_name = ctx.identifier(1).getText();
		}
		else{
			if(TransVisitor.haveRename)
				throw new SemanticErrorException("variable $ undefined");
			expr.id_name = ctx.identifier(0).getText();
		}
		TransVisitor.checkAttrContaining(TransVisitor.prevSchema, expr.id_name);
		expr.retType = TransVisitor.prevSchema.nameToType.get(expr.id_name);
		
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprMulDivLabel(JaqlSampleParser.ExprMulDivLabelContext ctx) {
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
		
		if((expr.left.retType != Constants.JsonValueType.INTEGER && expr.left.retType != Constants.JsonValueType.NUMBER) ||
				(expr.right.retType != Constants.JsonValueType.INTEGER && expr.right.retType != Constants.JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide");
			
		if(expr.left.retType == Constants.JsonValueType.INTEGER && expr.right.retType == Constants.JsonValueType.INTEGER)
			expr.retType = Constants.JsonValueType.INTEGER;
		else
			expr.retType = Constants.JsonValueType.NUMBER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprAddSubLabel(JaqlSampleParser.ExprAddSubLabelContext ctx) {
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
		
		if((expr.left.retType != Constants.JsonValueType.INTEGER && expr.left.retType != Constants.JsonValueType.NUMBER) ||
				(expr.right.retType != Constants.JsonValueType.INTEGER && expr.right.retType != Constants.JsonValueType.NUMBER))
			throw new SemanticErrorException("unsupported type for multiply/divide");
		
		if(expr.left.retType == Constants.JsonValueType.INTEGER && expr.right.retType == Constants.JsonValueType.INTEGER)
			expr.retType = Constants.JsonValueType.INTEGER;
		else
			expr.retType = Constants.JsonValueType.NUMBER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprIntLabel(JaqlSampleParser.ExprIntLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "int";
		expr.int_value = Integer.parseInt(ctx.INT().getText());
		expr.retType = Constants.JsonValueType.INTEGER;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprBoolLabel(JaqlSampleParser.ExprBoolLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "bool";
		if(ctx.TRUE() != null) expr.bool_value = true;
		else expr.bool_value = false;
		
		expr.retType = Constants.JsonValueType.BOOLEAN;
		
		return expr;
	}
	
	@Override 
	public JsonExpression visitExprNullLabel(JaqlSampleParser.ExprNullLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "null";
		expr.retType = Constants.JsonValueType.NULL;
		
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprStringLabel(JaqlSampleParser.ExprStringLabelContext ctx) {
		JsonExpression expr = new JsonExpression();
		expr.type = "string";
		expr.string_value = ctx.STRING().getText().replaceAll("\"", "");
		expr.retType = Constants.JsonValueType.STRING;
		return expr; 
	}
	
	@Override 
	public JsonExpression visitExprSubExprLabel(JaqlSampleParser.ExprSubExprLabelContext ctx) {
		
		return visit(ctx.exprs()); 
	}
	
	@Override 
	public JsonExpression visitExprVarLabel(JaqlSampleParser.ExprVarLabelContext ctx) {
		
		return visit(ctx.var()); 
	}
}
