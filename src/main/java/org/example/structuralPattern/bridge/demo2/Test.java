package org.example.structuralPattern.bridge.demo2;

/**
 * @date 2020/06/08
 * @time 17:47
 */
public class Test {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 0);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 0);

        redCircle.draw();
        greenCircle.draw();
    }
}
