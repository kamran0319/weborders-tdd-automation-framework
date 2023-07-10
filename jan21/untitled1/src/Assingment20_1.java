import java.util.Arrays;

public class Assingment20_1 {
    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        subArray1(arr,4);
        subArray1(arr,1,4);


    }

    //Create your methods here
    public static void subArray1 (char arr[], int begin){
        char[] newArr = new char[arr.length-begin];
        for (int i =0; i <arr.length-begin ; i++) {

            newArr[i]=arr[i+begin];
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void subArray1 (char arr[], int begin, int end){
        char[] newArr=new char[end-begin];
        for (int i = 0; i < end-begin; i++) {
            newArr[i]=arr[i+begin];

        }

        System.out.println(Arrays.toString(newArr));
        }




        }






