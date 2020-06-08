package org.example.behavioralPattern.observer.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:27 下午
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
