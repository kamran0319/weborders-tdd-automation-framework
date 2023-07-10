package CLASSTASK064;

public class Employee {
    private String name;
    private double salary;
    private int yearsOfservice;

    public Employee(String name, double salary, int yearsOfservice) {
        this.name = name;
        this.salary = salary;
        this.yearsOfservice = yearsOfservice;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public int getYearsOfservice() {
        return yearsOfservice;
    }

    public void setYearsOfservice(final int yearsOfservice) {
        this.yearsOfservice = yearsOfservice;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", yearsOfservice=" + yearsOfservice +
                '}';
    }

    public double getPaid(){
        return salary;
    }
}

