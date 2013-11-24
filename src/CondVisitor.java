
public class CondVisitor extends JaqlSampleBaseVisitor<JsonCondition> {
	private boolean haveRename;
	private String renameId;
	private JsonSchema prevSchema;
	
	public CondVisitor(boolean haveRename, String renameId, JsonSchema prevSchema){
		this.haveRename = haveRename;
		this.renameId = renameId;
		this.prevSchema = prevSchema;
	}
	
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
		cond.bool_expression = new ExprVisitor(haveRename, renameId, prevSchema).visit(ctx.var());
		if(cond.bool_expression.retType != Constants.JsonValueType.BOOLEAN)
			throw new SemanticErrorException("attribute "+cond.bool_expression.id_name+" is not boolean type");
		
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

		case ">=":
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

		cond.left_expression = new ExprVisitor(haveRename, renameId, prevSchema).visit(ctx.exprs(0));
		cond.right_expression = new ExprVisitor(haveRename, renameId, prevSchema).visit(ctx.exprs(1));
		Constants.JsonValueType let = cond.left_expression.retType;
		Constants.JsonValueType ret = cond.right_expression.retType;
		
		if((let != Constants.JsonValueType.INTEGER && let != Constants.JsonValueType.NUMBER)
				|| (ret != Constants.JsonValueType.INTEGER && ret != Constants.JsonValueType.NUMBER)){
			
			switch (cond.op) {
			case "eq":
			case "ne":
				if(let != ret && let != Constants.JsonValueType.NULL && ret != Constants.JsonValueType.NULL)
					throw new SemanticErrorException("comparision type mismatch");
				break;
			case "lt":
			case "le":
			case "gt":
			case "ge":
				if(let != ret) throw new SemanticErrorException("comparision type mismatch");
				break;
			default:
				break;
			}
			
		}
			
		
		return cond; 
	}
}
