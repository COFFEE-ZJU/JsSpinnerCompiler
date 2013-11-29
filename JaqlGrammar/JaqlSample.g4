grammar JaqlSample;

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
      'where' varID '==' varID
      'into' joinOut
    ;

joinVar: (identifier 'in')? identifier;

joinOut:'{' joinOutVar (',' joinOutVar)* '}' ;

joinOutVar: (identifier ':')? varID ;

pipe: identifier ( '->' pipeExpr )+ ;

pipeExpr: 'filter' ('each' identifier)? conditions                                      #filterLabel
	| 'transform' ('each' identifier)? transExpr                                    #transformLabel
        | 'group' (geach='each' identifier)? (gby='by' identifier '=' var (gas='as' identifier)? ) 'into' aggrExprs   #groupSingleLabel
        | 'window' '[' windowRange ']'                                          #windowLabel
        | stream                                                                #streamLabel
	;

stream: 'istream' | 'dstream' | 'rstream';

windowRange: 'range' ( (INT ) timeUnit | timeRange)                           #windowTimeLabel
           | 'rows' (INT | 'unbounded')                                         #windowRowLabel
           | 'partitioned by' identifier (',' identifier)* 'rows' INT                           #windowPartitionLabel
           ;
timeRange: 'unbounded' | 'now' ;

timeUnit: ('seconds' | 'minutes' | 'hours' | 'days');

aggrExprs: '{' aggrExpr (',' aggrExpr )* '}'
        ;

aggrExpr: (identifier ':')? identifier
        | (identifier ':' aggrFunc)
        ;

aggrFunc: aggrFuncName '(' (identifier|'$') '[*].' identifier ')'
        ;
aggrFuncName:'sum'|'avg'|'max'|'min'|'count';

transExpr: '{' transExprVar (',' transExprVar)* '}';

transExprVar: identifier ':' exprs
            | var
            ;

conditions: conditions 'and' conditions                                         #condAndLabel
          | conditions 'or' conditions                                          #condOrLabel
          | exprs comprator exprs                                               #condCompLabel
          | var                                                                 #condVarLabel
          | '(' conditions ')'                                                  #condSubLabel
          ;

comprator: ('<' | '<=' | '==' | '>=' | '>' | '!=') ;

exprs: exprs op=('*'|'/') exprs                                                 #exprMulDivLabel
     |  exprs op=('+'|'-') exprs                                                #exprAddSubLabel
     |  var                                                                     #exprVarLabel
     |  INT                                                                     #exprIntLabel
     |  (TRUE | FALSE)                                                          #exprBoolLabel
     |  NULL                                                                    #exprNullLabel
     |  STRING                                                                  #exprStringLabel
     |  '(' exprs ')'                                                           #exprSubExprLabel
     ;


var: (identifier | '$') ('.' identifier)?  ;
varID: (identifier) ('.' identifier)?  ;

identifier: 'readFromWrapper' | 'readFromWrapperAsMaster' | 'join' | 'where' | 'into' | 'in' 
          | 'filter' | 'transform' | 'group' | 'window' | 'istream' | 'dstream' | 'rstream'
          | 'each' | 'as' | 'by' | 'range' | 'unbounded' | 'rows' | 'now'
          | 'seconds' | 'minutes' | 'hours' | 'days'
          | 'sum'|'avg'|'max'|'min'|'count'
          | ID
          ;

TRUE:   'true';
FALSE:  'false';
NULL: 'null';
ID  :   ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT :   '0'..'9'+ ;
STRING: '"' .*? '"';
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
