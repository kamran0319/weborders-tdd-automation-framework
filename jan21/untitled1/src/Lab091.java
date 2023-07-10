import java.util.Arrays;

public class Lab091 {
    public static void main(String[] args) {


        System.out.println(isUnique(new int[]{1, 2, 3, 4, 5, 6})); //-> true
        System.out.println(isUnique(new int[]{1, 2, 3, 4, 5, 6, 1})); //-> false
        System.out.println(isUnique(new int[]{1, 3, 3, 3, 3, 3, 3})); //-> false
        System.out.println(isUnique(new int[]{9, 45, 0, 1, 23, 89, 22, 55})); //-> true
        System.out.println(isUnique(new int[]{55})); //-> true


    }

    public static boolean isUnique(int[] arr) {
        //method implementation here
        for (int i = arr[0]; i < arr.length-1; i++) {
            for (int j = arr[i + 1]; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }

            }
        }
        return true;
    }
}





