/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class b2 {

    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter n = ");
            n = sc.nextInt();
            double s = 1;
            for (int i = 1; i <= n; i++) {
                s += 1.0d / i;
            }
            System.out.print("E = ");
            System.out.format("%.2f", s);
        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
        }
    }
}
