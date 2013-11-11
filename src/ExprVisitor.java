
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
}
