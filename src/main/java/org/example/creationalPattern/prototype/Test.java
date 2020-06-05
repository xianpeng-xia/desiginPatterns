package org.example.creationalPattern.prototype;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 11:20
 */
public class Test {

    public static void main(String[] args) {
        Prototype prototype = new ConcreatePrototype("prototype");
        Prototype clonePrototype = (Prototype) prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(clonePrototype.getName());

    }
}
