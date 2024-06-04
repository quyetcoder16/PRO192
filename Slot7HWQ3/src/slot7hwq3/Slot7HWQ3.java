/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7hwq3;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Slot7HWQ3 {

    public static void testAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for Animal: ");
        String name = scanner.nextLine();

        Animal animal = new Animal(name);

        System.out.println("Animal: " + animal);

    }

    public static void testMammal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for Mammal: ");
        String name = scanner.nextLine();

        Mammal mammal = new Mammal(name);

        System.out.println("Mammal: " + mammal);

    }

    public static void testCat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for Cat: ");
        String name = scanner.nextLine();

        Cat cat = new Cat(name);

        System.out.println("Cat: " + cat);
        cat.greets();

    }

    public static void testDog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for Dog: ");
        String name = scanner.nextLine();

        Dog dog1 = new Dog(name);
        Dog dog2 = new Dog("Another Dog");

        System.out.println("Dog 1: " + dog1);
        System.out.println("Dog 2: " + dog2);

        dog1.greets(dog2);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            testAnimal();
            System.out.println("===========================================");
            testMammal();
            System.out.println("===========================================");

            testCat();
            System.out.println("===========================================");

            testDog();
            System.out.println("===========================================");

        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
        }
    }

}
