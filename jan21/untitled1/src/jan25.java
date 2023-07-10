//import java.text.DecimalFormat;

public class jan25 {
    public static void main(String[] args) {

        System.out.println(Concatenation("abc", "cat"));
        System.out.println(Concatenation("dog", "cat"));
        System.out.println(Concatenation("abc", ""));


        System.out.println(Concatenation("dog", "good"));
        System.out.println(Concatenation("Java", "apple"));
        System.out.println(Concatenation("Java", "python"));

    }


    //Create your method
    public static String Concatenation(String a,String b){

        if(a.length()<=1 || b.length()<=1){
            return a+b;

        }else if(a.substring(a.lastIndexOf("")-1).equals(b.substring(b.indexOf(""),1))){
            return a+b.substring(b.indexOf("")+1);
        }

           return a+b;
    }

}
