package org.example.structuralPattern.proxy.demo2;

/**
 * @date 2020/06/08
 * @time 16:28
 */
public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("-------");
        image.display();
    }
}
