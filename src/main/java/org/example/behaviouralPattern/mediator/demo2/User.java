package org.example.behaviouralPattern.mediator.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:52 下午
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}

