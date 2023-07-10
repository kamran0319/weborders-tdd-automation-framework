public class Lab112_Employee {

    private int employeeId=1125468;
    private String firstName="Deby";
    private String lastName="Stiven";
    private String department="Packaging";
    private double annualSalary=100000;

    public Lab112_Employee(int employeeId, String firstName, String lastName, int annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public Lab112_Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void raiseSalary(double percent){
        annualSalary=annualSalary+(annualSalary*percent);
    }
}
