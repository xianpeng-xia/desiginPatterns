package org.example.behaviouralPattern.interpreter.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 10:37 下午
 */
public class AndExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
