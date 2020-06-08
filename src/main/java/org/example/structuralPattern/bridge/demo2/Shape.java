package org.example.structuralPattern.bridge.demo2;

/**
 * @date 2020/06/08
 * @time 17:44
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
