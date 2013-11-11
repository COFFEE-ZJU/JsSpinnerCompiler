import java.util.List;

public class Condition {
	String op = null;		//and, or, gt, ge, lt, le, eq, ne, bool
	Condition left_condition = null;
	Condition right_condition = null;
	Expression left_expreassion = null;
	Expression right_expreassion = null;
	Expression bool_expression = null;
}
