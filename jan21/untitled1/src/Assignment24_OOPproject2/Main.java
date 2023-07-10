package Assignment24_OOPproject2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        // Implement the EMA application logic here
        System.out.print("How many emails would you like to generate today?: ");
        int emailNum=new Scanner(System.in).nextInt();


        Scanner scan = new Scanner(System.in);
        int count=0;
        do {
            System.out.println("Creating the email #"+(count+1));
            System.out.println("Choose the type: ");
            System.out.println("1.Student");
            System.out.println("2.Staff");
            int type = scan.nextInt();
            scan.nextLine();

            if(type==1){
                System.out.print("First name: ");
                String firstName = scan.nextLine();
                System.out.print("Last name: ");
                String lastName = scan.nextLine();
                System.out.print("Batch No: ");
                int batchNo = scan.nextInt();


                Email email = new StudentEmail(firstName, lastName, batchNo);

                System.out.println("An email has been created:. ");
                System.out.println(email.toString());

            }
            else if(type==2){
                System.out.print("First name: ");
                String firstName = scan.nextLine();
                System.out.print("Last name: ");
                String lastName = scan.nextLine();
                System.out.print("Department ID: ");
                int departmentId = scan.nextInt();
                StaffEmail staff = new StaffEmail(firstName, lastName,departmentId); System.out.println(staff.toString());

            }

            count++;


        } while (count!=emailNum);

        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
    }
}