/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp;

import java.util.Scanner;

/**
 *
 * @author quyetdx16
 */
public class SP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Testing Person class

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for Person:");
            System.out.print("Name: ");
            String personName = scanner.nextLine();
            System.out.print("Age: ");
            int personAge = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Address: ");
            String personAddress = scanner.nextLine();
            System.out.print("Salary Per Day: ");
            double personSalaryPerDay = scanner.nextDouble();
            System.out.print("Days of Work: ");
            int personDayOfWork = scanner.nextInt();

            Person person = new Person(personName, personAge, personAddress, personSalaryPerDay, personDayOfWork);
            person.display();
            System.out.println("Total Salary: " + person.getSalary());

            // Testing Officer class
            System.out.println("\nEnter details for Officer:");
            System.out.print("Name: ");
            scanner.nextLine();  // Consume newline
            String officerName = scanner.nextLine();
            System.out.print("Age: ");
            int officerAge = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Address: ");
            String officerAddress = scanner.nextLine();
            System.out.print("Salary Per Day: ");
            double officerSalaryPerDay = scanner.nextDouble();
            System.out.print("Days of Work: ");
            int officerDayOfWork = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Rank (manager/senior/junior): ");
            String officerRank = scanner.nextLine();

            Officer officer = new Officer(officerName, officerAge, officerAddress, officerSalaryPerDay, officerDayOfWork, officerRank);
            officer.display();
            System.out.println("Total Salary: " + officer.getSalary());

            // Testing Worker class
            System.out.println("\nEnter details for Worker:");
            System.out.print("Name: ");
            String workerName = scanner.nextLine();
            System.out.print("Age: ");
            int workerAge = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Address: ");
            String workerAddress = scanner.nextLine();
            System.out.print("Salary Per Day: ");
            double workerSalaryPerDay = scanner.nextDouble();
            System.out.print("Days of Work: ");
            int workerDayOfWork = scanner.nextInt();
            System.out.print("Overtime Hours: ");
            double workerOverTime = scanner.nextDouble();

            Worker worker = new Worker(workerName, workerAge, workerAddress, workerSalaryPerDay, workerDayOfWork, workerOverTime);
            worker.display();
            System.out.println("Total Salary: " + worker.getSalary());

        } catch (Exception e) {
            System.out.println("error: " + e);
        } finally {
        }
    }

}
