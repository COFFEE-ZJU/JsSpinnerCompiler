import java.util.HashMap;
import java.util.Map;


public class JsonSchema {
	Map<String, Constants.JsonValueType> nameToType = new HashMap<String, Constants.JsonValueType>();
	
	public JsonSchema(){}
	public JsonSchema(JsonSchema schema){
		this.nameToType = new HashMap<String, Constants.JsonValueType>(schema.nameToType);
	}
	
	public static JsonSchema getSchema(String wrapperName){
		return new JsonSchema();	//TODO
	}
}
