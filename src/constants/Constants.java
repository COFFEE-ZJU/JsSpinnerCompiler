package constants;
import java.util.HashMap;
import java.util.Map;


public class Constants {
	public static final int THREAD_POOL_NUM = 20;
	public static final int INPUT_STREAM_LENGTH = 1024;
	public static final int SEND_JSSPINNER_PORT = 2048;
	public static final int LISTEN_PORT = 3000;
	public static final String JSSPINNER_HOST = "localhost";
	
	public static enum JsonExprType {ID, INT, NUMBER, BOOL, NULL, STRING, ADD, SUB, DIV, MUL, MOD, AGGREGATION};
	public static enum JsonCondType {AND, OR, NOT, GT, GE, LT, LE, EQ, NE, BOOL};
	public static enum JsonValueType{ARRAY, BOOLEAN, INTEGER, NUMBER, NULL, OBJECT, STRING};
	public static enum JsonProjectionType{OBJECT, ARRAY, DIRECT};
	public static enum ErrorType {SEMANTIC_ERROR, SYNTAX_ERROR};
	
	public static class WindowUnit {
		public static final String NOW = "now";
		public static final String UNBOUNDED = "unbounded";
		public static final String SECONDS = "seconds";
		public static final String MINUTES = "minutes";
		public static final String HOURS = "hours";
		public static final String DAYS = "days";
	}
	public static class AggrFuncNameString {
		public static final String COUNT = "count";
		public static final String AVERAGE = "avg";
		public static final String SUM = "sum";
		public static final String MIN = "min";
		public static final String MAX = "max";
	}
	
	public static enum JsonAttrSource{LEFT, RIGHT, GROUP_KEY_VAR, GROUP_ARRAY};
	public static enum AggrFuncNames{SUM, AVERAGE, COUNT};
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
		ROOT, ERROR, 
		PROJECTION, LEAF, JOIN, GROUPBY_AGGREGATION, SELECTION, EXPAND, 
		RANGEWINDOW, ROWWINDOW, PARTITIONWINDOW,
		ISTREAM, RSTREAM, DSTREAM
		};
	
	public static String LT = "<";
	public static String LE = "<=";
	public static String EQ = "==";
	public static String GE = ">=";
	public static String GT = ">";
	public static String NE = "!=";
	
	public static boolean isStreamType(JsonOpType type){
		if(type == Constants.JsonOpType.LEAF ||
    			type == Constants.JsonOpType.ISTREAM ||
    			type == Constants.JsonOpType.RSTREAM ||
    			type == Constants.JsonOpType.DSTREAM)
			return true;
		else
			return false;
	}
}
