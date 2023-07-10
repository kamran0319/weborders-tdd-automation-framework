package March8;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {

        int[] arr= new int[10];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(500+Math.random()*2500);

            }
        System.out.println(Arrays.toString(arr));
          int[] arr1=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
            if(arr1[i]<min){
                arr1[i]=min;
            }
        }

            }
        }
