package org.example.facade;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:39 下午
 */
public class Test {

    public static void main(String[] args) {

        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();

        serviceA.methodA();
        serviceB.methodB();

        System.out.println("========");

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();

    }
}
