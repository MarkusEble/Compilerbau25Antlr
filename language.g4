grammar language;

// start symbol
expr: 
     // unaryExpr

     // dashExpr

     // mulDivExpr
     expr MULDIVOP expr #exprMulDivOp |

     // sumExpr
     expr SUMOP expr #exprSumOp |
     NUMBER #exprNumber

     // shifExpr

     // bitAndOrExpr

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
MULDIVOP: '*' | '/';

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens

// andOrExpr tokens

// cmpExpr tokens

// questionMarkExpr tokens


// skip whitespaces
WS: [ \t\r\n]+ -> skip;
