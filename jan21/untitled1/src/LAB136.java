import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LAB136 {


    public static void main(String[] args) {

        List<String> arr =Arrays.asList("Apple", "Orange", "Banana");
        List<String> arr1 =Arrays.asList("Red", "Orange", "Yellow");
        List<String> arr2 =Arrays.asList("Left", "Right", "Forward", "Back");


        System.out.println(Arrays.toString(list2Array(arr)));//  ->  {"Apple", "Orange", "Banana"}
        System.out.println(Arrays.toString(list2Array(arr1))); // ->  {"Red", "Orange", "Yellow"}
        System.out.println(Arrays.toString(list2Array(arr2)));//  ->  {"Left", "Right", "Forward", "Back"}


    }


    public static String[] list2Array(List<String> stringList) {

        String[] str = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            str[i]=stringList.get(i);

        }
//        System.out.println(Arrays.toString(str));
        return str ;
      }
    }




