import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAB130 {


    public static void main(String[] args) {

        //TESTS

            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(-6);
            list.add(3);
            list.add(-8);
            list.add(-1);
            list.add(4);
            list.add(3);

            System.out.println(sumAppend(list)); // [4,3,4,3,14]


        }

        public static ArrayList<Integer> sumAppend (ArrayList < Integer > nums) {
            int Sum=0;
        ArrayList<Integer> sum = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) >0) {
                    sum.add(nums.get(i));
                    Sum+=nums.get(i);

                }
            }
            sum.add(Sum);
            return sum;
        }
    }

