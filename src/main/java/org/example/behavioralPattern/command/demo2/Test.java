package org.example.behavioralPattern.command.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 10:01 下午
 *
 * 包括以下元素：
 * 1 Command（命令类）：这是表示命令封装的抽象类。它声明了执行的抽象方法，该方法应该由所有具体命令实现。
 * 2 ConcreteCommand（具体命令类）：这是命令类的实际实现。它必须执行命令并处理与每个具体命令相关的参数。它将命令委托给接收者。
 * 3 Receiver（接收者）：这是负责执行与命令关联的操作的类。
 * 4 Invoker（调用者）：这是触发命令的类。通常是外部事件，例如用户操作。
 * 5 Client（客户端）：这是实例化具体命令对象及其接收者的实际类。
 *
 *
 * 命令模式的适用性和示例如下：
 * 1 Undo/Redo operation（撤销/重做操作）：命令模式允许我们将命令对象存储在队列中。这样就可以实现撤销和重做操作。
 * 2 Composite command（组合命令）：复杂命令可以使用组合模式由简单命令组成，并按顺序运行。通过这种方式，我们可以以面向对象的方式构建宏。
 * 3 The asynchronous method invocation（异步方法调用）：命令模式用于多线程应用程序。命令对象可以在后台以单独的线程执行。java.lang.Runnable是一个命令接口。
 */
public class Test {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
