import java.util.List;

import com.google.gson.annotations.Expose;

public class JsonProjection {
	@Expose Boolean need_rename = null;
	@Expose String rename = null;
	@Expose Constants.JsonProjectionType type = null;
	@Expose List<JsonProjection> fields = null;		//for object type
	@Expose List<JsonProjection> array_items = null;		//for array type
	@Expose JsonExpression expression = null;		//for primitive type
	
	JsonSchema retSchema = new JsonSchema();
}
