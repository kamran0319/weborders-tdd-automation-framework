package LAB121b_Inheritance;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Daniz", "123 NW 47th Street", "Java", 2022, 500.0);
        System.out.println(student.toString());
        student.setFee(300.0);
        System.out.println(student.toString());


        Staff staff = new Staff("Jasmin", "123 NW 47th Street", "Paitfander", 1200.0);
        System.out.println(staff.toString());
        staff.setPay(1800.0);
        System.out.println(staff.toString());
    }
}