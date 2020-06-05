package org.example.creationalPattern.factory;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 6:26 下午
 */
public class TeacherWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
