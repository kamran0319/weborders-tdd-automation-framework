//package Assignment22_OOPproject1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Student1 {
//
//    //variables
//    String firstName;
//    String lastName;
//    int batchNo;
//    boolean isOnCampus;
//    String studentID;
//    String[] subjects = new String[]{"Java", "HTML", "selenium", "Cucumber", "RestAssured", "SQL"};
//    static String SCHOOL_NAME = "Duotech";
//    int numberOfStudentsCreated = 0;
//    double tuitionBalance;
//
//    /*
//    no-arg constructor that initializes fields to default values.
//constructor that initializes firstName , lastName, batchNo, isOnCampus. Besides that it needs to do the following:
//initializes studentId using generateStudentID() method.
//initializes tuitionBalance to 5000 if student isOnCampus, otherwise to 4000.
//     */
//
//    public Student1(String firstName, String lastName, int batchNo, boolean isOnCampus) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.batchNo = batchNo;
//        this.isOnCampus = isOnCampus;
//        this.studentID = generateStudentID();
//
//        if (isOnCampus)
//            this.tuitionBalance = 5000;
//        else
//            this.tuitionBalance = 4000;
//    }
//
//
//    public String generateStudentID() {
//
//        return firstName.substring(0, 1).toUpperCase() +
//                lastName.substring(lastName.length() - 1).toUpperCase() +
//                batchNo + (int) (Math.random() * 1000);
//    }
//
//
//    public String getStudentInfo() {
//        return "STUDENT: " + this.firstName + " " + this.lastName
//                + "\nSCHOOL: " + Student1.SCHOOL_NAME + "\nBATCH: " + this.batchNo
//                + "\nSTUDENT ID: " + this.generateStudentID() + "\nON-CAMPUS: " + this.isOnCampus
//                + "\nSUBJECTS: " + Arrays.toString(this.subjects) + "\nTUITION BALANCE: " + this.tuitionBalance;
//    }
//
//
//    public String getSubjects() {
//        return Arrays.toString(this.subjects);
//    }
//
//
//    public void payTuition(double amount) {
//        double newBalance = this.tuitionBalance - amount;
//
//        if (newBalance == 0)
//            System.out.println("The tuition is paid off!");
//        if (amount > newBalance && newBalance < 0)
//            System.out.println("The tuition is paid off. A credit of $" + (amount - this.tuitionBalance) + " dollars is applied to this account.");
//
//    }
//
//}
//
//class Main {
//    public static void main(String[] args) {
//
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" ********************DUOTECH STUDENT MANAGEMENT APPLICATION ********************");
//
//        int count = 0;
//        String students;
//
//        do {
//            System.out.println("Please enter the info: ");
//            System.out.println("First name: ");
//            String firstName = scan.nextLine();
//            System.out.println("Last name: ");
//            String lastName = scan.nextLine();
//            System.out.println("Batch No: ");
//            int batchNo = scan.nextInt();
//            System.out.println("On campus? ");
//            boolean isOnCampus = scan.nextBoolean();
//
//            Student1 student = new Student1(firstName, lastName, batchNo, isOnCampus);
//
//            System.out.println("Here is the information about the student: ");
//            System.out.println(student.getStudentInfo());
//
//            System.out.println("What is the amount you would like to pay today? ");
//            double amount = scan.nextDouble();
//            student.payTuition(amount);
//
//
//            System.out.println("You have added " + (count + 1) + " student to the database. Would you like to add more? (yes/no) ");
//            scan.nextLine();
//            students = scan.nextLine();
//
//            count++;
//
//
//        } while (students.equalsIgnoreCase("yes"));
//    }
//}    }
//}
//
