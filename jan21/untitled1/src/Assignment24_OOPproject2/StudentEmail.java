package Assignment24_OOPproject2;

public class StudentEmail extends Email{

    private int batchNo;

    public StudentEmail(String firstName, String lastName,int batchNo){
        super(firstName, lastName);
        this.batchNo = batchNo;

    }
    public String getEmailAddress() {
        return (getFirstName()+"."+getLastName()+"_b"+this.batchNo+"@"+"student."+getDOMAIN_NAME()).toLowerCase();
    }
    public String getPassword() {
        String alphabet="zxcvbnmasdfghjklqwertyuiop123456789ZXCVBNMASDFGHJKLQWERTYUIOP";
        String str="";
        for (int i = 0; i < 8; i++) {
            int password=(int)(Math.random()*alphabet.length());
            str+=alphabet.charAt(password);
        }
        return str;

    }
    public double getCapacity() {
        return 25.0;
    }
    public double getMaxAttachmentSize() {
        return 50.0;
    }

    @Override
    public String toString() {
        return "TYPE : Student" +"\n"
                +"BATCH NO: " + this.batchNo +"\n"
                + super.toString();
    }
}
