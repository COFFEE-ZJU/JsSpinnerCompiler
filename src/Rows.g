grammar Rows;

@parser::members{//addmemberstogeneratedRowsParser
	int col;
	public RowsParser(TokenStream input,int col){	//customconstructor
		this(input);
		this.col=col;
	}
}

file:(row NL)+;

row
locals[int i=0]
 :( STUFF
		{
		$i++;
		if($i==col)System.out.println($STUFF.text);
		}
	)+
;

TAB : '\t'->skip; //matchbutdon'tpasstotheparser
NL : '\r'?'\n'; //matchandpasstotheparser
STUFF: ~[\t\r\n]+; //matchanycharsexcepttab,newline