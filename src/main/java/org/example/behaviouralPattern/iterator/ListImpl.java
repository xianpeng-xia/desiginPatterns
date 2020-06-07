package org.example.behaviouralPattern.iterator;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:47 下午
 */
public class ListImpl implements List {

    private Object[] list;
    private int index;
    private int size;

    public ListImpl() {
        this.list = new Object[100];
        this.index = 0;
        this.size = 0;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(Object object) {
        list[index++] = object;
        size++;
    }
}
