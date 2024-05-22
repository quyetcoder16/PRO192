/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author quyetdx16
 */
public class Assignment {

    public static void countCharacter(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        String normalFormat = s.replaceAll(" ", "").trim().toLowerCase();
        for (char c : normalFormat.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
//        for (char c : charCount.keySet()) {
//            System.out.println(c + " " + charCount.get(c));
//        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap s1 : ");
            String s1 = sc.nextLine();
            System.out.print("nhap s2 : ");
            String s2 = sc.nextLine();

            System.out.println("len of s1 : " + s1.length());
            System.out.println("len of s2 : " + s2.length());
            if (s1.equals(s2)) {
                System.out.println("two string is equal");
            } else {
                System.out.println("two string is not equal");
            }

            System.out.println("concat s1 + s2 " + s1.concat(s2));

            String s1Save = s1.replaceAll("\\s+", " ").trim();

            System.out.println("chuan hoa : " + s1Save);

            System.out.println("so lan xuat hien cua cac ky tu trong ca 2 chuoi");

            countCharacter(s1.concat(s2));

        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
        }
    }

}
