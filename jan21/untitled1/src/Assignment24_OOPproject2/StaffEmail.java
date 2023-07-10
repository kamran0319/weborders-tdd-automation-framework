package Assignment24_OOPproject2;

import java.util.Arrays;

public class StaffEmail extends Email{

    private int departmentId;
    private String[] department=new String[]{"Accounting", "Sales", "Marketing", "Instructors"};

    public StaffEmail(String firstName, String lastName, int departmentId) {
        super(firstName, lastName);
        this.departmentId = departmentId;
    }
    public String getEmailAddress() {
        return (getFirstName()+"."+getLastName()+"_d"+departmentId+"@"+
                Arrays.toString(this.department) +"."+getDOMAIN_NAME()).toLowerCase();
    }
    public String getPassword() {
        String alphabet="zxcvbnmasdfghjklqwertyuiop123456789ZXCVBNMASDFGHJKLQWERTYUIOP!@#$%^&*";
        String str="";
        for (int i = 0; i < 8; i++) {
            int password=(int)(Math.random()*alphabet.length());
            str+=alphabet.charAt(password);
        }
        return str;

    }
    public double getCapacity() {
        return 50.0;
    }
    public double getMaxAttachmentSize() {
        return 100.0;
    }
    public String toString() {
        return "TYPE : Staff" +"\n"
                +"DEPARTMENT: " + this.department +"\n"
                + super.toString();
    }
}
