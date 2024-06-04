/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot7b1;

/**
 *
 * @author quyet
 */
public class Circle {

    //    attribute
    private double radius = 1.0f;
    private String color = "red";

//    constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
//getter

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

//    setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    toString

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

//    method 
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

}
