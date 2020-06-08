package org.example.behavioralPattern.iterator;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:45 下午
 */
public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object object);
}
