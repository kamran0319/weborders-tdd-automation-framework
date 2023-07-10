package April01.jan23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_To_ArrayListNumber {


    public static void main(String[] args) {

       Integer[] nums = new Integer[]{12,23,54,62,951};
        System.out.println(listNum(nums));
    }
    public static ArrayList<Integer> listNum(Integer[] nums){

        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(nums));



        return listInt;
    }

}