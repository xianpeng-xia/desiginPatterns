package org.example.bridge;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 12:18 上午
 */
public class Trouser extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + " dress trouser");
    }
}
