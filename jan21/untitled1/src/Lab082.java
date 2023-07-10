import java.util.Arrays;

public class Lab082 {
    public static void main(String[] args) {


        timesTen(new int[] {1,2,3}); //-> [10,20,30]
        timesTen(new int[] {0,10,100,1000}); //-> [0,100,1000,10000]
        timesTen(new int[] {1,2,3}); //-> [10,20,30]
        timesTen(new int[] {7}); //-> [70]
        timesTen(new int[] {1,1}); //-> [10,10]
    }


    public static void timesTen(int [] arr) {
        // implement here

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }
        System.out.println(Arrays.toString(arr));

    }
}
