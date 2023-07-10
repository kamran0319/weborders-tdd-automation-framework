import java.util.Arrays;

public class Lab076 {
    public static void main(String[] args) {

        int[] arr =new int[10];

        int[] arr1=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(1+Math.random()*100);
            arr1[i]=arr[i];
//            if (arr[i]==arr[9]){
//                arr[9]=arr[i]-(arr[i]+1);
//                System.out.println(arr[i]-(arr[i]+1));
            }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
