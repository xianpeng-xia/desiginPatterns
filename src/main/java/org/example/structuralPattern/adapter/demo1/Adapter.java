package org.example.structuralPattern.adapter.demo1;

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
