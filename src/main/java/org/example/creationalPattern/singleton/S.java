package org.example.creationalPattern.singleton;


// 双重锁校验机制
public class S {

    private S() {

    }

    private static volatile S s = null;

    public static S getInstance() {
        if (s == null) {
            synchronized (S.class) {
                if (s == null) {
                    s = new S();
                }
            }
        }
        return s;
    }
}