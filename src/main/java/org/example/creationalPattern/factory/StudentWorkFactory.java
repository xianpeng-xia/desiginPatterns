package org.example.creationalPattern.factory;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 6:25 下午
 */
public class StudentWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
