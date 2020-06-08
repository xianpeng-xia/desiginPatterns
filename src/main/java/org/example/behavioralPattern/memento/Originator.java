package org.example.behavioralPattern.memento;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:48 下午
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }

    public void showState() {
        System.out.println(state);
    }
}
