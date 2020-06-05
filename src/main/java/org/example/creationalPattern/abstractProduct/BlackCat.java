package org.example.creationalPattern.abstractProduct;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 10:43 下午
 */
public class BlackCat implements ICat {

    @Override
    public void eat() {
        System.out.println("the black cat is eating");
    }
}
