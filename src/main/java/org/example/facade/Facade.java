package org.example.facade;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:36 下午
 */
public class Facade {

    ServiceA serviceA;
    ServiceB serviceB;
    ServiceC serviceC;

    public Facade() {
        this.serviceA = new ServiceAImpl();
        this.serviceB = new ServiceBImpl();
        this.serviceC = new ServiceCImpl();
    }

    public void methodA() {
        serviceA.methodA();
        serviceB.methodB();
    }

    public void methodB() {
        serviceB.methodB();
        serviceC.methodC();
    }

    public void methodC() {
        serviceC.methodC();
        serviceA.methodA();
    }
}
