grammar JaqlSample_v1_0;

prog: stat+ ;

//stat:	ID '=' expr
//	|	pipe ;

stat:	pipe ';'
        |   join ';'
        |   assignView ';'
        |   readStream ';'
        |   ID ';'
        |   NEWLINE
	;

readStream: ID '=' 'readFromWrapper' '(' '"' ID '"' ')'
          ;

assignView: ID '=' pipe
          ;

join: 'join' joinVar ',' joinVar
      'where' ('(' conditions ')' | conditions)
      'into' joinOut
    ;

joinVar: (ID 'in')? ID;

joinOut:'{' varID (',' varID)* '}'
       ;

pipe: ID ( '->' pipeExpr )+ ;

pipeExpr: 'filter' ('each' ID)? conditions                                      #filterLabel
	| 'transform' ('each' ID)? transExpr                                    #tansformLabel
        | 'group' (geach='each' ID)? (gby='by' ID '=' var (gas='as' ID)? )? 'into' aggrExpr   #groupSingleLabel
        | 'window' '[' windowRange ']'                                          #windowLabel
        | stream                                                                #streamLabel
	;

stream: 'istream' | 'dstream' | 'rstream';

windowRange: 'range' ( (INT ) timeUnit | 'unbounded')                           #windowTimeLabel
           | 'rows' (INT | 'unbounded')                                         #windowRowLabel
           | 'partitioned by' ID (',' ID)* 'rows' INT                           #windowPartitionLabel
           ;

timeUnit: ('seconds' | 'minutes' | 'hours' | 'days');

aggrExpr: '{' (ID | (ID ':' aggrFunc)) (',' ID | (ID ':' aggrFunc) )* '}'
        ;
aggrFunc: aggrFuncNames '(' (ID|'$') '[*].' ID ')'
        ;
aggrFuncNames:'sum'|'avg'|'max'|'min';

transExpr: '{' var (',' var)* '}';

conditions: conditions2 ('or' conditions2)* ;

conditions2: condition ('and' condition)* ;

condition: '(' conditions ')' 
	| var
	| var comprator (INT | var) ;

comprator: ('<' | '<=' | '==' | '>=' | '>' | '!=') ;

var: (ID | '$') ('.' ID)?  ;
varID: (ID) ('.' ID)?  ;

ID  :   ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
