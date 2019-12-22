package org.example.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 8:44 下午
 */
public class FlyWeightFactory {

    private static Map<String, FlyWeight> flyWeights = new HashMap<>();

    public FlyWeightFactory(String arg) {
        flyWeights.put(arg, new FlyWeightImpl());
    }

    public static FlyWeight getFlyWeitht(String key) {
        if (flyWeights.get(key) == null) {
            flyWeights.put(key, new FlyWeightImpl());
        }
        return flyWeights.get(key);
    }

    public static int getSize() {
        return flyWeights.size();
    }

}
