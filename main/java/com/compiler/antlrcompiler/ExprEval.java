package com.compiler.antlrcompiler;

import com.compiler.antlr.languageParser.ExprContext;
import com.compiler.antlr.languageParser.ExprQmContext;

public class ExprEval extends com.compiler.antlr.languageBaseVisitor<Integer> {

     // unaryExpr

     // dashExpr

     // mulDivExpr
@Override public Integer visitExprMulDivOp(com.compiler.antlr.languageParser.ExprMulDivOpContext ctx) {
    ExprContext operand0 = ctx.expr(0);
    int operand0Value = visit(operand0);
    ExprContext operand1 = ctx.expr(1);
    int operand1Value = visit(operand1);
    if (ctx.MULDIVOP().getText().equals("*")) {
        return operand0Value * operand1Value;
    } else {
        return operand0Value / operand1Value;
    }
}

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
     @Override
     public Integer visitExprBitAnd(com.compiler.antlr.languageParser.ExprBitAndContext ctx) {
         ExprContext operand0 = ctx.expr(0);
         int operand0Value = visit(operand0);
         ExprContext operand1 = ctx.expr(1);
         int operand1Value = visit(operand1);
         return operand0Value & operand1Value;
     }

    @Override
    public Integer visitExprBitOr(com.compiler.antlr.languageParser.ExprBitOrContext ctx) {
        ExprContext operand0 = ctx.expr(0);
        int operand0Value = visit(operand0);
        ExprContext operand1 = ctx.expr(1);
        int operand1Value = visit(operand1);
        return operand0Value | operand1Value;
    }

     // andOrExpr

     // cmpExpr
     @Override
     public Integer visitExprCmpOp(com.compiler.antlr.languageParser.ExprCmpOpContext ctx) {
         ExprContext operand0 = ctx.expr(0);
         int operand0Value = visit(operand0);
         ExprContext operand1 = ctx.expr(1);
         int operand1Value = visit(operand1);
         if(ctx.CMPOP().getText().equals("==")){
             return operand0Value == operand1Value ? 1 : 0;
         }else if(ctx.CMPOP().getText().equals(">")){
             return operand0Value > operand1Value ? 1 : 0;
         }else{
             return operand0Value < operand1Value ? 1 : 0;
         }
     }

     // questionMarkExpr
    @Override
    public Integer visitExprQm(ExprQmContext ctx) {
        ExprContext predicate = ctx.expr(0);
        int predicateValue = visit(predicate);

        if(predicateValue != 0){ // True
            ExprContext operand = ctx.expr(1);
            return visit(operand);
        } else{ // False
            ExprContext operand = ctx.expr(2);
            return visit(operand);
        }
    }

@Override public Integer visitExprNumber(com.compiler.antlr.languageParser.ExprNumberContext ctx) { 
    int number = Integer.valueOf(ctx.NUMBER().getText());
    return number;
}

}
