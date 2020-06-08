package org.example.structuralPattern.flyWeight;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 8:50 下午
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 应用实例：1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 2、数据库的数据池。
 * <p>
 * 享元模式包含以下要素：
 * 1 Client：客户端代码。
 * 2 FlyweightFactory：享元工厂类。如果享元对象不存在则创建它们，如果存在则返回它们。
 * 3 Flyweight：抽象享元类。
 * 4 ConcreateShareableFlyweight：与其同伴共享状态的享元对象。
 * 5 ConcreateUnshareableFlyweight：不共享其状态的享元对象。
 * 它可以由多个具体的享元对象组成——例如一个由3D立方体和球体组成的结构。
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
