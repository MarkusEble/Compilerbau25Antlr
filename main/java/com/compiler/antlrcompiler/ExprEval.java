package com.compiler.antlrcompiler;

import com.compiler.antlr.languageParser.ExprContext;

public class ExprEval extends com.compiler.antlr.languageBaseVisitor<Integer> {

     // unaryExpr
    @Override
    public Integer visitExprUnaryOp(com.compiler.antlr.languageParser.ExprUnaryOpContext ctx) {
         ExprContext operand0 = ctx.expr();
         int operand0Value = visit(operand0);
         if (ctx.UNARYOP().getText().equals("-")) {
             return  - operand0Value;
         } else {
             if(operand0Value == 0){
                 return  1;
             } else
                 return  0;
         }
     }

     // dashExpr

     // mulDivExpr

     // sumExpr
@Override public Integer visitExprSumOp(com.compiler.antlr.languageParser.ExprSumOpContext ctx) {
    ExprContext operand0 = ctx.expr(0);
    int operand0Value = visit(operand0);
    ExprContext operand1 = ctx.expr(1);
    int operand1Value = visit(operand1);
    if (ctx.SUMOP().getText().equals("+")) {
        return operand0Value + operand1Value;
    } else {
        return operand0Value - operand1Value;
    }
}

     // shifExpr

     // bitAndOrExpr

     // andOrExpr

     // cmpExpr

     // questionMarkExpr


@Override public Integer visitExprNumber(com.compiler.antlr.languageParser.ExprNumberContext ctx) { 
    int number = Integer.valueOf(ctx.NUMBER().getText());
    return number;
}

}
