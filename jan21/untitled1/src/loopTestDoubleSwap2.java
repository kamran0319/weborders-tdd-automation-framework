import java.util.Arrays;

public class loopTestDoubleSwap2 {
    public static void main(String[] args) {

//        System.out.println(isSorted(new double[]{16.1, 12.3, 22.2, 14.4})); // -> false
        System.out.println(isSorted(new double[]{1.5, 4.3, 7.0, 19.5, 25.1, 46.2}));// -> true
//        System.out.println(isSorted(new double[]{2.2, 5.4, 2.2, 5.4})); // -> false
//        System.out.println(isSorted(new double[]{5.2, 5.3, 5.3, 5.5, 5.55, 5.56}));// -> true

    }

//        System.out.println(Arrays.toString(arr));
//
//          double[] temp=new double[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            temp[i]=arr[i];
//
//        }
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));



    public static boolean isSorted(double[] arr){
        //method implementation here
        double[] temp=new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];

            }
//        temp[temp.length-1]=0;
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
        return arr == temp;

    }
}