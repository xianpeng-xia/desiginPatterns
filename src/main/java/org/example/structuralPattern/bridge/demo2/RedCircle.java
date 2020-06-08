package org.example.structuralPattern.bridge.demo2;

/**
 * @date 2020/06/08
 * @time 17:40
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle -> color: red " + ",radius: " + radius + ",x: " + x + ",y: " + y);
    }
}
