package test;
import org.antlr.v4.runtime.*;

class Col{
	public static void main(String[] args) throws Exception{
		ANTLRInputStream input=new ANTLRInputStream(System.in);
		RowsLexer lexer = new RowsLexer(input);
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		int col = Integer.valueOf(args[0]);
		RowsParser parser = new RowsParser(tokens,col);//passcolumnnumber!
		parser.setBuildParseTree(false);//don'twastetimebuldingatree
		parser.file();//parse
	}

}
