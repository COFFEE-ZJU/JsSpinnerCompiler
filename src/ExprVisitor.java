
public class ExprVisitor extends JaqlSampleBaseVisitor<Expression> {
	@Override 
    public Expression visitVar(JaqlSampleParser.VarContext ctx) { 
		Expression expr = new Expression();
		expr.type = "id";
		if(ctx.ID().size() == 2){
			String rename = ctx.ID(0).getText();
			if(! TransVisitor.haveRename) assert false;
			if(! rename.equals(TransVisitor.renameId) ) assert false;
			
			expr.id_name = ctx.ID(1).getText();
		}
		else expr.id_name = ctx.ID(0).getText();
		
		return expr;
	}
	
	@Override 
	public Expression visitExprMulDivLabel(JaqlSampleParser.ExprMulDivLabelContext ctx) {
		Expression expr = new Expression();
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
		
		return expr; 
	}
	
	@Override 
	public Expression visitExprAddSubLabel(JaqlSampleParser.ExprAddSubLabelContext ctx) {
		Expression expr = new Expression();
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
		
		return expr; 
	}
	
	@Override 
	public Expression visitExprIntLabel(JaqlSampleParser.ExprIntLabelContext ctx) {
		Expression expr = new Expression();
		expr.type = "int";
		expr.int_value = Integer.parseInt(ctx.INT().getText());
		
		return expr; 
	}
	
	@Override 
	public Expression visitExprBoolLabel(JaqlSampleParser.ExprBoolLabelContext ctx) {
		Expression expr = new Expression();
		expr.type = "bool";
		if(ctx.TRUE() != null) expr.bool_value = true;
		else expr.bool_value = false;
		
		return expr;
	}
	
	@Override 
	public Expression visitExprNullLabel(JaqlSampleParser.ExprNullLabelContext ctx) {
		Expression expr = new Expression();
		expr.type = "null";
		
		return expr; 
	}
	
	@Override 
	public Expression visitExprStringLabel(JaqlSampleParser.ExprStringLabelContext ctx) {
		Expression expr = new Expression();
		expr.type = "string";
		expr.string_value = ctx.STRING().getText().replaceAll("\"", "");
		
		return expr; 
	}
	
	@Override 
	public Expression visitExprSubExprLabel(JaqlSampleParser.ExprSubExprLabelContext ctx) {
		
		return visit(ctx.exprs()); 
	}
	
	@Override 
	public Expression visitExprVarLabel(JaqlSampleParser.ExprVarLabelContext ctx) {
		
		return visit(ctx.var()); 
	}
}
