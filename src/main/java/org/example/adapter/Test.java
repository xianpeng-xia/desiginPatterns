package org.example.adapter;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 11:28 下午
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();

        target.adapterMethod();
    }
}
