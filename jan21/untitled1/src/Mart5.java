import java.util.Arrays;

public class Mart5 {
    public static void main(String[] args) {


        int[] nums = new int[30];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int number =  (int) ( Math.random() * 25);
            nums[i] = number*10;


            if(nums[i]==80){
                count++;
            }


        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);


    }
    }

