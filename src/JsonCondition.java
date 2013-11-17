
public class JsonCondition {
	String op = null;		//and, or, gt, ge, lt, le, eq, ne, bool
	JsonCondition left_condition = null;
	JsonCondition right_condition = null;
	JsonExpression left_expression = null;
	JsonExpression right_expression = null;
	JsonExpression bool_expression = null;
}
