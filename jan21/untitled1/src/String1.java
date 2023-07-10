import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        //test case below (dont change):

        System.out.println(sumFivesRange(5, 15)); //30
        System.out.println(sumFivesRange(11, 28)); //60
    }

    public static int sumFivesRange(int a, int b) {

        int sum=0;
        while (a <= b) {
            a++;
            sum=sum+a;
            return sum;
        }
        return 0;
    }

}
