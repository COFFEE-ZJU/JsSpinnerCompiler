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
	
	static class SchemaFormat{
		String type;
		Object properties;
		SchemaFormat items;
	}
	
	Map<String, Constants.JsonValueType> nameToType = new HashMap<String, Constants.JsonValueType>();
	Map<String, JsonSchema> objectNameToSchema = new HashMap<String, JsonSchema>();
	Map<String, Constants.JsonValueType> arrayNameToType = new HashMap<String, Constants.JsonValueType>();
	
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
		
		SchemaFormat sf;
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
			sf = new Gson().fromJson(jsonString, SchemaFormat.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SemanticErrorException("schema for "+wrapperName+" not found");
		}
		
		//System.out.println(parseSchema(sf.properties));
		return parseSchema(sf.properties);
	}
	
	private static JsonSchema parseSchema(Object o){
		
		JsonSchema s = new JsonSchema();
//		o = map.get("information_source_schema");
//		map = (Map<String, Object>)o;
//		Object o = sf.properties;
		Map<String, Object> map = (Map<String, Object>)o;
		
		Iterator<Entry<String, Object> > it = map.entrySet().iterator();
		Entry<String, Object> ent;
		Map<String, String> sMap;
		SchemaFormat sf;
		while(it.hasNext()){
			ent = it.next();
			//System.out.println(ent.getKey());
			sf = toSchemaFormat(ent.getValue());
			Constants.JsonValueType type = Constants.stringToJsonValueType.get(sf.type);
			s.nameToType.put(ent.getKey(), type);
			if(type == Constants.JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf.properties));
			else if(type == Constants.JsonValueType.ARRAY){
				SchemaFormat sf2 = (SchemaFormat)sf.items;
				Constants.JsonValueType type2 = Constants.stringToJsonValueType.get(sf2.type);
				s.arrayNameToType.put(ent.getKey(), type2);
				if(type2 == Constants.JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf2.properties));
				else if(type2 == Constants.JsonValueType.ARRAY) throw new SemanticErrorException("array of array not supported yet");	//TODO
			}
		}
		
		return s;
	}
	
	private static SchemaFormat toSchemaFormat(Object o){
		Map<String, Object> map = (Map<String, Object>)o;
		SchemaFormat sf = new SchemaFormat();
		Iterator<Entry<String, Object> > it = map.entrySet().iterator();
		Entry<String, Object> ent;
		while(it.hasNext()){
			ent = it.next();
			switch (ent.getKey()) {
			case "type":
				sf.type = (String)ent.getValue();
				break;
				
			case "properties":
				sf.properties = ent.getValue();
				break;
				
			case "items":
				sf.items = toSchemaFormat(ent.getValue());
				break;

			default:
				break;
			}
		}
		
		return sf;
	}
	
	@Override
	public String toString(){
		String s1 = "nameToType" + nameToType.toString() + "\n";
		String s2 = "arrayNameToType" + arrayNameToType.toString() + "\n";
		String s3 = "objectNameToSchema" + objectNameToSchema.toString() + "\n";
		return s1+s2+s3;
	}
}
