/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author quyet
 */
public class SoPhuc {

    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
        this.phanAo = 0;
        this.phanThuc = 0;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

//    getter 
    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

//    setter 
    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

//   method 
    public void input() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap phan thuc : ");
            this.phanThuc = scanner.nextDouble();
            System.out.print("nhap phan ao : ");
            this.phanAo = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("error: " + e);
        } finally {
        }
    }

    public SoPhuc cong(SoPhuc soPhuc) {
        return new SoPhuc(this.phanThuc + soPhuc.getPhanThuc(), this.phanAo + soPhuc.phanAo);
    }

    public SoPhuc tru(SoPhuc soPhuc) {
        return new SoPhuc(this.phanThuc - soPhuc.getPhanThuc(), this.phanAo - soPhuc.phanAo);
    }

    public SoPhuc nhan(SoPhuc soPhuc) {
        SoPhuc tmp = new SoPhuc();
        tmp.setPhanThuc(this.phanThuc * soPhuc.getPhanThuc() - this.phanAo * soPhuc.getPhanAo());
        tmp.setPhanAo(this.phanThuc * soPhuc.getPhanAo() + this.phanAo * soPhuc.getPhanThuc());
        return tmp;
    }

    public SoPhuc chia(SoPhuc soPhuc) throws ArithmeticException {
        SoPhuc tmp = new SoPhuc();
        if ((soPhuc.getPhanAo() * soPhuc.getPhanAo() + soPhuc.getPhanThuc() * soPhuc.getPhanThuc()) == 0) {
            throw new ArithmeticException("khong chia duoc cho 0");
        }
        tmp.setPhanThuc((this.phanThuc * soPhuc.getPhanThuc() + this.phanAo * soPhuc.getPhanAo())
                / (soPhuc.getPhanAo() * soPhuc.getPhanAo() + soPhuc.getPhanThuc() * soPhuc.getPhanThuc()));
        tmp.setPhanAo((this.phanAo * soPhuc.getPhanThuc() - this.phanThuc * soPhuc.getPhanAo())
                / (soPhuc.getPhanAo() * soPhuc.getPhanAo() + soPhuc.getPhanThuc() * soPhuc.getPhanThuc()));
        return tmp;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", this.phanThuc, this.phanAo);
    }

}
