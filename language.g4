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
     expr ANDOROP expr #exprAndOr |
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

// dashExpr tokens

// mulDivExpr tokens

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens
BITAND: '&';
BITOR: '|';

// andOrExpr tokens
ANDOROP: '&&' | '||';
// cmpExpr tokens
CMPOP: '==' | '<' | '>';

// questionMarkExpr tokens
DC: ':';
QM: '?';

// skip whitespaces
WS: [ \t\r\n]+ -> skip;
