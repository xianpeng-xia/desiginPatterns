package org.example.singleton;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 11:24 下午
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {

        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
