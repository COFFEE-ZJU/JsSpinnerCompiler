import java.util.List;

import com.google.gson.annotations.Expose;


public class JsonExpression {
	@Expose String type = null;		//id, int, bool, null, string, add, sub, div, mul, aggregation;
	@Expose Constants.AggrFuncNames aggregate_operations = null;
	@Expose JsonExpression aggregate_expression = null;
	@Expose JsonExpression left = null;
	@Expose JsonExpression right = null;
	@Expose List<Object> id_name = null;
	@Expose String string_value = null;
	@Expose Integer int_value = null;
	@Expose Boolean bool_value = null;
	@Expose Constants.JsonAttrSource attribute_source = null;		//for join operation only
	
	JsonSchema retSchema = new JsonSchema();
	boolean lastNameIsArray = true;		//for id type only
	
	public String getLastIdName(){
		if(! type.equals("id")) throw new SemanticErrorException("expression is not id type");
		if(lastNameIsArray) throw new SemanticErrorException("need a field name");
		if(id_name.size()==0) return "";
		else return (String)id_name.get(id_name.size()-1);
	}
	
//	Constants.JsonValueType retType = null;
//	Constants.JsonValueType arrayDataType = null;
//	JsonSchema objectSchema = null;
}
