import java.nio.channels.Pipe;

public class matMax {
    public static void main(String[] args) {

        System.out.println(fullname1("Joe","Biden"));
        System.out.println();

        fullname2("Joe","Biden");
        System.out.println();

    }

      public static String fullname1(String a,String b){
        return ""+b+","+a;
}
    public static void fullname2(String a, String b) {
        System.out.println("" + b + "," + a);


    }


    }

