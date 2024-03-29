package jsonAPI;

import java.util.List;
import others.JsonSchema;
import com.google.gson.annotations.Expose;

import constants.Constants.DataType;
import constants.Constants.JsonOpType;

public class JsonQueryTree {
	@Expose public JsonOpType type = null;
	
	@Expose public JsonCondition selection_condition = null;
	@Expose public List<Object> left_join_attribute = null;
	@Expose public List<Object> right_join_attribute = null;
	@Expose public Boolean left_outer = null;
	@Expose public Boolean right_outer = null;
	@Expose public Object windowsize = null;
	@Expose public String stream_source = null;
	@Expose public List<Object> groupby_attribute_name = null;
//	@Expose public List<List<Object> > aggregation_attribute_names = null;
//	@Expose public List<String> result_attribute_names = null;
//	@Expose public List<String> aggregate_operations = null;
	@Expose public Boolean is_master = null;
	
	@Expose public JsonProjection projection = null;
	@Expose public JsonQueryTree input = null;
	@Expose public JsonQueryTree left_input = null;
	@Expose public JsonQueryTree right_input = null;
	
	@Expose public String error_message = null;
	
	@Expose public JsonSchema schema = null;
	public DataType dataType = null;
}
