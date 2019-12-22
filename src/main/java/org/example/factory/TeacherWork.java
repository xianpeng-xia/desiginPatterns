package org.example.factory;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 6:24 下午
 */
public class TeacherWork implements Work {

    @Override
    public void doWork() {
        System.out.println("teacher do work");
    }
}
