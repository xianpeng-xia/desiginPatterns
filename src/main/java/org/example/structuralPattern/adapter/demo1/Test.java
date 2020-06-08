package org.example.structuralPattern.adapter.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 11:28 下午
 *
 * 适配器模式包含以下要素：
 * 1 Client：代码客户端。
 * 2 Adapter：将调用转发给Adaptee的适配器类。
 * 3 Adaptee：需要适配的旧代码。
 * 4 Target：支持的新接口。
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();

        target.adapterMethod();
    }
}
