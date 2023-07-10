package CLASSTASK064;

public class Main {
    public static void main(String[] args) {

        //TEST YOUR CLASSES
        Employee employee = new Employee("Tom",18000.0,14);
        Manager manager = new Manager("Mark",16000.0,9,5.5);
        Programmer programmer = new Programmer("Den",13000.0,12,"Java");

        System.out.println(employee.toString());
        System.out.println(employee.getPaid());
        System.out.println("---------------------------------");
        System.out.println(manager.toString());
        System.out.println(manager.getPaid());
        System.out.println("---------------------------------");
        System.out.println(programmer.toString());
        System.out.println(programmer.getPaid());



    }
}
