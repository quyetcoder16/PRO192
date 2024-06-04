/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentms;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class Student {

    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new  Scanner(System.in);
        System.out.println("nhap thong tin sinh vien : ");
        System.out.println("nhap ma Sv:");
        this.code = sc.nextLine();
        System.out.println("nhap ho ten ");
        this.name = sc.nextLine();
        System.out.println("nhap nam sinh:");
        this.bYear = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap dia chi:");
        this.address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }
    
    
    
    public void output(){
        System.out.println(this);
    }

}
