package org.example.behavioralPattern.command.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 9:58 下午
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
