package others;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

import constants.Constants;
import constants.Constants.*;
import constants.SemanticErrorException;


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
		JsonValueType type;
		Object properties;
		SchemaFormat items;
	}
	
	@Expose public JsonValueType type = null; 	//can be any type
	@Expose public JsonSchema items = null;				//for array type only
	@Expose public Map<String, JsonSchema> nameToSchema = new HashMap<String, JsonSchema>();	//for object type only
	
//	Map<String, JsonValueType> nameToType = new HashMap<String, JsonValueType>();
//	Map<String, JsonSchema> objectNameToSchema = new HashMap<String, JsonSchema>();
//	Map<String, JsonValueType> arrayNameToType = new HashMap<String, JsonValueType>();
	
	public JsonSchema(){}
	public JsonSchema(JsonValueType type){
		this.type = type;
	}
	public JsonSchema(JsonSchema schema){
		this.type = schema.type;
		this.nameToSchema = new HashMap<String, JsonSchema>(schema.nameToSchema);
		if(schema.items != null) this.items = new JsonSchema(schema.items);
		
//		this.nameToType = new HashMap<String, JsonValueType>(schema.nameToType);
//		this.objectNameToSchema = new HashMap<String, JsonSchema>(schema.objectNameToSchema);
//		this.arrayNameToType = new HashMap<String, JsonValueType>(schema.arrayNameToType);
	}
	
	
	public static JsonSchema getSchema(String wrapperName){
//		JsonSchema s = new JsonSchema();
//		s.nameToType.put("dept", JsonValueType.STRING);
//		s.nameToType.put("salary", JsonValueType.INTEGER);
//		s.nameToType.put("is_manager", JsonValueType.BOOLEAN);
//		s.nameToType.put("name", JsonValueType.STRING);
		
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
		
		//System.out.println(parseSchema(toSchemaFormat(o)));
		return parseSchema(toSchemaFormat(o));
	}
	
	private static JsonSchema parseSchema(SchemaFormat sf){
		JsonSchema js = new JsonSchema();
		js.type = sf.type;
		if(sf.type == JsonValueType.ARRAY){
			js.items = parseSchema(sf.items);
		}
		else if(sf.type == JsonValueType.OBJECT){
			Map<String, Object> map = (Map<String, Object>)sf.properties;
			Iterator<Entry<String, Object> > it = map.entrySet().iterator();
			Entry<String, Object> ent;
			SchemaFormat tempsf;
			while(it.hasNext()){
				ent = it.next();
				//System.out.println(ent.getKey());
				tempsf = toSchemaFormat(ent.getValue());
				js.nameToSchema.put(ent.getKey(), parseSchema(tempsf));
//				if(type == JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf.properties));
//				else if(type == JsonValueType.ARRAY){
//					SchemaFormat sf2 = (SchemaFormat)sf.items;
//					JsonValueType type2 = stringToJsonValueType.get(sf2.type);
//					s.arrayNameToType.put(ent.getKey(), type2);
//					if(type2 == JsonValueType.OBJECT) s.objectNameToSchema.put(ent.getKey(), parseSchema(sf2.properties));
//					else if(type2 == JsonValueType.ARRAY) throw new SemanticErrorException("array of array not supported yet");
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
		if((this.type == JsonValueType.INTEGER || this.type == JsonValueType.NUMBER) &&
			(schema.type == JsonValueType.INTEGER || schema.type == JsonValueType.NUMBER))
			return true;
		
		if(this.type != schema.type) return false;
		
		if(this.type == JsonValueType.ARRAY) return this.items.equals(schema.items);
		
		if(this.type == JsonValueType.OBJECT){
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
