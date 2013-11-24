
public class Constants {
	public static final int INPUT_STREAM_LENGTH = 1024;
	public static final int SEND_JSSPINNER_PORT = 2048;
	public static final int LISTEN_PORT = 3000;
	public static String JSSPINNER_HOST = "localhost";
	
	public static enum JsonValueType{ARRAY, BOOLEAN, INTEGER, NUMBER, NULL, OBJECT, STRING};
	public static enum DataType {STREAM,RELATION};
	public static enum OperationType {JOIN, FILTER, TRANS, GROUP, STREAM, WINDOW, NULL};
	
	public static String ISTREAM = "istream";
	public static String DSTREAM = "dstream";
	public static String RSTREAM = "rstream";
	
	public static String LT = "<";
	public static String LE = "<=";
	public static String EQ = "==";
	public static String GE = ">=";
	public static String GT = ">";
	public static String NE = "!=";
}
