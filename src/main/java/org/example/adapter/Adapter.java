package org.example.adapter;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 11:27 下午
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("adapter method");
    }
}
