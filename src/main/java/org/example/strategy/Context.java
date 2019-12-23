package org.example.strategy;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 14:13
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doMethod() {
        strategy.method();
    }
}

