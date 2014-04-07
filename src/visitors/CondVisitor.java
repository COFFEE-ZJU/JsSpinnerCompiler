package visitors;

import jsonAPI.JsonCondition;
import others.JsonSchema;

import antlrGen.JaqlGrammarBaseVisitor;
import antlrGen.JaqlGrammarParser;
import constants.Constants.*;
import constants.SemanticErrorException;


public class CondVisitor extends JaqlGrammarBaseVisitor<JsonCondition> {
	private boolean haveDollar;
	private String renameId;
	private JsonSchema prevSchema;
	
	public CondVisitor(boolean haveDollar, String renameId, JsonSchema prevSchema){
		this.haveDollar = haveDollar;
		this.renameId = renameId;
		this.prevSchema = prevSchema;
	}
	
	@Override 
	public JsonCondition visitCondAndLabel(JaqlGrammarParser.CondAndLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.condition_type = JsonCondType.AND;
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondOrLabel(JaqlGrammarParser.CondOrLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.condition_type = JsonCondType.OR;
		cond.left_condition = visit(ctx.conditions(0));
		cond.right_condition = visit(ctx.conditions(1));
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondNegLabel(JaqlGrammarParser.CondNegLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.condition_type = JsonCondType.NOT;
		cond.condition = visit(ctx.conditions());
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondSubLabel(JaqlGrammarParser.CondSubLabelContext ctx) { 
		
		return visit(ctx.conditions()); 
	}
	
	@Override 
	public JsonCondition visitCondVarLabel(JaqlGrammarParser.CondVarLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		cond.condition_type = JsonCondType.BOOL;
		cond.bool_expression = new ExprVisitor(haveDollar, renameId, prevSchema).visit(ctx.var());
		if(cond.bool_expression.retSchema.getType() != JsonValueType.BOOLEAN)
			throw new SemanticErrorException("attribute "+cond.bool_expression.id_name+" is not boolean type");
		
		return cond; 
	}
	
	@Override 
	public JsonCondition visitCondCompLabel(JaqlGrammarParser.CondCompLabelContext ctx) { 
		JsonCondition cond = new JsonCondition();
		
		String comp = ctx.comprator().getText();
		switch (comp) {
		case "<":
			cond.condition_type = JsonCondType.LT;
			break;
			
		case "<=":
			cond.condition_type = JsonCondType.LE;
			break;

		case "==":
			cond.condition_type = JsonCondType.EQ;
			break;

		case ">=":
			cond.condition_type = JsonCondType.GE;
			break;

		case ">":
			cond.condition_type = JsonCondType.GT;
			break;

		case "!=":
			cond.condition_type = JsonCondType.NE;
			break;

		default:
			break;
		}

		cond.left_expression = new ExprVisitor(haveDollar, renameId, prevSchema).visit(ctx.exprs(0));
		cond.right_expression = new ExprVisitor(haveDollar, renameId, prevSchema).visit(ctx.exprs(1));
		JsonValueType let = cond.left_expression.retSchema.getType();
		JsonValueType ret = cond.right_expression.retSchema.getType();
		
		if((let != JsonValueType.INTEGER && let != JsonValueType.NUMBER)
				|| (ret != JsonValueType.INTEGER && ret != JsonValueType.NUMBER)){
			
			switch (cond.condition_type) {
			case EQ:
			case NE:
				if(let == JsonValueType.NULL || ret == JsonValueType.NULL) break;
				
				if(! cond.left_expression.retSchema.equals(cond.right_expression.retSchema))
					throw new SemanticErrorException("comparision type mismatch");
				break;
			case LT:
			case LE:
			case GT:
			case GE:
				if(let != ret) throw new SemanticErrorException("comparision type mismatch");
				if(let != JsonValueType.INTEGER && let != JsonValueType.NUMBER && let != JsonValueType.STRING)
					throw new SemanticErrorException("comparision type: "+let+"not allowed");
			default:
				break;
			}
			
		}
			
		
		return cond; 
	}
}
