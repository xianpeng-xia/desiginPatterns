package org.example.behavioralPattern.command.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 9:54 下午
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("bought -> " + "name: " + name + " ,quantity: " + quantity);
    }

    public void sell() {
        System.out.println("sold -> " + "name: " + name + " ,quantity: " + quantity);
    }
}
