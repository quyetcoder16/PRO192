/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7hwq2;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot7HWQ2 {

    public static void testShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter color for Shape: ");
        String color = scanner.nextLine();
        System.out.println("Is the shape filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Shape shape = new Shape(color, filled);

        System.out.println("Shape: " + shape);
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.isFilled());

    }

    public static void testCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius for Circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

    }

    public static void testRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width for Rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter length for Rectangle: ");
        double length = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

    }

    public static void testSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length for Square: ");
        double side = scanner.nextDouble();

        Square square = new Square(side);

        System.out.println("Square: " + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            testShape();
            System.out.println("============================================");
            testCircle();
            System.out.println("============================================");

            testRectangle();
            System.out.println("============================================");

            testSquare();
        } catch (Exception e) {
            System.out.println("error " + e);
        }

    }

}
