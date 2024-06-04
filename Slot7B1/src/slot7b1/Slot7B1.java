/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7b1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot7B1 {

    public static void evaluate(Cylinder c, Scanner sc) {
        System.out.println("data current: ");
        System.out.println("get radius : " + c.getRadius());
        System.out.println("get color : " + c.getColor());
        System.out.println("set data : ");
        System.out.print("enter radius: ");
        double r = sc.nextDouble();
        c.setRadius(r);
        System.out.print("enter height: ");
        double h = sc.nextDouble();
        c.setHeight(h);
        System.out.print("Enter color:");
        sc.nextLine();
        String color = sc.nextLine();
        c.setColor(color);
        System.out.println("to String : " + c);
        System.out.println("area of circle: " + c.getArea());
        System.out.println("volume:" + c.getVolume());
        System.out.println("==================================================");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Cylinder cylinder = new Cylinder(5, 4, "blue");
//        Scanner sc = new Scanner(System.in);
//        evaluate(cylinder, sc);
// Test Circle
        System.out.println("Testing Circle:");

        Circle circle1 = new Circle();
        System.out.println("Default Circle: " + circle1.toString());
        System.out.println("getRadius(): " + circle1.getRadius());
        System.out.println("getColor(): " + circle1.getColor());
        System.out.println("getArea(): " + circle1.getArea());

        Circle circle2 = new Circle(2.5);
        System.out.println("\nCircle with radius 2.5: " + circle2.toString());
        System.out.println("getRadius(): " + circle2.getRadius());
        System.out.println("getColor(): " + circle2.getColor());
        System.out.println("getArea(): " + circle2.getArea());

        Circle circle3 = new Circle(3.5, "blue");
        System.out.println("\nCircle with radius 3.5 and color blue: " + circle3.toString());
        System.out.println("getRadius(): " + circle3.getRadius());
        System.out.println("getColor(): " + circle3.getColor());
        System.out.println("getArea(): " + circle3.getArea());

        circle3.setRadius(4.5);
        circle3.setColor("green");
        System.out.println("\nAfter setRadius(4.5) and setColor(\"green\"): " + circle3.toString());
        System.out.println("getRadius(): " + circle3.getRadius());
        System.out.println("getColor(): " + circle3.getColor());
        System.out.println("getArea(): " + circle3.getArea());

        // Test Cylinder
        System.out.println("\nTesting Cylinder:");

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Default Cylinder: " + cylinder1.toString());
        System.out.println("getRadius(): " + cylinder1.getRadius());
        System.out.println("getColor(): " + cylinder1.getColor());
        System.out.println("getHeight(): " + cylinder1.getHeight());
        System.out.println("getVolume(): " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2.5);
        System.out.println("\nCylinder with radius 2.5: " + cylinder2.toString());
        System.out.println("getRadius(): " + cylinder2.getRadius());
        System.out.println("getColor(): " + cylinder2.getColor());
        System.out.println("getHeight(): " + cylinder2.getHeight());
        System.out.println("getVolume(): " + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(3.5, 5.0);
        System.out.println("\nCylinder with radius 3.5 and height 5.0: " + cylinder3.toString());
        System.out.println("getRadius(): " + cylinder3.getRadius());
        System.out.println("getColor(): " + cylinder3.getColor());
        System.out.println("getHeight(): " + cylinder3.getHeight());
        System.out.println("getVolume(): " + cylinder3.getVolume());

        Cylinder cylinder4 = new Cylinder(4.5, 6.0, "yellow");
        System.out.println("\nCylinder with radius 4.5, height 6.0 and color yellow: " + cylinder4.toString());
        System.out.println("getRadius(): " + cylinder4.getRadius());
        System.out.println("getColor(): " + cylinder4.getColor());
        System.out.println("getHeight(): " + cylinder4.getHeight());
        System.out.println("getVolume(): " + cylinder4.getVolume());

        cylinder4.setRadius(5.5);
        cylinder4.setHeight(7.0);
        cylinder4.setColor("purple");
        System.out.println("\nAfter setRadius(5.5), setHeight(7.0), and setColor(\"purple\"): " + cylinder4.toString());
        System.out.println("getRadius(): " + cylinder4.getRadius());
        System.out.println("getColor(): " + cylinder4.getColor());
        System.out.println("getHeight(): " + cylinder4.getHeight());
        System.out.println("getVolume(): " + cylinder4.getVolume());

    }

}
