package org.example.behaviouralPattern.mediator.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:35 下午
 *
 * 中介者模式依赖于以下类：
 * 1 Mediator（抽象中介者）：抽象中介者定义了参与者的交互方式。在此接口或抽象类中声明的操作与场景相关。
 * 2 ConcreteMediator（具体中介者）：它实现了中介者声明的操作。
 * 3 Colleague（抽象同事角色）：这是一个抽象类或接口，用于定义需要调解的参与者如何进行交互。
 * 4 ConcreteColleague（具体同事角色）：这是实现Colleague接口的具体类。
 *
 *
 * 当有许多实体以类似的方式进行交互并且这些实体应该解耦时，就应该使用中介者模式。
 *
 * 1 在Java库中，中介者模式用于实现java.util.Timer。
 * timer（计时器）类可用于调度线程以固定间隔运行一次或重复多次运行。
 * 线程对象对应于ConcreteColleague类。
 * timer类实现了管理后台任务执行的方法。
 *
 * 2 MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreateMediator();

        mediator.notice("boss");
        mediator.notice("client");
    }
}
