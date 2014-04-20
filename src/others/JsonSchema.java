package others;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

import constants.Constants;
import constants.Constants.*;


public class JsonSchema {
	@Expose public String type = null;
	private JsonValueType valueType = null; 	//can be any type
	@Expose public JsonSchema items = null;				//for array type only
	@Expose public Map<String, JsonSchema> properties = null;	//for object type only
	
//	public JsonSchema(){}
	public JsonSchema(JsonValueType type){
		setType(type);
		if(getType() == JsonValueType.OBJECT) properties = new HashMap<String, JsonSchema>();
	}
	public JsonSchema(JsonSchema schema){
		schema.getType();
		setType(schema.valueType);
		if(schema.properties != null) this.properties = new HashMap<String, JsonSchema>(schema.properties);
		if(schema.items != null) this.items = new JsonSchema(schema.items);
	}
	
	public JsonValueType getType(){
		if(valueType == null) valueType = Constants.stringToJsonValueType.get(type);
		
		return valueType;
	}
	public void setType(JsonValueType type){
		valueType = type;
		this.type = valueType.toString().toLowerCase();
	}
	
	@Override
	public String toString(){
		return new Gson().toJson(this);
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof JsonSchema)) return false;
		
		JsonSchema schema = (JsonSchema)obj;
		if((this.valueType == JsonValueType.INTEGER || this.valueType == JsonValueType.NUMBER) &&
			(schema.valueType == JsonValueType.INTEGER || schema.valueType == JsonValueType.NUMBER))
			return true;
		
		if(this.valueType != schema.valueType) return false;
		
		if(this.valueType == JsonValueType.ARRAY) return this.items.equals(schema.items);
		
		if(this.valueType == JsonValueType.OBJECT){
			if(this.properties.size() != schema.properties.size()) return false;
			Entry<String, JsonSchema> ent;
			Iterator<Entry<String, JsonSchema> > it = this.properties.entrySet().iterator();
			while(it.hasNext()){
				ent = it.next();
				if(! schema.properties.containsKey(ent.getKey())) return false;
				if(! ent.getValue().equals(schema.properties.get(ent.getKey()))) return false;
			}
			
			return true;
		}
		
		return true;
	}
}
