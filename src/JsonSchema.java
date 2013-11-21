import java.util.HashMap;
import java.util.Map;


public class JsonSchema {
	Map<String, Constants.JsonValueType> nameToType = new HashMap<String, Constants.JsonValueType>();
	
	public JsonSchema(){}
	public JsonSchema(JsonSchema schema){
		this.nameToType = new HashMap<String, Constants.JsonValueType>(schema.nameToType);
	}
	
	public static JsonSchema getSchema(String wrapperName){
		JsonSchema s = new JsonSchema();	//TODO
		s.nameToType.put("dept", Constants.JsonValueType.STRING);
		s.nameToType.put("salary", Constants.JsonValueType.INTEGER);
		s.nameToType.put("is_manager", Constants.JsonValueType.BOOLEAN);
		s.nameToType.put("name", Constants.JsonValueType.STRING);
		
		return s;
	}
	
	@Override
	public String toString(){
		return nameToType.toString();
	}
}
