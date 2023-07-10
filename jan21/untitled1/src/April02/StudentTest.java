package April02;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("Kamran",
                "Abdullayev",
                5,false);


        System.out.println(student.getStudentInfo());
//        student.payTuition(2000);
        System.out.println(3000);
        System.out.println("The new balance is $"+student.payTuition(3000));
        System.out.println("");






    }



}
