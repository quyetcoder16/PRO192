/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quyetdx16
 */
public class Bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moto Information");
            System.out.println("====================");
            
//          create list
            List<IMotor> listMoto = new ArrayList<IMotor>();

            System.out.println("enter number of moto:");
            int numberOfMoto = sc.nextInt();

            for (int i = 0; i < numberOfMoto; i++) {
//               create new object imo
                IMotor imo = new IMotor();
                System.out.print("Enter moto number:");
                int number = sc.nextInt();
                imo.setNumber(number);
                sc.nextLine();
                System.out.print("Enter symbol:");
                String symbol = sc.nextLine();
                imo.setSymbol(symbol);
                System.out.print("Enter full name:");
                String fullname = sc.nextLine();
                imo.setFullname(fullname);
                System.out.print("Enter moto weight:");
                float weight = sc.nextFloat();
                imo.setWeight(weight);
                System.out.print("Price : ");
                int price = sc.nextInt();
                imo.setPrice(price);
                System.out.println("");
//                add to list
                listMoto.add(imo);
//                System.out.println(listMoto.toString());
            }

            IMotor maxMoto = listMoto.get(0);

//           find obj have weight max
            for (IMotor iMotor : listMoto) {
//                System.out.println("imo" + iMotor + " max : " + maxMoto);
                if (iMotor.getWeight() > maxMoto.getWeight()) {
                    maxMoto = iMotor;
                }
            }

            System.out.println("===========================");
            System.out.print("Max weight: ");
            maxMoto.display();

        } catch (Exception e) {
        } finally {
        }
    }

}

