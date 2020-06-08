package org.example.structuralPattern.flyWeight;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 8:40 下午
 */
public class FlyWeightImpl implements FlyWeight {


    @Override
    public void action(int arg) {
        System.out.println("参数值：" + arg);
    }
}
