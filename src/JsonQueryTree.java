import java.util.List;

import com.google.gson.annotations.Expose;

public class JsonQueryTree {
	@Expose String type = null;
	
	@Expose JsonCondition selection_condition = null;
	@Expose List<Object> left_join_attribute = null;
	@Expose List<Object> right_join_attribute = null;
	@Expose Boolean left_outter = null;
	@Expose Boolean right_outter = null;
	@Expose Object windowsize = null;
	@Expose String stream_source = null;
	@Expose List<Object> groupby_attribute_name = null;
	@Expose List<List<Object> > aggregation_attribute_names = null;
	@Expose List<String> result_attribute_names = null;
	@Expose List<String> aggregate_operations = null;
	@Expose List<Object> expand_attribute_name = null;
	@Expose Boolean is_master = null;
	
	@Expose List<JsonProjection> projection_attibute_set = null;
	@Expose List<JsonJoinProjection> join_projection_set = null;
	@Expose JsonQueryTree input = null;
	@Expose JsonQueryTree left_input = null;
	@Expose JsonQueryTree right_input = null;
	
	@Expose String error_message = null;
}
