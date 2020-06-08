package org.example.structuralPattern.decorator;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:16 下午
 */
public class ManDecoratorA extends Decorateor {

    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA...");
    }

    public void reEat() {
        System.out.println("eat again");
    }
}
