package com.company;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public  Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(double v) {
        return radius;
    }

    public double getArea() {
        return radius*2*Math.PI;
    }
}
