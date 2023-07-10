package Assignment22_OOPproject1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int count = 0;
        String students;

        do {
            System.out.println("Please enter the info: ");
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Batch No: ");
            int batchNo = scan.nextInt();
            System.out.print("On campus? ");
            boolean isOnCampus = scan.nextBoolean();

            Student student = new Student(firstName, lastName, batchNo, isOnCampus);

            System.out.println("Here is the information about the student: ");
            System.out.println(student.getStudentInfo());

            System.out.print("What is the amount you would like to pay today? ");
            double amount = scan.nextDouble();
            student.payTuition(amount);


            System.out.println("You have added " + (count + 1) + " student to the database. Would you like to add more? (yes/no) ");
            scan.nextLine();
            students = scan.nextLine();

            count++;

        } while (students.equalsIgnoreCase("yes"));
    }
}
