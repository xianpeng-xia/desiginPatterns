package org.example.behavioralPattern.strategy;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 14:14
 *
 * 策略模式：
 * 1 Strategy（抽象策略）：特定策略的抽象。
 * 2 ConcreteStrategy（具体策略）：实现抽象策略的类。
 * 3 Context（环境）：运行特定策略的类。
 *
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
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
