package org.example.behaviouralPattern.mediator.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:33 下午
 */
public class ConcreateMediator extends Mediator {

    private ColleagueA ca;
    private ColleagueB cb;

    public ConcreateMediator() {
        this.ca = new ColleagueA();
        this.cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if ("boss".equals(content)) {
            ca.action();
        }
        if ("client".equals(content)) {
            cb.action();
        }
    }
}
