import java.util.List;

import com.google.gson.annotations.Expose;


public class JsonExpression {
	@Expose String type = null;		//id, int, bool, null, string, add, sub, div, mul;
	@Expose JsonExpression left = null;
	@Expose JsonExpression right = null;
	@Expose List<String> id_name = null;
	@Expose String string_value = null;
	@Expose Integer int_value = null;
	@Expose Boolean bool_value = null;
	
	Constants.JsonValueType retType = null;
	Constants.JsonValueType arrayDataType = null;
	JsonSchema objectSchema = null;
}
