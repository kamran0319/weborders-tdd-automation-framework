import java.util.Arrays;

public class Lab081 {
    public static void main(String[] args) {


        System.out.println(sumElements(new int[] {1,2,3,4,5})); // -> 15
        System.out.println(sumElements(new int[] {1,1,1,1,1,1}));// -> 6
        System.out.println(sumElements(new int[] {0,10,100})); // -> 110
        System.out.println(sumElements(new int[] {77})); // -> 77
    }

    public static int sumElements(int[] arr) {

        // implement here
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;

    }
}
