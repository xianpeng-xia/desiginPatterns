package org.example.structuralPattern.bridge.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 12:16 上午
 */
public class Jacket extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + " dress jacket");
    }
}
