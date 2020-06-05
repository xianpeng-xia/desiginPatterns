package org.example.creationalPattern.abstractProduct;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 10:49 下午
 */
public class WhiteCat implements ICat {

    @Override
    public void eat() {
        System.out.println("the white cat is eating ");
    }
}
