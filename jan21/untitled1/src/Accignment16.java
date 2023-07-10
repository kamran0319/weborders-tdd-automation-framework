import java.util.Arrays;

public class Accignment16 {
    public static void main(String[] args) {


        int [] arr1 = {0,1,0,3,12};
        moveZeroes(arr1);
//        System.out.println(Arrays.toString(arr1)); //  [1, 3, 12, 0, 0]
        //TEST 2
        int [] arr2 = {0,0,0,0,0,0,1};
        moveZeroes(arr2);
//        System.out.println(Arrays.toString(arr2)); //  [1, 0, 0, 0, 0, 0, 0]
        //TEST 3
        int [] arr3 = {12,2,0,0,2,0,0,78,0,12,0};
        moveZeroes(arr3);
//        System.out.println(Arrays.toString(arr3)); //  [12, 2, 2, 78, 12, 0, 0, 0, 0, 0, 0]
        //TEST 4
        int [] arr4 = {0};
        moveZeroes(arr4);
//        System.out.println(Arrays.toString(arr4)); //  [0]


    }


    public static void moveZeroes(int [] arr){
        // implement here

           int[] temp=new int[arr.length];
           int count=0;
//        for (int number:arr) {
//                 if(number!=0){
//                     temp[count]=number;
//                     count++;
//                 }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++]=arr[i];
        }


//                System.out.println(Arrays.toString(temp));
            }

        System.out.println(Arrays.toString(arr));
//        return ;
        }

    }




