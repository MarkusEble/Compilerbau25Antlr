grammar language;

// start symbol
expr: 
     // unaryExpr

     // dashExpr
    expr DASHOP expr #exprDashOp |
    NUMBER #exprNumber |

     // mulDivExpr
     expr MULDIVOP expr #exprMulDivOp |

     // sumExpr
     expr SUMOP expr #exprSumOp |
     NUMBER #exprNumber |

     // shifExpr

     // bitAndOrExpr
     expr BITAND expr #exprBitAnd |
     expr BITOR expr #exprBitOr |

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

// dashExpr tokens
DASHOP: '^';
// mulDivExpr tokens
MULDIVOP: '*' | '/';

// sumExpr tokens
SUMOP: '+' | '-';

// shiftExpr tokens

// bitAndOrExpr tokens
BITAND: '&';
BITOR: '|';

// andOrExpr tokens

// cmpExpr tokens
CMPOP: '==' | '<' | '>';

// skip whitespaces
WS: [ \t\r\n]+ -> skip;
