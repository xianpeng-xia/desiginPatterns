package org.example.behaviouralPattern.state;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 13:07
 * 状态模式只是面向对象设计中的有限状态机的实现
 * 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setWeather(new Rain());
        System.out.println(ctx.weatherMessage());

        System.out.println("==========");

        Context ctx2 = new Context();
        ctx2.setWeather(new Sunshine());
        System.out.println(ctx2.weatherMessage());
    }
}
