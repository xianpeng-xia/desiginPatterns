package org.example.behavioralPattern.nullObject;

/**
 * Created by xianpeng.xia
 * on 2020/6/8 12:48 上午
 */
public class Test {

    public static void main(String[] args) {
        AbstractCustomer abstractCustomer1 = CustomerFactory.getCustomer("A");
        AbstractCustomer abstractCustomer2 = CustomerFactory.getCustomer("D");
        AbstractCustomer abstractCustomer3 = CustomerFactory.getCustomer("C");
        AbstractCustomer abstractCustomer4 = CustomerFactory.getCustomer("S");

        System.out.println("Customers:");
        System.out.println(abstractCustomer1.getName());
        System.out.println(abstractCustomer2.getName());
        System.out.println(abstractCustomer3.getName());
        System.out.println(abstractCustomer4.getName());

    }
}
