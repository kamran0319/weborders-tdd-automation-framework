import java.util.Arrays;

public class Lab094 {
    public static void main(String[] args) {
        //TESTS
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1, 2, 1})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {6,2})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {2,1,4,1})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1,4,2})); //-> false

        System.out.println(contains(new int[]{ 3, 5, 1, 6, 8, 5, 2}, new int[] {5, 1, 6, 8})); //-> true
        System.out.println(contains(new int[]{4, 5, 1, 6, 8}, new int[] {4, 1, 8})); //-> false

    }
    public static boolean contains(int[] arr1, int[] arr2){
        //method implementation here
        for (int i = 0; i < arr1.length; i++) {
             int[] arr3=Arrays.copyOf(arr1,arr1.length-i);
            System.out.println(Arrays.toString(arr3));
            if (Arrays.equals(arr3,arr2)){
                return true;
            }

        }
        return false;


    }




}
