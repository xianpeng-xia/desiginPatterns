package org.example.interpreter;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:17 下午
 */
public class SimpleExpression extends Expression {

    @Override
    void interpret(Context ctx) {
        System.out.println("this is simple expression");
    }
}
