package others;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import com.google.gson.Gson;

import constants.Constants;
import constants.SemanticErrorException;

public class JsonSchemaUtils {
	static class JsonSchemaQuery{
		String type;
		String wrapper_name;
		
		public JsonSchemaQuery(String wrapperName){
			type = "get_schema";
			wrapper_name = wrapperName;
		}
	}
	
//	static class SchemaFormat{
//		JsonValueType type;
//		Object properties;
//		SchemaFormat items;
//	}

	public static JsonSchema getSchema(String wrapperName){
//		JsonSchema s = new JsonSchema();
//		s.nameToType.put("dept", JsonValueType.STRING);
//		s.nameToType.put("salary", JsonValueType.INTEGER);
//		s.nameToType.put("is_manager", JsonValueType.BOOLEAN);
//		s.nameToType.put("name", JsonValueType.STRING);
		
//		Object o;
		String jsonString;
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
			jsonString = new String(resB,0,len);
			socket.close();
//			o = new Gson().fromJson(jsonString, Object.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SemanticErrorException("schema for "+wrapperName+" not found");
		}
		
		//System.out.println(parseSchema(toSchemaFormat(o)));
		//return parseSchema(toSchemaFormat(o));
		return new Gson().fromJson(jsonString, JsonSchema.class);
	}
	
//	private static JsonSchema parseSchema(SchemaFormat sf){
//		JsonSchema js = new JsonSchema(sf.type);
//		if(sf.type == JsonValueType.ARRAY){
//			js.items = parseSchema(sf.items);
//		}
//		else if(sf.type == JsonValueType.OBJECT){
//			Map<String, Object> map = (Map<String, Object>)sf.properties;
//			Iterator<Entry<String, Object> > it = map.entrySet().iterator();
//			Entry<String, Object> ent;
//			SchemaFormat tempsf;
//			while(it.hasNext()){
//				ent = it.next();
//				//System.out.println(ent.getKey());
//				tempsf = toSchemaFormat(ent.getValue());
//				js.properties.put(ent.getKey(), parseSchema(tempsf));
////				if(type == JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf.properties));
////				else if(type == JsonValueType.ARRAY){
////					SchemaFormat sf2 = (SchemaFormat)sf.items;
////					JsonValueType type2 = stringToJsonValueType.get(sf2.type);
////					s.arrayNameToType.put(ent.getKey(), type2);
////					if(type2 == JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf2.properties));
////					else if(type2 == JsonValueType.ARRAY) throw new SemanticErrorException("array of array not supported yet");
////				}
//			}
//		}
//		return js;
//	}
//	
//	private static SchemaFormat toSchemaFormat(Object o){
//		Map<String, Object> map = (Map<String, Object>)o;
//		SchemaFormat sf = new SchemaFormat();
//		Iterator<Entry<String, Object> > it = map.entrySet().iterator();
//		Entry<String, Object> ent;
//		while(it.hasNext()){
//			ent = it.next();
//			switch (ent.getKey()) {
//			case "type":
//				sf.type = Constants.stringToJsonValueType.get((String)ent.getValue());
//				break;
//				
//			case "properties":
//				sf.properties = ent.getValue();
//				break;
//				
//			case "items":
//				sf.items = toSchemaFormat(ent.getValue());
//				break;
//
//			default:
//				break;
//			}
//		}
//		
//		return sf;
//	}
}
