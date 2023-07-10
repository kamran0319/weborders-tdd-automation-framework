package April02;

import java.util.Arrays;

public class Student {

    String firstName;
    String LastName;
    int batchNo;
    boolean isOnCampus;
    int studentID;
    static String[] subjects = new String[]{"Java", "HTML", "Selenium", "Cucumber", "RestAssured", "SQL"};

    static String SCHOOL_NAME = "Duotech";
    static int numberOfStudentsCreated = 0;
    int tuitionBalance;


    public Student() {
    }

    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus) {
        this.firstName = firstName;
        LastName = lastName;
        this.batchNo = batchNo;
        this.isOnCampus = isOnCampus;
        if (isOnCampus) {
            this.tuitionBalance = 5000;
        }else {
            this.tuitionBalance= 4000;
        }
    }

    public String generateStudentID() {
        return (firstName.charAt(0) + LastName.substring(LastName.length() - 1) + batchNo + (int) (Math.random() * 1000)).toUpperCase();
    }


    public String getStudentInfo() {
        return "STUDENT: " + firstName + " "
                + LastName + "\n"
                + "SCHOOL: " + SCHOOL_NAME + "\n"
                + "BATCH: " + batchNo + "\n"
                + "STUDENT ID: " + generateStudentID() + "\n"
                + "ON-CAMPUS: " + isOnCampus + "\n"
                + "SUBJECTS: " + getSubjects() + "\n"
                + "TUITION BALANCE: " +tuitionBalance+ "\n"
                +"What is the amount of tuition paymant being made by the student today? ";
    }

    public String getSubjects() {
        return Arrays.toString(Student.subjects);
    }

    public int payTuition(int amount) {
        if (tuitionBalance != 0 ) {
            tuitionBalance -= amount;
            return tuitionBalance;
        }
        return -666;
    }
}
