package org.example.behaviouralPattern.chainOfResponsibility;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 17:58
 *
 * 责任链模式可以让处理器按以下方式处理：如果需要则处理请求，否则将请求传递给下一个处理器。
 *
 * 包括以下类：
 * 1 Client（客户端）：客户端是使用责任链模式的应用程序的主要结构。它的职责是实例化一个处理器的链，然后在第一个对象中调用handleRequest方法。
 * 2 Handler（处理器）：这是一个抽象类，提供给所有实际处理器进行继承。它拥有一个handleRequest方法，用来接收需要处理的请求。
 * 3 ConcreteHandler（具体处理器）：这是一个实现了handleRequest方法的具体类。每一个具体处理器都维持一个引用，
 * 指向链中下一个具体处理器，需要检查它自身是否能处理这个请求，不能就将请求传递给链中的下一个具体处理器。
 */
public class Test {

    public static void main(String[] args) {
        //hr
        HRRequestHandle hr = new HRRequestHandle();
        //项目经理
        PMRequestHandle pm = new PMRequestHandle(hr);
        // 项目组长
        TLRequestHandle tl = new TLRequestHandle(pm);

        Request request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("--------------------");
        request = new AddMoneyRequest();
        tl.handleRequest(request);

        System.out.println("--------------------");

        request = new DimissionRequest();
        pm.handleRequest(request);

    }
}
