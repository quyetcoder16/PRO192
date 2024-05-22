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
        boolean cont = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("The user interface may be:");
                System.out.println("Enter the number");
                int n = sc.nextInt();
                if (n < 1) {
                    throw new Exception();
                }
                System.out.println("The number is " + n);
                cont = false;

            } catch (Exception e) {
//                System.out.println("error:" + e);
                System.out.println("The number is invalid");
            } finally {
            }
        } while (cont);

    }

}
