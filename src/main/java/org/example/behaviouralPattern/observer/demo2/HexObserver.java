package org.example.behaviouralPattern.observer.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:34 下午
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(this.subject.getState()));
    }
}
