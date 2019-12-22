package org.example.flyWeight;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 8:50 下午
 */
public class Test {

    public static void main(String[] args) {
        FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeitht("a");
        flyWeight1.action(1);

        FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeitht("a");
        System.out.println(flyWeight1 == flyWeight2);

        FlyWeight flyWeight3 = FlyWeightFactory.getFlyWeitht("b");
        flyWeight3.action(2);

        FlyWeight flyWeight4 = FlyWeightFactory.getFlyWeitht("c");
        flyWeight4.action(3);

        FlyWeight flyWeight5 = FlyWeightFactory.getFlyWeitht("d");
        flyWeight4.action(4);

        System.out.println(FlyWeightFactory.getSize());


    }
}
