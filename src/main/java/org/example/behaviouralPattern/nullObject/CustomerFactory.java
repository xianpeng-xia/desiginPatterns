package org.example.behaviouralPattern.nullObject;

/**
 * Created by xianpeng.xia
 * on 2020/6/8 12:46 上午
 */
public class CustomerFactory {

    public static final String[] names = {"A", "B", "C"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
