package org.example.bridge;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 12:13 上午
 */
public class Lady extends Person {

    public Lady() {
        setType("lady");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
