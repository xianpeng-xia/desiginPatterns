package org.example.behavioralPattern.observer.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:31 下午
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
