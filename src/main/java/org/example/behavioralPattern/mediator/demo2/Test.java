package org.example.behavioralPattern.mediator.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:56 下午
 */
public class Test {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("hi john");
        john.sendMessage("hello robert");
    }
}
