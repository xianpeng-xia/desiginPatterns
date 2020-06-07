package org.example.behaviouralPattern.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:26 下午
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
