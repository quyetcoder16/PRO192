/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Part2 {

    /**
     * @param args the command line arguments
     */
    
//   public void 
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Enter the roll number:");
            Scanner sc = new Scanner(System.in);
//            String name = sc.nextLine();
//            System.out.println(name.matches("SE(.*)"));
            String partten = "";
            String s = "";
            s = sc.nextLine();
            System.out.println("p:");
            partten = sc.nextLine();
            System.out.println(s.matches(partten+"(.*)"));
        } catch (Exception e) {
        } finally {
        }
    }

}
