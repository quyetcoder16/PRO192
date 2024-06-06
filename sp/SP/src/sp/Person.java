/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp;

/**
 *
 * @author quyetdx16
 */
public class Person {

    private String name;
    private int age;
    private String address;
    double salaryPerDay;
    private int dayOfWork;

    public Person() {
    }

    public Person(String name, int age, String address, double salaryPerDay, int dayOfWork) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerDay = salaryPerDay;
        this.dayOfWork = dayOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", address=" + address + ", salaryPerDay=" + salaryPerDay + ", dayOfWork=" + dayOfWork + '}';
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary Per Day: " + getSalaryPerDay());
        System.out.println("Days of Work: " + getDayOfWork());
    }

    public double getSalary() {
        return this.dayOfWork * this.salaryPerDay;
    }

}
