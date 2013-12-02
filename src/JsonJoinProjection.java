import java.util.List;

import com.google.gson.annotations.Expose;


public class JsonJoinProjection {
	@Expose String attribute_source = null;		//left or right
	@Expose List<Object> attribute_name = null;
	@Expose Boolean need_rename = null;
	@Expose String rename = null;
}
