package org.example.creationalPattern.builder;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:24 下午
 */
public class Test {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
