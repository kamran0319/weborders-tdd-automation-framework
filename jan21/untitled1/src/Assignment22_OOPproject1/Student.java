package Assignment22_OOPproject1;

import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    int batchNo;
    boolean isOnCampus;
    String studentID;
    String[] subjects=new String[]{"Java, HTML, Selenium, Cucumber, RestAssured, SQL."};
    static String SCHOOL_NAME="Duotech";
    int numberOfStudentsCreated=0;
    double tuitionBalance;



    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.batchNo = batchNo;
        this.isOnCampus = isOnCampus;
        this.studentID=generateStudentID();
        if(isOnCampus){
            this.tuitionBalance=5000;
        }else {
            this.tuitionBalance=4000;
        }
    }
    public String generateStudentID(){
        return (firstName.charAt(0)+lastName.substring(lastName.length()-1)+
                batchNo+(int)(Math.random()*1000));

    }


    public String getStudentInfo() {
        return "STUDENT: "+firstName+""+lastName+"\n"+
                "SCHOOL: "+"Duotech"+"\n"+
                "BATCH : "+batchNo+"\n"+
                "STUDENT ID : "+generateStudentID()+"\n"+
                "ON-CAMPUS : "+isOnCampus+"\n" +
                "SUBJECTS : "+ Arrays.toString(subjects)+"\n"+
                "TUITION BALANCE : "+tuitionBalance;
    }
    public String getSubjects(){
        return Arrays.toString(subjects);
    }
    public void payTuition(double amound) {
        double newBalance = this.tuitionBalance - amound;

        if (newBalance == 0) {
            System.out.println("The tuition is paid off!");
        }
        if (amound > newBalance && newBalance < 0) {
            System.out.println("The tuition is paid off. A credit of " + (amound - tuitionBalance) + "dollars is applied to this account.");
        }
    }
}

