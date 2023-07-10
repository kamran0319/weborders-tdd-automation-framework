package jan24;


import java.util.*;

class Main {


    public static void main(String[] args) {

        //Write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println(" Please enter the following information:");
        System.out.println("");
        System.out.println("");

        System.out.print("What is your firstname ?");
        String firstname = scan.nextLine();

        System.out.println("");

        System.out.print("What is your lastname ?");
        String lastname = scan.nextLine();

        System.out.println("");

        System.out.print("What is your SSN ?");
        String nns = scan.nextLine();

        System.out.println("");

        System.out.print("What is your Phone no ?");
        long phonenumber = scan.nextLong();
//
        System.out.println("");
//
        System.out.print("What is your yearly income ?");
        int income = scan.nextInt();

        System.out.println("");
//
        System.out.print("Are you married ?");
        boolean married = scan.nextBoolean();

        System.out.println("");

        scan.nextLine();
        System.out.print(" What is your address ?");
        String address = scan.nextLine();

        System.out.println("");

        System.out.print(" What is your Weight  ?");

        double weight = scan.nextDouble();
        System.out.println(" ");
        System.out.println(" Thanks, here's the info that you entered:");

        System.out.println(" ");
        // System.out.println("");
        // System.out.println("");
        //  System.out.println("");
        //  System.out.println("");

        System.out.println(" First Name:  " + firstname);
        System.out.println("Last Name: " + lastname);
       System.out.println("SSN: "+ nns);
       System.out.println("Phone no: "+ phonenumber);
        System.out.println("Yearly income: "+ income);
        System.out.println("Married: "+ married);
        System.out.println("Address: "+ address);
        System.out.print("Weight: "+ weight);
    }

}