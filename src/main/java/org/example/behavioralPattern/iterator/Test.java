package org.example.behavioralPattern.iterator;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:45 下午
 * 迭代器模式使用了以下类：
 * 1 Aggregate（抽象容器）：应该由所有类实现的抽象类，并且可以由迭代器遍历。这对应于java.util.Collection接口。
 * 2 Iterator（抽象迭代器）：抽象迭代器是迭代器抽象类，它定义遍历容器对象的操作以及返回对象的操作。
 * 3 ConcreteAggregate（具体容器）：具体容器可以实现内部不同的结构，但会暴露处理遍历容器的具体迭代器。
 * 4 ConcreteIterator（具体迭代器）：这是处理特定具体容器类的具体迭代器。实际上，对于每个具体容器，必须实现一个具体迭代器。
 */
public class Test {

    public static void main(String[] args) {
        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator iterator = new IteratorImpl(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==========");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
