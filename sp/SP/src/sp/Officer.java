/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp;

/**
 *
 * @author quyetdx16
 */
public class Officer extends Person {

    private String rank;

    public Officer() {
    }

    public Officer(String name, int age, String address, double salaryPerDay, int dayOfWork, String rank) {
        super(name, age, address, salaryPerDay, dayOfWork);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rank: " + getRank());
    }

    @Override
    public double getSalary() {
        double baseSalary = this.getSalaryPerDay() * this.getDayOfWork();
        double multiplier = 1.0d;

        switch (this.rank.toLowerCase()) {
            case "manager":
                multiplier = 1.5;
                break;
            case "senior":
                multiplier = 1.2;
                break;
            case "junior":
                multiplier = 1.0;
                break;
            default:
                multiplier = 1.0;
                break;
        }

        return baseSalary * multiplier;
    }

}
