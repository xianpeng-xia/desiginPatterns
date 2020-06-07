package org.example.behaviouralPattern.mediator.demo2;

import java.util.Date;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:53 下午
 */
public class ChatRoom {

    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString() + " -> " + user.getName() + " : " + message);
    }
}
