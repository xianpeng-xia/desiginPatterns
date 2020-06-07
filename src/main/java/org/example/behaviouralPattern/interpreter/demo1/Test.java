package org.example.behaviouralPattern.interpreter.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:20 下午
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.add(new SimpleExpression());
        context.add(new AdvanceExpression());
        context.add(new SimpleExpression());

        for (Expression expression : context.getList()) {
            expression.interpret(context);
        }
    }
}
