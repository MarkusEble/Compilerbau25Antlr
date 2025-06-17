package com.compiler.antlrcompiler;

import com.compiler.antlr.languageParser;
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
    @Override public Integer visitExprDashOp(languageParser.ExprDashOpContext ctx){
        ExprContext operand0 = ctx.expr(0);
        int operand0Value = visit(operand0);
        ExprContext operand1 = ctx.expr(1);
        int operand1Value = visit(operand1);
        return (int) Math.pow(operand0Value, operand1Value);
    }

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

    @Override
    public Integer visitExprShiftLeft(languageParser.ExprShiftLeftContext ctx) {
        ExprContext operand0 = ctx.expr(0);
        int operand0Value = visit(operand0);
        ExprContext operand1 = ctx.expr(1);
        int operand1Value = visit(operand1);
        return operand0Value << operand1Value;
    }

    @Override
    public Integer visitExprShiftRight(languageParser.ExprShiftRightContext ctx) {
        ExprContext operand0 = ctx.expr(0);
        int operand0Value = visit(operand0);
        ExprContext operand1 = ctx.expr(1);
        int operand1Value = visit(operand1);
        return operand0Value >> operand1Value;
    }

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
    @Override
     public Integer visitExprAndOr(com.compiler.antlr.languageParser.ExprAndOrContext ctx) {
         ExprContext operand0 = ctx.expr(0);
         int operand0Value = visit(operand0);
         ExprContext operand1 = ctx.expr(1);
         int operand1Value = visit(operand1);
         if (ctx.ANDOROP().getText().equals("&&")) {
             return operand0Value == 0 || operand1Value == 0 ? 0 : 1;
         } else {
             return operand0Value == 0 && operand1Value == 0 ? 0 : 1;
         }
     }
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

@Override public Integer visitExprNumber(com.compiler.antlr.languageParser.ExprNumberContext ctx) { 
    int number = Integer.valueOf(ctx.NUMBER().getText());
    return number;
}

}
