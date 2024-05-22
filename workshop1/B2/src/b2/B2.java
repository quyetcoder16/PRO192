/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("The user interface may be:");
            System.out.print("Input the number 1: ");
            float n = sc.nextFloat();
            System.out.print("Input the number 2: ");
            float m = sc.nextFloat();
            System.out.print("Input the operator");
            char c = sc.next().charAt(0);
            switch (c) {
                case '+': {
                    System.out.println(n + "+" + m + "=" + (n + m));
                    break;
                }
                case '-': {
                    System.out.println(n + "-" + m + "=" + (n - m));
                    break;
                }
                case '*': {
                    System.out.println(n + "*" + m + "=" + (n * m));
                    break;
                }
                case '/': {
                    System.out.println(n + "/" + m + "=" + (n * 1.0f / m));
                    break;
                }
                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
        }

        // TODO code application logic her
    }

}
