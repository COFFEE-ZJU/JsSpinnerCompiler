import com.google.gson.annotations.Expose;


public class JsonCondition {
	@Expose String op = null;		//and, or, gt, ge, lt, le, eq, ne, bool
	@Expose JsonCondition left_condition = null;
	@Expose JsonCondition right_condition = null;
	@Expose JsonExpression left_expression = null;
	@Expose JsonExpression right_expression = null;
	@Expose JsonExpression bool_expression = null;
}
