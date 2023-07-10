public class Tester {
    public static void main(String[] args) {


     Student student=new Student("Kamran","Abdullayev",39,'m',"accaunting","1314 nw 74th Pl Kansas City, MO 64118",true);


        System.out.println(student.firstname);
        System.out.println(student.lastname);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student.major);
        System.out.println(student.address);
        System.out.println(student.isOnline);
        System.out.println(student.getFullName());
        System.out.println(student.getAge());

    }
}
