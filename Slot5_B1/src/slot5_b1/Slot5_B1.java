/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot5_b1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot5_B1 {

    public static void evaluate(Circle c, Scanner sc) {
        System.out.println("data current: ");
        System.out.println("get radius : " + c.getRadius());
        System.out.println("get color : " + c.getColor());
        System.out.println("set data : ");
        System.out.print("enter radius: ");
        double r = sc.nextDouble();
        c.setRadius(r);
        System.out.print("Enter color:");
        sc.nextLine();
        String color = sc.nextLine();
        c.setColor(color);
        System.out.println("to String : " + c);
        System.out.println("area of circle: " + c.getArea());
        System.out.println("==================================================");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            Circle c1 = new Circle();
            System.out.println("constructor 1: ");
            evaluate(c1, sc);
            Circle c2 = new Circle(2.4);
            System.out.println("Constructor 2: ");
            evaluate(c2, sc);
            Circle c3 = new Circle(3.5, "blue");
            System.out.println("Constructor 3:");
            evaluate(c3, sc);
        } catch (Exception e) {
            System.out.println("error: " + e);
        } finally {
        }

    }

}
