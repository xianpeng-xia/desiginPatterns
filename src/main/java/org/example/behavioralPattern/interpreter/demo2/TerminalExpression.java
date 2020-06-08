package org.example.behavioralPattern.interpreter.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 10:35 下午
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
