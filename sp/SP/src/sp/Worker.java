/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp;

/**
 *
 * @author quyetdx16
 */
public class Worker extends Person {

    private double overTime;

    public Worker() {
    }

    public Worker(String name, int age, String address, double salaryPerDay, int dayOfWork, double overTime) {
        super(name, age, address, salaryPerDay, dayOfWork);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("overTime : " + this.overTime);
    }

    @Override
    public double getSalary() {
        double baseSalary = getSalaryPerDay() * getDayOfWork();
        double overtimeSalary = getOverTime() * getSalaryPerDay() * 1.5; // lương làm thêm
        return baseSalary + overtimeSalary;
    }

}
