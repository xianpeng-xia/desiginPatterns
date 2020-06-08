package org.example.structuralPattern.decorator;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:19 下午
 * 装饰器模式使用场景：
 * 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 *
 * 装饰器模式包含以下要素：
 * 1 Component：这是抽象组件（它可以是一个接口）。
 * 2 ComponentImplementation：这是我们想装饰的组件之一。
 * 3 Decorator：这是一个抽象的组件装饰器。
 * 4 ExtendedComponent：这是添加额外功能的组件装饰器。
 */
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA mda = new ManDecoratorA();
        ManDecoratorB mdb = new ManDecoratorB();

        mda.setPerson(man);
        mdb.setPerson(mda);

        mdb.eat();
    }
}
