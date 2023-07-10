import java.util.Arrays;

public class Lab090 {
    public static void main(String[] args) {
        System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 2)); // 101
        System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 1)); // 102
        System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 3)); // 99
        System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 1)); // 342
        System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 5)); // 72
        System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 8)); // 34
    }


    public static int kthLargest(int[] arr, int k){
        //method implementation here
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(k==i){

                return arr[arr.length-i];
            }

            }

        return 0;
    }
}