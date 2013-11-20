import com.google.gson.annotations.Expose;


public class JsonJoinProjection {
	@Expose String attribute_source = null;		//left or right
	@Expose String attribute_name = null;
	@Expose Boolean need_rename = null;
	@Expose String rename = null;
}
