package org.example.proxy;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 11:36
 */
public class ProxyObject implements Object {

    Object obj;

    public ProxyObject() {
        System.out.println("这是代理的类");
        this.obj = new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
}
