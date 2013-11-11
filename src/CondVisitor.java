import java.util.ArrayList;


public class CondVisitor extends JaqlSampleBaseVisitor<Condition> {
	@Override 
	public Condition visitCondAndLabel(JaqlSampleParser.CondAndLabelContext ctx) { 
		Condition cond = new Condition();
		cond.op = "and";
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public Condition visitCondOrLabel(JaqlSampleParser.CondOrLabelContext ctx) { 
		Condition cond = new Condition();
		cond.op = "or";
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public Condition visitCondSubLabel(JaqlSampleParser.CondSubLabelContext ctx) { 
		
		return visit(ctx.conditions()); 
	}
	
	@Override 
	public Condition visitCondVarLabel(JaqlSampleParser.CondVarLabelContext ctx) { 
		Condition cond = new Condition();
		cond.op = "bool";
		cond.bool_expression = new ExprVisitor().visit(ctx.var());
		return cond; 
	}
	
	@Override 
	public Condition visitCondCompLabel(JaqlSampleParser.CondCompLabelContext ctx) { 
		Condition cond = new Condition();
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
