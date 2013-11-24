import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;


public class JsonSchema {
	static class JsonSchemaQuery{
		String type;
		String wrapper_name;
		
		public JsonSchemaQuery(String wrapperName){
			type = "get_schema";
			wrapper_name = wrapperName;
		}
	}
	
	Map<String, Constants.JsonValueType> nameToType = new HashMap<String, Constants.JsonValueType>();
	
	public JsonSchema(){}
	public JsonSchema(JsonSchema schema){
		this.nameToType = new HashMap<String, Constants.JsonValueType>(schema.nameToType);
	}
	
	public static JsonSchema getSchema(String wrapperName){
		JsonSchema s = new JsonSchema();	//TODO
//		s.nameToType.put("dept", Constants.JsonValueType.STRING);
//		s.nameToType.put("salary", Constants.JsonValueType.INTEGER);
//		s.nameToType.put("is_manager", Constants.JsonValueType.BOOLEAN);
//		s.nameToType.put("name", Constants.JsonValueType.STRING);
		
		Object o;
		JsonSchemaQuery query = new JsonSchemaQuery(wrapperName);
		try {
			Socket socket = new Socket(Constants.JSSPINNER_HOST, Constants.SEND_JSSPINNER_PORT);
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			String outString = new Gson().toJson(query);
			//System.out.println(outString);
			out.write(outString.getBytes());
			out.flush();
			//out.close();
			
			byte[] resB = new byte[Constants.INPUT_STREAM_LENGTH];
			
			int len = in.read(resB);
			String jsonString = new String(resB,0,len);
			socket.close();
			o = new Gson().fromJson(jsonString, Object.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SemanticErrorException("schema for "+wrapperName+" not found");
		}
		
		Map<String, Object> map = (Map<String, Object>)o;
		o = map.get("information_source_schema");
		map = (Map<String, Object>)o;
		o = map.get("properties");
		map = (Map<String, Object>)o;
		
		Iterator<Entry<String, Object> > it = map.entrySet().iterator();
		Entry<String, Object> ent;
		Map<String, String> sMap;
		while(it.hasNext()){
			ent = it.next();
			//System.out.println(ent.getKey());
			sMap = (Map<String, String>)ent.getValue();
			
			switch (sMap.get("type")) {
			case "integer":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.INTEGER);
				break;
				
			case "number":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.NUMBER);
				break;
				
			case "null":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.NULL);
				break;
				
			case "string":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.STRING);
				break;
				
			case "object":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.OBJECT);
				break;
				
			case "boolean":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.BOOLEAN);
				break;
				
			case "array":
				s.nameToType.put(ent.getKey(), Constants.JsonValueType.ARRAY);
				break;
				
			default:
				throw new SemanticErrorException("error type in schema file");
			}
		}
		
		return s;
	}
	
	@Override
	public String toString(){
		return nameToType.toString();
	}
}
