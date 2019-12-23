package org.example.strategy;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 14:14
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context(new StrategyA());
        ctx.doMethod();

        ctx = new Context(new StrategyB());
        ctx.doMethod();

        ctx = new Context(new StrategyC());
        ctx.doMethod();
    }
}
