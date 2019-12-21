package org.example.decorator;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:19 下午
 */
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA mda = new ManDecoratorA();
        ManDecoratorB mdb = new ManDecoratorB();

        mda.setPerson(man);
        mdb.setPerson(mda);

        mdb.eat();
    }
}
