package org.example.behavioralPattern.command.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 10:00 下午
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }

        orders.clear();
    }
}
