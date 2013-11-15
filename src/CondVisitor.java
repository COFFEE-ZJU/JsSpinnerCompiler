
public class CondVisitor extends JaqlSampleBaseVisitor<JsonCondition> {
	@Override 
	public JsonCondition visitCondAndLabel(JaqlSampleParser.CondAndLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.op = "and";
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondOrLabel(JaqlSampleParser.CondOrLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.op = "or";
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondSubLabel(JaqlSampleParser.CondSubLabelContext ctx) { 
		
		return visit(ctx.conditions()); 
	}
	
	@Override 
	public JsonCondition visitCondVarLabel(JaqlSampleParser.CondVarLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.op = "bool";
		cond.bool_expression = new ExprVisitor().visit(ctx.var());
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondCompLabel(JaqlSampleParser.CondCompLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		String comp = ctx.comprator().getText();
		switch (comp) {
		case "<":
			cond.op = "lt";
			break;
			
		case "<=":
			cond.op = "le";
			break;

		case "==":
			cond.op = "eq";
			break;

		case "=>":
			cond.op = "ge";
			break;

		case ">":
			cond.op = "gt";
			break;

		case "!=":
			cond.op = "ne";
			break;

		default:
			break;
		}
		
		cond.left_expreassion = new ExprVisitor().visit(ctx.exprs(0));
		cond.right_expreassion = new ExprVisitor().visit(ctx.exprs(1));
		
		return cond; 
	}
}
