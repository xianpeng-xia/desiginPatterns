package org.example.structuralPattern.bridge.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 12:19 上午
 *桥接模式包含以下要素：
 * 1 Abstraction：抽象类。
 * 2 Implementation：抽象的实现类。
 * 3 Refined：扩充的抽象类。
 * 4 SpecificImplementation：具体实现类。
 *
 * 用于把抽象化与实现化解耦，使得二者可以独立变化
 */
public class Test {

    public static void main(String[] args) {
        Person man = new Man();
        Person lady = new Lady();

        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);
    }
}
