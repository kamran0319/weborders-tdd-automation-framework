public class Student {

    String firstname;
    String lastname;
    int age;
    char gender;
    String major;
    String address;
    boolean isOnline;

    public Student(String firstname1,
                   String lastname1,
                   int age1,
                   char gender1,
                   String major1,
                   String address1,
                   boolean isOnline1){
firstname=firstname1;
lastname=lastname1;
age=age1;
gender=gender1;
major=major1;
address=address1;
isOnline=isOnline1;




    }
    public String getFullName(){
        return firstname+"  "+lastname;
    }
    public String getAge(){
        return age+"  "+gender+"  "+address;
    }
}
