package org.example.state;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 13:07
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
