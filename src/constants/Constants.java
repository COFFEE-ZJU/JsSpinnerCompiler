package constants;
import java.util.HashMap;
import java.util.Map;


public class Constants {
	public static final int THREAD_POOL_NUM = 20;
	public static final int INPUT_STREAM_LENGTH = 1024;
	public static final int SEND_JSSPINNER_PORT = 2048;
	public static final int LISTEN_PORT = 3000;
	public static String JSSPINNER_HOST = "localhost";
	
	public static enum JsonValueType{ARRAY, BOOLEAN, INTEGER, NUMBER, NULL, OBJECT, STRING};
	public static enum JsonProjectionType{object, array, direct};
	public static enum JsonAttrSource{left, right, group_key_var, group_array};
	public static enum AggrFuncNames{sum, average, count};
	public static Map<String, JsonValueType> stringToJsonValueType = new HashMap<String, Constants.JsonValueType>(){
		private static final long serialVersionUID = -3817390131714920532L;
		{
			put("array",JsonValueType.ARRAY);
			put("boolean",JsonValueType.BOOLEAN);
			put("integer",JsonValueType.INTEGER);
			put("number",JsonValueType.NUMBER);
			put("null",JsonValueType.NULL);
			put("object",JsonValueType.OBJECT);
			put("string",JsonValueType.STRING);
		}
	};
	public static enum DataType {STREAM,RELATION};
	public static enum OperationType {JOIN, FILTER, TRANS, GROUP, STREAM, WINDOW, EXPAND, NULL};
	public static enum JsonOpType{
		root, error, 
		projection, leaf, join, groupby_aggregation, selection, expand, 
		rangewindow, rowwindow, partitionwindow,
		istream, rstream, dstream
		};
	
	public static String LT = "<";
	public static String LE = "<=";
	public static String EQ = "==";
	public static String GE = ">=";
	public static String GT = ">";
	public static String NE = "!=";
	
	public static boolean isStreamType(JsonOpType type){
		if(type == Constants.JsonOpType.leaf ||
    			type == Constants.JsonOpType.istream ||
    			type == Constants.JsonOpType.rstream ||
    			type == Constants.JsonOpType.dstream)
			return true;
		else
			return false;
	}
}
