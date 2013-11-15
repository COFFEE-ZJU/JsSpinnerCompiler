import java.util.List;

public class JsonQueryTree {
	String type = null;
	
	JsonCondition selection_condition = null;
	String left_join_attribute = null;
	String right_join_attribute = null;
	String windowsize = null;
	String stream_source = null;
	String groupby_attribute_name = null;
	String aggregation_attribute_name = null;
	String result_attribute_name = null;
	String aggregate_operation = null;
	Boolean is_master = null;
	
	List<String> projection_attibute_set = null;
	List<JsonJoinProjection> join_projection_set = null;
	JsonQueryTree input = null;
	JsonQueryTree left_input = null;
	JsonQueryTree right_input = null;
}
