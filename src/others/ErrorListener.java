package others;

import org.antlr.v4.runtime.*;

import constants.SyntaxErrorException;

public class ErrorListener extends BaseErrorListener{
	@Override
	public void syntaxError(Recognizer<?,?> recognizer,
							Object offendingSymbol,
							int line,int charPositionInLine,
							String msg,
							RecognitionException e){
		throw new SyntaxErrorException("line "+line+":"+charPositionInLine+" "+msg);
		//just throw the exception with the detailed info
	}
}
