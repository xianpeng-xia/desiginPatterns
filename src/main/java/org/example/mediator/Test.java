package org.example.mediator;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:35 下午
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreateMediator();

        mediator.notice("boss");
        mediator.notice("client");
    }
}
