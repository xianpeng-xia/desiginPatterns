package org.example.structuralPattern.decorator;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:18 下午
 */
public class ManDecoratorB extends Decorateor {

    @Override
    public void eat() {
        super.eat();
        System.out.println("============");
        System.out.println("ManDecoratorB");
    }
}
