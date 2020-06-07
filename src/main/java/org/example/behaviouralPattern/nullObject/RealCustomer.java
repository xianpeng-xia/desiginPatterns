package org.example.behaviouralPattern.nullObject;

/**
 * Created by xianpeng.xia
 * on 2020/6/8 12:44 上午
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
