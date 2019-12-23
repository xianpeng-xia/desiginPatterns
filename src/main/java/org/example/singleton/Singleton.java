package org.example.singleton;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 12:55
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
