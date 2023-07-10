import java.util.Arrays;

public class Assingment20 {
    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        subArray1(arr,4);
        subArray1(arr,1,4);


    }

    //Create your methods here
    public static void subArray1 (char arr[], int begin){
        char newArr [] = new char[arr.length - begin];
        for (int i = 0; i < arr.length - begin; i ++){ //i=3
            newArr[i] = arr[i+begin]; //new[2] = arr[4]
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void subArray1 (char arr[], int begin, int end){
        char newArr [] = new char[end - begin]; //2
        for (int i = 0; i < end-begin; i ++){  //i=2
            newArr[i] = arr[i+begin]; //new[1] = arr[1]
        }
        System.out.println(Arrays.toString(newArr));
        }




        }






