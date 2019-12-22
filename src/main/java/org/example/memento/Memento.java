package org.example.memento;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 10:46 下午
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
