package others;

import org.antlr.v4.runtime.*;
import constants.SyntaxErrorException;
import antlrGen.JaqlGrammarLexer;

public class BailJaqlGrammarLexer extends JaqlGrammarLexer{
	public BailJaqlGrammarLexer(CharStream input){super(input);}
	public void recover(LexerNoViableAltException e){
		System.out.println("lexer");
		throw new SyntaxErrorException(e);//Bail out
	}
}
