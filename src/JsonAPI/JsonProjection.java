package JsonAPI;

import java.util.List;

import others.JsonSchema;

import com.google.gson.annotations.Expose;

import constants.Constants.JsonProjectionType;

public class JsonProjection {
	@Expose public Boolean need_rename = null;
	@Expose public String rename = null;
	@Expose public JsonProjectionType type = null;
	@Expose public List<JsonProjection> fields = null;		//for object type
	@Expose public List<JsonProjection> array_items = null;		//for array type
	@Expose public JsonExpression expression = null;		//for primitive type
	
	public JsonSchema retSchema = new JsonSchema();
}