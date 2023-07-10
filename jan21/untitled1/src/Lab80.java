import java.util.Arrays;

public class Lab80 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(1+Math.random()*99);
        }
        System.out.println(Arrays.toString(arr));
    }
}
