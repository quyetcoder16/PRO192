/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot7b2;

/**
 *
 * @author quyet
 */
public class Slot7B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       System.out.println("Student-------------------------------------------");
//        Student st1 = new Student("quyet", "vinh phuc", "FPT", 2004, 100000000);
//        System.out.println("getProgram: "+st1.getProgram());
//        System.out.println("getYear: "+st1.getYear());
//        System.out.println("getFee: "+st1.getFee());
//        st1.setProgram("PRO");
//        st1.setYear(2006);
//        st1.setFee(10000000);
//        System.out.println("toString: "+st1.toString());
//        System.out.println("Staff---------------------------------------------");
//        Staff sf1 = new Staff("test staff", "vinh phuc", "FPT", 1000);
//        System.out.println("getSchool: "+sf1.getSchool());
//        System.out.println("getPay: "+sf1.getPay());
//        sf1.setSchool("FPT");
//        sf1.setPay(20000);
//        System.out.println("toString: "+sf1.toString());

        System.out.println("Testing Person:");

        Person person1 = new Person("John Doe", "123 Main St");
        System.out.println("Person(\"John Doe\", \"123 Main St\"): " + person1.toString());

        person1.setAddress("456 Elm St");
        System.out.println("After setAddress(\"456 Elm St\"): " + person1.toString());

        System.out.println("getName(): " + person1.getName());
        System.out.println("getAddress(): " + person1.getAddress());

        // Test Staff
        System.out.println("\nTesting Staff:");

        Staff staff1 = new Staff("Jane Smith", "789 Oak St", "ABC School", 50000);
        System.out.println("Staff(\"Jane Smith\", \"789 Oak St\", \"ABC School\", 50000): " + staff1.toString());

        staff1.setSchool("XYZ School");
        staff1.setPay(55000);
        System.out.println("After setSchool(\"XYZ School\") and setPay(55000): " + staff1.toString());

        System.out.println("getSchool(): " + staff1.getSchool());
        System.out.println("getPay(): " + staff1.getPay());

        // Test Student
        System.out.println("\nTesting Student:");

        Student student1 = new Student("Mike Brown", "321 Maple St", "Computer Science", 2024, 20000);
        System.out.println("Student(\"Mike Brown\", \"321 Maple St\", \"Computer Science\", 2024, 20000): " + student1.toString());

        student1.setProgram("Software Engineering");
        student1.setYear(2025);
        student1.setFee(21000);
        System.out.println("After setProgram(\"Software Engineering\"), setYear(2025), and setFee(21000): " + student1.toString());

        System.out.println("getProgram(): " + student1.getProgram());
        System.out.println("getYear(): " + student1.getYear());
        System.out.println("getFee(): " + student1.getFee());
    }

}
