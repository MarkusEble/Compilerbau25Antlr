grammar language;

// start symbol
expr: 
     // unaryExpr
    UNARYOP expr #exprUnaryOp|
     // dashExpr

     // mulDivExpr

     // sumExpr
     expr SUMOP expr #exprSumOp |
     NUMBER #exprNumber |

     // shifExpr

     // bitAndOrExpr

     // andOrExpr

     // cmpExpr
     expr CMPOP expr #exprCmpOp |
     NUMBER #exprCmpOp |

     // questionMarkExpr
     expr QM expr DC expr #exprQm
;

// tokens
NUMBER: [0-9]+;
IDENT: [a-z]+;

// parantheseExpr tokens
LPAREN: '(';
RPAREN: ')';

// unaryExpr tokens
UNARYOP: '-' | '!';

// dashExpr tokens

// mulDivExpr tokens

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens

// andOrExpr tokens

// cmpExpr tokens
CMPOP: '==' | '<' | '>';

// questionMarkExpr tokens
DC: ':';
QM: '?';

// skip whitespaces
WS: [ \t\r\n]+ -> skip;
