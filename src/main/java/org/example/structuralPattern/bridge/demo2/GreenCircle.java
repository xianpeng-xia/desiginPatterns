package org.example.structuralPattern.bridge.demo2;

/**
 * @date 2020/06/08
 * @time 17:43
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle -> color: green " + ",radius: " + radius + ",x: " + x + ",y: " + y);
    }
}
