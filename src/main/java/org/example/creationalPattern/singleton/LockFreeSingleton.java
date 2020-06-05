package org.example.creationalPattern.singleton;

/**
 * @date 2020/06/05
 * @time 11:29
 */
//  无锁的线程安全单例
public class LockFreeSingleton {

    private final static LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("singleton is instantiated");
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is done.");
    }
}
