/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot6b1;

/**
 *
 * @author quyet
 */
public class Slot6B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Employee employee = new Employee(0, "Quyet", "Duong", 50);
        System.out.println("id " + employee.getId());
        System.out.println("first name: " + employee.getFirstName());
        System.out.println("last name: " + employee.getLastName());
        System.out.println("name : " + employee.getName());
        System.out.println("salary : " + employee.getSalary());
        employee.setSalary(60);
        System.out.println("annualSalary: " + employee.getAnnualSalary());
        System.out.println("raise salary " + employee.raiseSalary(20));
        System.out.println("to String : " + employee);
    }

}
