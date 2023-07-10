package April01.jan23;

import java.util.ArrayList;
import java.util.List;

public class LAB140_1 {


    public static void main(String[] args) {

       Integer[] nums = new Integer[]{1, 2, 3};//[1, 2, "Fizz"]
       Integer[] nums1 = new Integer[]{4, 5, 6};//[4, "Buzz", "Fizz"]
       Integer[] nums2 = new Integer[]{7, 8, 9, 10, 11, 12, 13, 14, 15};//[7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
        System.out.println(fizzBuzzList(nums));
        System.out.println(fizzBuzzList(nums1));
        System.out.println(fizzBuzzList(nums2));
    }
    public static List<String> fizzBuzzList(Integer[] integerArray){

        List<String> listInt = new ArrayList<>();
        for (int i=0; i<integerArray.length; i++) {
            if ((integerArray[i] % 3 == 0) && (integerArray[i] % 5 == 0)) {
                listInt.add("FizzBuzz");
            } else if (integerArray[i] % 5 == 0) {
                listInt.add("Fizz");
            } else if (integerArray[i] % 3 == 0) {
                listInt.add("Buzz");
            }else {listInt.add(String.valueOf(integerArray[i]));
            }

        }


        return listInt;
    }

}