package org.example.behavioralPattern.memento;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:51 下午
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
