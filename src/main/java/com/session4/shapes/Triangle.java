package com.shapes;

public class Triangle extends Polygon {
    public Triangle(int numberSides, int angle) {
        super(numberSides, angle);
    }
    public void draw (){
        System.out.println("The drawing a triangle which has " + this.numberSides + "sides and angle of " + this.angle);
    }
    public void draw (boolean sparkling){
        if (sparkling) {
            System.out.println("The drawing a sparkling triangle");
        } else {
            System.out.println("The drawing a triangle which has " + this.numberSides + " sides and angle of " + this.angle);
        }
    }
}
