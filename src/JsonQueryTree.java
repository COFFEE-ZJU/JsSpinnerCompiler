import java.util.List;

import com.google.gson.annotations.Expose;

public class JsonQueryTree {
	@Expose String type = null;
	
	@Expose JsonCondition selection_condition = null;
	@Expose List<String> left_join_attribute = null;
	@Expose List<String> right_join_attribute = null;
	@Expose String windowsize = null;
	@Expose String stream_source = null;
	@Expose List<String> groupby_attribute_names = null;
	@Expose List<String> aggregation_attribute_name = null;
	@Expose String result_attribute_name = null;
	@Expose String aggregate_operation = null;
	@Expose Boolean is_master = null;
	
	@Expose List<JsonProjection> projection_attibute_set = null;
	@Expose List<JsonJoinProjection> join_projection_set = null;
	@Expose JsonQueryTree input = null;
	@Expose JsonQueryTree left_input = null;
	@Expose JsonQueryTree right_input = null;
	
	@Expose String error_message = null;
}
