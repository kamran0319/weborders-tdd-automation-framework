import java.util.Arrays;

public class Lab093 {
    public static void main(String[] args) {
        //TESTS
        System.out.println(Arrays.toString(append(new int[] {1,2,3,4,5,6}, new int[] {9,2,1}))); //-> {1,2,3,4,5,6,9,2,1}
        System.out.println(Arrays.toString(append(new int[] {1,3,3,3}, new int[] {23,89,22,55,90,100}))); // -> {1,3,3,3,23,89,22,55,90,100}
        System.out.println(Arrays.toString(append(new int[] {9,45,0,1,23,89,22,55}, new int[] {-3,-2,-1, 0})));// -> {9,45,0,1,23,89,22,55,-3,-2,-1, 0}
        System.out.println(Arrays.toString(append(new int[] {5}, new int[] {6}))); // -> {5,6}


    }


    public static int[] append(int[] arr1, int[] arr2){
        //method implementation here

        int[] result = new int[arr1.length+arr2.length];
        int i =0;


        for (int element: arr1) {
            result[i] = element;
            i++;
        }for (int element: arr2) {
            result[i] = element;
            i++;
        }


        return result;
    }




}
