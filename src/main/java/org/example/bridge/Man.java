package org.example.bridge;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 12:12 上午
 */
public class Man extends Person {

    public Man() {
        setType("man");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
