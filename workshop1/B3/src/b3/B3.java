/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap so luong ten: ");
            int n = sc.nextInt();
            sc.nextLine();
            String[] listName = new String[n];
            for (int i = 0; i < listName.length; i++) {
                System.out.print("nhap ten thu " + i + " : ");
                listName[i] = sc.nextLine();
            }
            for (String name : listName) {
                System.out.println(name.toUpperCase());
            }
        } catch (Exception e) {
            System.out.println("error:" + e);
        } finally {
        }
    }

}
