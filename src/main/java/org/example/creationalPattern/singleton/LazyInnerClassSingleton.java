package org.example.creationalPattern.singleton;

import java.io.Serializable;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 11:24 下午
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("反射生成单例失败");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder implements Serializable {

        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();

        private Object readResolve() {
            return LazyHolder.INSTANCE;
        }
    }
}
