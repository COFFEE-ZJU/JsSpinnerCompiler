import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
		Constants.JsonValueType type;
		Object properties;
		SchemaFormat items;
	}
	
	Constants.JsonValueType type = null; 	//can be any type
	JsonSchema items = null;				//for array type only
	Map<String, JsonSchema> nameToSchema = new HashMap<String, JsonSchema>();	//for object type only
	
//	Map<String, Constants.JsonValueType> nameToType = new HashMap<String, Constants.JsonValueType>();
//	Map<String, JsonSchema> objectNameToSchema = new HashMap<String, JsonSchema>();
//	Map<String, Constants.JsonValueType> arrayNameToType = new HashMap<String, Constants.JsonValueType>();
	
	public JsonSchema(){}
	public JsonSchema(Constants.JsonValueType type){
		this.type = type;
	}
	public JsonSchema(JsonSchema schema){
		this.type = schema.type;
		this.nameToSchema = new HashMap<String, JsonSchema>(schema.nameToSchema);
		if(schema.items != null) this.items = new JsonSchema(schema.items);
		
//		this.nameToType = new HashMap<String, Constants.JsonValueType>(schema.nameToType);
//		this.objectNameToSchema = new HashMap<String, JsonSchema>(schema.objectNameToSchema);
//		this.arrayNameToType = new HashMap<String, Constants.JsonValueType>(schema.arrayNameToType);
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
		
		System.out.println(parseSchema(toSchemaFormat(o)));
		return parseSchema(toSchemaFormat(o));
	}
	
	private static JsonSchema parseSchema(SchemaFormat sf){
		JsonSchema js = new JsonSchema();
		js.type = sf.type;
		if(sf.type == Constants.JsonValueType.ARRAY){
			js.items = parseSchema(sf.items);
		}
		else if(sf.type == Constants.JsonValueType.OBJECT){
			Map<String, Object> map = (Map<String, Object>)sf.properties;
			Iterator<Entry<String, Object> > it = map.entrySet().iterator();
			Entry<String, Object> ent;
			SchemaFormat tempsf;
			while(it.hasNext()){
				ent = it.next();
				//System.out.println(ent.getKey());
				tempsf = toSchemaFormat(ent.getValue());
				js.nameToSchema.put(ent.getKey(), parseSchema(tempsf));
//				if(type == Constants.JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf.properties));
//				else if(type == Constants.JsonValueType.ARRAY){
//					SchemaFormat sf2 = (SchemaFormat)sf.items;
//					Constants.JsonValueType type2 = Constants.stringToJsonValueType.get(sf2.type);
//					s.arrayNameToType.put(ent.getKey(), type2);
//					if(type2 == Constants.JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf2.properties));
//					else if(type2 == Constants.JsonValueType.ARRAY) throw new SemanticErrorException("array of array not supported yet");	//TODO
//				}
			}
		}
		return js;
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
				sf.type = Constants.stringToJsonValueType.get((String)ent.getValue());
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
		return new Gson().toJson(this);
	}
	
	public boolean equals(JsonSchema schema){
		if((this.type == Constants.JsonValueType.INTEGER || this.type == Constants.JsonValueType.NUMBER) &&
			(schema.type == Constants.JsonValueType.INTEGER || schema.type == Constants.JsonValueType.NUMBER))
			return true;
		
		if(this.type != schema.type) return false;
		
		if(this.type == Constants.JsonValueType.ARRAY) return this.items.equals(schema.items);
		
		if(this.type == Constants.JsonValueType.OBJECT){
			if(this.nameToSchema.size() != schema.nameToSchema.size()) return false;
			Entry<String, JsonSchema> ent;
			Iterator<Entry<String, JsonSchema> > it = this.nameToSchema.entrySet().iterator();
			while(it.hasNext()){
				ent = it.next();
				if(! schema.nameToSchema.containsKey(ent.getKey())) return false;
				if(! ent.getValue().equals(schema.nameToSchema.get(ent.getKey()))) return false;
			}
			
			return true;
		}
		
		return true;
	}
}
