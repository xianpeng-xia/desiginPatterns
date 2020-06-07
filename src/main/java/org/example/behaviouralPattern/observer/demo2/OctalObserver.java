package org.example.behaviouralPattern.observer.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:33 下午
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(this.subject.getState()));
    }
}
