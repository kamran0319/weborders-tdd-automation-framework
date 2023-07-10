import java.util.Arrays;

public class Lab092 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(rotateRight(new int[]{3, 8, 19, 7}))); //-> {7, 3, 8, 19}
        System.out.println(Arrays.toString(rotateRight(new int[]{1, 2, 3, 4, 5, 6}))); //-> {6,1,2,3,4,5}
        System.out.println(Arrays.toString(rotateRight(new int[]{1, 3, 2}))); //-> {2,1,3}
        System.out.println(Arrays.toString(rotateRight(new int[]{9, 45, 0, 1, 23, 89, 22, 55}))); //-> {55,9,45,0,1,23,89,22}

    }

    public static int[] rotateRight(int[] arr){
        //method implementation here
        for (int i = 0,j=arr.length-1; i < arr.length; i++) {

            int temp=arr[j];
           arr[j]=arr[i];
            arr[i]=temp;



        }
        return arr;
    }
}





