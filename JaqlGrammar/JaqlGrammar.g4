grammar JaqlGrammar;

prog: stat+ ;

//stat:	identifier '=' expr
//	|	pipe ;

stat:	pipe ';'
        |   join ';'
        |   assignView ';'
        |   readStream ';'
        |   identifier ';'
        |   NEWLINE
	;

readStream: identifier '=' 'readFromWrapper' '(' STRING ',' (TRUE|FALSE) ')'
          ;

assignView: identifier '=' ( pipe | join )
          ;

join: 'join' joinVar ',' joinVar
      'where' var '==' var
      'into' jsonGen
    ;

joinVar: (preserve='preserve')? (identifier 'in')? identifier;

//joinOut:'{' joinOutVar (',' joinOutVar)* '}' ;

//joinOutVar: (identifier ':')? varID ;

pipe: identifier ( '->' pipeExpr )+ ;

pipeExpr: 'filter' ('each' identifier)? conditions                                      #filterLabel
	| 'transform' ('each' identifier)? jsonGen                                    #transformLabel
        | 'group' (geach='each' identifier)? (gby='by' identifier '=' var (gas='as' identifier)? ) 'into' jsonGen   #groupSingleLabel
        | 'window' '[' windowRange ']'                                          #windowLabel
        | 'expand' ('each' identifier)? jsonGen?                                     #expandLabel
        | stream                                                                #streamLabel
	;

stream: 'istream' | 'dstream' | 'rstream';

windowRange: 'range' ( (INT ) timeUnit | timeRange)                           #windowTimeLabel
           | 'rows' (INT | 'unbounded')                                         #windowRowLabel
           | 'partitioned by' identifier (',' identifier)* 'rows' INT                           #windowPartitionLabel
           ;
timeRange: 'unbounded' | 'now' ;

timeUnit: ('seconds' | 'minutes' | 'hours' | 'days');

//aggrExprs: '{' aggrExpr (',' aggrExpr )* '}' ;

/*aggrExpr: (identifier ':')? varID
        | (identifier ':' aggrFunc)
        ;
*/

//transExpr: '{' transExprVar (',' transExprVar)* '}';

/*transExprVar: identifier ':' exprs
            | var
            ;
*/

conditions: conditions 'and' conditions                                         #condAndLabel
          | conditions 'or' conditions                                          #condOrLabel
          | exprs comprator exprs                                               #condCompLabel
          | var                                                                 #condVarLabel
          | '(' conditions ')'                                                  #condSubLabel
          ;

comprator: ('<' | '<=' | '==' | '>=' | '>' | '!=') ;

jsonGen:    arrayGen
       |    objectGen
       |    exprs
       ;

arrayGen:    '[' jsonGen (','jsonGen)* ']' ;
objectGen:  '{' field (',' field)* '}';

field:  identifier ':' jsonGen
     |  var
     ;
           
exprs: exprs op=('*'|'/') exprs                                                 #exprMulDivLabel
     |  exprs op=('+'|'-') exprs                                                #exprAddSubLabel
     |  var                                                                     #exprVarLabel
     |  INT                                                                     #exprIntLabel
     |  (TRUE | FALSE)                                                          #exprBoolLabel
     |  NULL                                                                    #exprNullLabel
     |  STRING                                                                  #exprStringLabel
     |  '(' exprs ')'                                                           #exprSubExprLabel
     | aggrFuncName                                                             #exprAggrFuncLabel
     ;

aggrFunc: aggrFuncName '(' (var|arrayGen) ')';

aggrFuncName:'sum'|'avg'|'max'|'min'|'count';

var: (idWithArray) ('.' idWithArray)*  ;

idWithArray: identifier arraySymbol*;

arraySymbol: ('[' (INT | star='*' | (INT range=':' INT)) ']') ;

identifier: 'readFromWrapper' | 'readFromWrapperAsMaster' | 'join' | 'where' | 'into' | 'in' 
          | 'filter' | 'transform' | 'group' | 'window' | 'istream' | 'dstream' | 'rstream'
          | 'each' | 'as' | 'by' | 'range' | 'unbounded' | 'rows' | 'now'
          | 'seconds' | 'minutes' | 'hours' | 'days'
          | 'sum'|'avg'|'max'|'min'|'count'
          | ID
          | dollar='$'
          ;

TRUE:   'true';
FALSE:  'false';
NULL: 'null';
ID  :   ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT :   '0'..'9'+ ;
STRING: '"' .*? '"';
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
