/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author quyet
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SoPhuc s1 = new SoPhuc();
        SoPhuc s2 = new SoPhuc();

        System.out.println("nhap so phuc thu nhat : ");
        s1.input();
        System.out.println("nhap so phuc thu hai :");
        s2.input();
        System.out.print("cong : ");
        System.out.println(s1.cong(s2));
        System.out.print("tru : ");
        System.out.println(s1.tru(s2));
        System.out.print("nhan : ");
        System.out.println(s1.nhan(s2));
        try {
            System.out.print("chia : ");
            System.out.println(s1.chia(s2));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
