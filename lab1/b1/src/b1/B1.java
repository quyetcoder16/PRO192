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
    
    
    public static void printOut(int a[]) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static int binarySearch(int a[], int k) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > k) {
                high = mid - 1;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                int i = mid;
                while (i >= 0 && a[i] == k) {
                    i--;
                }
                return i + 1;
            }
        }

        return -1;

    }

    public static boolean checkSy(int a[]) {
        for (int i = 0; i <= a.length / 2 + 1; i++) {
            if (a[i] != a[a.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter n : ");
            n = sc.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                System.out.print("enter a[" + i + "] = ");
                a[i] = sc.nextInt();
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            boolean checksy = checkSy(a);
            System.out.print("print all element in arr:");
            printOut(a);
            System.out.println("min : " + min);
            System.out.println("max : " + max);
            System.out.print("the numers are prime: ");
            int isPrime[] = new int[n];
            int countPri = 0;
            int countNotIsPrime = 0;
            int notIsPrime[] = new int[n];
            for (int x : a) {
                if (checkPrime(x)) {
                    isPrime[countPri] = x;
                    countPri++;
                    System.out.print(x + " ");
                } else {
                    notIsPrime[countNotIsPrime] = x;
                    countNotIsPrime++;
                }
            }
            if (countPri == 0) {
                System.out.println("ko co so nguyen to!");
            }
            System.out.println("");
            System.out.print("mang sau khi sap xep:");
            sort(a);
            printOut(a);
            int k;
            System.out.print("enter k = ");
            k = sc.nextInt();
            int index = binarySearch(a, k);
            if (index != -1) {
                System.out.println("phan tu bang k tai " + index);
            } else {
                System.out.println("Not found!");
            }

            if (checksy) {
                System.out.println("la mang doi xung");
            } else {
                System.out.println("khong la mang doi xung");
            }
            System.out.print("mang nguyen to : ");
            for (int i = 0; i < countPri; i++) {
                System.out.print(isPrime[i] + " ");
            }
            System.out.println("");
            System.out.print("mang khong nguyen to:");
            for (int i = 0; i < countNotIsPrime; i++) {
                System.out.print(notIsPrime[i] + " ");
            }
            System.out.println("");

        } catch (Exception e) {
            System.out.println("error : " + e);
        } finally {
        }

    }

}
