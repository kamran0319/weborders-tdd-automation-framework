package Assignment24_OOPproject2;

public class Email{
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private double capacity;
    private double maxAttachmentSize;
    private String DOMAIN_NAME ="duotech.io";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getMaxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(double maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }

    public String getDOMAIN_NAME() {
        return DOMAIN_NAME;
    }

    public void setDOMAIN_NAME(String dOMAIN_NAME) {
        DOMAIN_NAME = dOMAIN_NAME;
    }
    public String generateEmail(){
        return "";
    }
    public String generatePassword(){
        return "";
    }
    public String toString(){
        return "NAME: "+getFirstName()+" "+getLastName()+"\n"
                +"GENERATED EMAIL ADDRESS: "+getEmailAddress()+"\n"
                +"GENERATED PASSWORD: "+getPassword()+"\n"
                +"CAPACITY: "+getCapacity()+"\n"
                +"MAX ATTACHMENT SIZE: "+getMaxAttachmentSize();

    }

}