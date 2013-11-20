import com.google.gson.annotations.Expose;


public class JsonProjection {
	@Expose Boolean need_rename = null;
	@Expose String rename = null;
	@Expose JsonExpression expression = null;		//if needRename == false, have to be leaf node;
	
	public JsonProjection(){}
	
	public JsonProjection(String idName) {	//simple projection, no rename
		this.need_rename = false;
		JsonExpression tmp = new JsonExpression();
		tmp.type = "id";
		tmp.id_name = idName;
		this.expression = tmp;
	}
	
	public JsonProjection(String idName, String rename) {	//simple projection, with rename
		this.need_rename = true;
		JsonExpression tmp = new JsonExpression();
		tmp.type = "id";
		tmp.id_name = idName;
		this.expression = tmp;
		this.rename = rename;
	}
}
