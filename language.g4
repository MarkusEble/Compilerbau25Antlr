grammar language;

// start symbol
expr: 
     // unaryExpr

     // dashExpr
    expr DASHOP expr #exprDashOp |
    NUMBER #exprNumber |

     // mulDivExpr

     // sumExpr
     expr SUMOP expr #exprSumOp |
     NUMBER #exprNumber |

     // shifExpr

     // bitAndOrExpr

     // andOrExpr

     // cmpExpr
     expr CMPOP expr #exprCmpOp |
     NUMBER #exprCmpOp
;

// tokens
NUMBER: [0-9]+;
IDENT: [a-z]+;

// parantheseExpr tokens
LPAREN: '(';
RPAREN: ')';

// unaryExpr tokens

// dashExpr tokens
DASHOP: '^';
// mulDivExpr tokens

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens

// andOrExpr tokens

// cmpExpr tokens
CMPOP: '==' | '<' | '>';

// skip whitespaces
WS: [ \t\r\n]+ -> skip;
