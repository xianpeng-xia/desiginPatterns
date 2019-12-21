package org.example.builder;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:17 下午
 */
public class ManBuilder implements PersionBuilder {

    Person person;

    public ManBuilder() {
        person = new Man();
    }

    public void buildHead() {
        person.setHead("build man's head");
    }

    public void buildBody() {
        person.setBody("build man's body");
    }

    public void buildFoot() {
        person.setFoot("build man's foot");
    }

    public Person buildPerson() {
        return person;
    }
}
