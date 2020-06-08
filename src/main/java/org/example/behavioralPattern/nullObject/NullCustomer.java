package org.example.behavioralPattern.nullObject;

/**
 * Created by xianpeng.xia
 * on 2020/6/8 12:45 上午
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
