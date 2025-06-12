grammar language;

// start symbol
expr: 
     // unaryExpr

     // dashExpr

     // mulDivExpr

     // sumExpr
     expr SUMOP expr #exprSumOp |
     NUMBER #exprNumber |

     // shifExpr

     // bitAndOrExpr
     expr BITAND expr #exprBitAnd |
     expr BITOR expr #exprBitOr

     // andOrExpr

     // cmpExpr

     // questionMarkExpr

;

// tokens
NUMBER: [0-9]+;
IDENT: [a-z]+;

// parantheseExpr tokens
LPAREN: '(';
RPAREN: ')';

// unaryExpr tokens

// dashExpr tokens

// mulDivExpr tokens

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens
BITAND: '&';
BITOR: '|';

// andOrExpr tokens

// cmpExpr tokens

// questionMarkExpr tokens


// skip whitespaces
WS: [ \t\r\n]+ -> skip;
