public class EmployeeTest {
    public static void main(String[] args) {


        Lab112_Employee lab112Employee = new Lab112_Employee();
        System.out.println("The employee ID is: "+ lab112Employee.getEmployeeId());
        System.out.println("First name is: "+ lab112Employee.getFirstName());
        System.out.println("Last name is: "+ lab112Employee.getLastName());
        System.out.println("The department is: "+ lab112Employee.getDepartment());
        System.out.println("The annual salary is: "+ lab112Employee.getAnnualSalary());
        lab112Employee.setEmployeeId(888888);
        System.out.println("New ID is :"+ lab112Employee.getEmployeeId());
        lab112Employee.setDepartment("Cleaning");
        System.out.println("New department is :"+ lab112Employee.getDepartment());

    }
}