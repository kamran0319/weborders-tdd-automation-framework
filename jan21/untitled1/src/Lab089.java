import java.util.Arrays;

public class Lab089 {
    public static void main(String[] args) {

        System.out.println(isSorted(new double[] {16.1, 12.3, 22.2, 14.4})); // -> false
        System.out.println(isSorted(new double[] {1.5, 4.3, 7.0, 19.5, 25.1, 46.2}));// -> true
        System.out.println(isSorted(new double[] {2.2, 5.4, 2.2, 5.4})); // -> false
        System.out.println(isSorted(new double[] {5.2, 5.3, 5.3, 5.5, 5.55, 5.56}));// -> true

    }


    public static boolean isSorted(double[] arr){
        //method implementation here
        // double[] num1=new double[num.length];
        //   for (int i = 0; i < num.length; i++) {
        //       num1[i]=num[i];
        //   }
        //   System.out.println(Arrays.toString(num1));
        //   System.out.println(Arrays.toString(num));
        //   System.out.println(Arrays.equals(num1,num));
        double[] num=Arrays.copyOf(arr,arr.length);


        Arrays.sort(num);
        if(Arrays.equals(arr,num)){
            return true;


        }
        return false;


    }
}