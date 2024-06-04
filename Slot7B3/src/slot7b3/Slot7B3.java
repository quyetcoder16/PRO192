/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7b3;

import java.util.Arrays;

/**
 *
 * @author quyet
 */
public class Slot7B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        // Test Point2D
        System.out.println("Testing Point2D:");

        Point2D point2D1 = new Point2D(1.0f, 2.0f);
        System.out.println("Point2D(1.0, 2.0): " + point2D1.toString());

        Point2D point2D2 = new Point2D();
        System.out.println("Default Point2D: " + point2D2.toString());

        point2D2.setX(3.5f);
        point2D2.setY(4.5f);
        System.out.println("After setX and setY (3.5, 4.5): " + point2D2.toString());

        point2D2.setXY(5.0f, 6.0f);
        System.out.println("After setXY (5.0, 6.0): " + point2D2.toString());

        float[] coordinates2D = point2D2.getXY();
        System.out.println("getXY(): (" + coordinates2D[0] + ", " + coordinates2D[1] + ")");

        // Test Point3D
        System.out.println("\nTesting Point3D:");

        Point3D point3D1 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D(1.0, 2.0, 3.0): " + point3D1.toString());

        Point3D point3D2 = new Point3D();
        System.out.println("Default Point3D: " + point3D2.toString());

        point3D2.setX(3.5f);
        point3D2.setY(4.5f);
        point3D2.setZ(5.5f);
        System.out.println("After setX, setY, and setZ (3.5, 4.5, 5.5): " + point3D2.toString());

        point3D2.setXYZ(6.0f, 7.0f, 8.0f);
        System.out.println("After setXYZ (6.0, 7.0, 8.0): " + point3D2.toString());

        float[] coordinates3D = point3D2.getXYZ();
        System.out.println("getXYZ(): (" + coordinates3D[0] + ", " + coordinates3D[1] + ", " + coordinates3D[2] + ")");

    }

}
