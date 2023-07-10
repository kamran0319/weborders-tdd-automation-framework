import java.util.Arrays;
import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int user=scan.nextInt();



         int indexOfnum=0;
         int findnum=50;
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(1+Math.random()*51);
            if(arr[i]==findnum){
                indexOfnum=i+1;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Value to find: "+findnum);
        if (indexOfnum>0){
            System.out.println(findnum+"  is in slot :  "+indexOfnum);

        }else {
            System.out.println(findnum+"   is not in the array.");
        }



    }
}
