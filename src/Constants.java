
public class Constants {
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
