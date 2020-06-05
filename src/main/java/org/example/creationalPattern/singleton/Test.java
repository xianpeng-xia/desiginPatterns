package org.example.creationalPattern.singleton;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 12:57
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);

    }
}
