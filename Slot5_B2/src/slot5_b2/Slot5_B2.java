/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot5_b2;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot5_B2 {

    public static void evaluate(Rectangle rectangle, Scanner scanner) {
        System.out.println("Data current:");
        System.out.println("get length : " + rectangle.getLength());
        System.out.println("get width : " + rectangle.getWidth());
        System.out.println("set data: ");
        System.out.print("Enter length: ");
        float length = scanner.nextFloat();
        rectangle.setLength(length);
        System.out.print("Enter width: ");
        float width = scanner.nextFloat();
        rectangle.setWidth(width);
        System.out.println("toString : " + rectangle);
        System.out.println("area of rectangle : " + rectangle.getArea());
        System.out.println("perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("=============================================================");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner scanner = new Scanner(System.in);
            Rectangle rectangle1 = new Rectangle();
            System.out.println("Constructor 1  :");
            evaluate(rectangle1, scanner);
            Rectangle rectangle2 = new Rectangle(10, 2);
            System.out.println("Constructor 2  :");
            evaluate(rectangle2, scanner);
        } catch (Exception e) {
        }
    }

}
