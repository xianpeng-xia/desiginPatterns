package org.example.structuralPattern.proxy.demo1;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 11:42
 * 代理模式
 * 主要解决：在直接访问对象时带来的问题，
 * 比如说：要访问的对象在远程的机器上。
 * 在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * 使用场景：按职责来划分，通常有以下使用场景： 1、远程代理。 2、虚拟代理。 3、Copy-on-Write 代理。 4、保护（Protect or Access）代理。 5、Cache代理。 6、防火墙（Firewall）代理。 7、同步化（Synchronization）代理。 8、智能引用（Smart Reference）代理。
 * <p>
 * 代理模式包含以下几项要素：
 * 1 Subject（共同接口）：客户端使用的现有接口。
 * 2 RealSubject（真实对象）：真实对象的类。
 * 3 ProxySubject（代理对象）：代理类。
 */
public class Test {

    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject();
        proxyObject.action();
    }
}
