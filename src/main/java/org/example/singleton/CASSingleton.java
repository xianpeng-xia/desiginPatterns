package org.example.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @date 2020/05/21
 * @time 09:20
 */
public class CASSingleton {

    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    private CASSingleton() {
    }

    public static CASSingleton getInstance() {
        for (; ; ) {
            CASSingleton singleton = INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }

            singleton = new CASSingleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }
}
