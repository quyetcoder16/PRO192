/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7hwq1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot7HWQ1 {

    public static void testPoint() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x coordinate for Point: ");
        float x = scanner.nextFloat();
        System.out.println("Enter y coordinate for Point: ");
        float y = scanner.nextFloat();

        Point point = new Point(x, y);

        System.out.println("Initial Point: " + point);
        System.out.println("getX(): " + point.getX());
        System.out.println("getY(): " + point.getY());

        System.out.println("Enter new X coordinate for Point: ");
        float newX = scanner.nextFloat();
        System.out.println("Enter new Y coordinate for Point: ");
        float newY = scanner.nextFloat();
        point.setX(newX);
        point.setY(newY);
        System.out.println("After setting X and Y: " + point);

        System.out.println("Enter new XY coordinates for Point: ");
        newX = scanner.nextFloat();
        newY = scanner.nextFloat();
        point.setXY(newX, newY);
        System.out.println("After setting XY: " + point);

    }

    public static void testMovablePoint() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x coordinate for MovablePoint: ");
        float x = scanner.nextFloat();
        System.out.println("Enter y coordinate for MovablePoint: ");
        float y = scanner.nextFloat();
        System.out.println("Enter xSpeed for MovablePoint: ");
        float xSpeed = scanner.nextFloat();
        System.out.println("Enter ySpeed for MovablePoint: ");
        float ySpeed = scanner.nextFloat();

        MovablePoint movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);

        System.out.println("Initial Movable Point: " + movablePoint);
        System.out.println("getXSpeed(): " + movablePoint.getXSpeed());
        System.out.println("getYSpeed(): " + movablePoint.getYSpeed());

        movablePoint.move();
        System.out.println("After moving: " + movablePoint);

        System.out.println("Enter new xSpeed for MovablePoint: ");
        float newSpeedX = scanner.nextFloat();
        System.out.println("Enter new ySpeed for MovablePoint: ");
        float newSpeedY = scanner.nextFloat();
        movablePoint.setSpeed(newSpeedX, newSpeedY);
        System.out.println("After setting speed: " + movablePoint);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            testPoint();
            testMovablePoint();
        } catch (Exception e) {
            System.out.println("errror" + e);
        } finally {
        }
    }

}
