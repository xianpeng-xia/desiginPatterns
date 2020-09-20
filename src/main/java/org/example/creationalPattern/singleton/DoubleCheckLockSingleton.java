package org.example.creationalPattern.singleton;


// 双重锁校验机制
public class DoubleCheckLockSingleton {

    private DoubleCheckLockSingleton() {

    }

    private static volatile DoubleCheckLockSingleton s = null;

    public static DoubleCheckLockSingleton getInstance() {
        if (s == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (s == null) {
                    s = new DoubleCheckLockSingleton();
                }
            }
        }
        return s;
    }
}