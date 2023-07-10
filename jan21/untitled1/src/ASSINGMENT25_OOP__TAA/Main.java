package ASSINGMENT25_OOP__TAA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("******************** TOLL ADMINISTRATION APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        // Implement the TAA application logic here
        System.out.print("How many vehicles would you like to calculate toll for ? ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        System.out.println("Calculating the toll for Vehicle #" + count);
        System.out.println("Choose the vehicle type : \n 1.Car \n 2.Truck \n 3.Police Cruiser ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Distance traveled: ");
            int travelDistance = scanner.nextInt();
            System.out.print("Does it have a trailer ?: ");
            boolean haveTrailer = scanner.nextBoolean();
            System.out.print("Is HOV3+ on? : ");
            boolean isHow = scanner.nextBoolean();
            System.out.println("Vehicle                 Distance                    Toll Amount");
            System.out.println("Car                     " +travelDistance+"                   "+isHow);

        }
        if (choice == 2) {
            System.out.print("Distance traveled: ");
            int travelDistance = scanner.nextInt();
            System.out.print("How many axles ?: ");
            int Axles = scanner.nextInt();

            System.out.println("Vehicle                 Distance                    Toll Amount");
            System.out.println("Truck                     " +travelDistance+"           ");

        }
        if (choice == 3) {
            System.out.print("Distance traveled: ");
            int travelDistance = scanner.nextInt();

            System.out.println("Vehicle                 Distance                    Toll Amount");
            System.out.println("Car                     " +travelDistance+"                   ");

        }



//        System.out.println("THANK YOU FOR USING THE TAA! GOODBYE!");

    }
}