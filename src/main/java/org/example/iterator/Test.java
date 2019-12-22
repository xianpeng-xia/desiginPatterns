package org.example.iterator;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:45 下午
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
