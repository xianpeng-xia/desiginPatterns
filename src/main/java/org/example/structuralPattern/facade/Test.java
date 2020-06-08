package org.example.structuralPattern.facade;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:39 下午
 *
 * 外观模式包含以下几项要素：
 * 1 Client：子系统客户端代码。
 * 2 Facade：子系统接口。
 * 3 Subsystem：子系统中定义的类。
 * 目的是为复杂的子系统提供单一的统一接口。通过为最重要的用例提供接口，能够简化大型和复杂系统的使用。
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
