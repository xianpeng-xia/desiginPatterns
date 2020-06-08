package org.example.structuralPattern.decorator;

/**
 * Created by xianpeng.xia
 * on 2019/12/21 11:12 下午
 */
public abstract class Decorateor implements Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
