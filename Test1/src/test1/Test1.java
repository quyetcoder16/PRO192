/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            System.out.println("sum = " + sum);
            for (int item : a) {
                if (item % 2 == 0) {
                    System.out.println(item);
                }
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
        }
    }

}
