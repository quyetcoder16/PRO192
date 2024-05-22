/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap n = ");
        int n = sc.nextInt();
        System.out.print("nhap m = ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(a[i][j] + " ");
                sum += a[i][j];
            }
        }

        System.out.println("sum = " + sum);
        System.out.print("average:");
        System.out.format("%.3f", (float) (sum * 1.0f / (n * m)));

    }

}
