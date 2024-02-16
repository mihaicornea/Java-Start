package com.shapes;

public class Polygon extends Shape {
    protected int numberSides;
    protected int angle;

    public Polygon(int numberSides, int angle) {
        this.numberSides = numberSides;
        this.angle = angle;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a polygon with " + numberSides + "sides.");
    }
}
