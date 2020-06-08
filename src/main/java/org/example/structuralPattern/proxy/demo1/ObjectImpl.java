package org.example.structuralPattern.proxy.demo1;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 11:40
 */
public class ObjectImpl implements Object {

    @Override
    public void action() {
        System.out.println("==========");
        System.out.println("==========");
        System.out.println("这是被代理的类");
        System.out.println("==========");
        System.out.println("==========");
    }
}
