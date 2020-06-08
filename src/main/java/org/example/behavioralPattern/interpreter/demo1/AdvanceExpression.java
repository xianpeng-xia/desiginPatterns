package org.example.behavioralPattern.interpreter.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:10 下午
 */
public class AdvanceExpression extends Expression {


    @Override
    void interpret(Context ctx) {
        System.out.println("this is advance expression");
    }
}
