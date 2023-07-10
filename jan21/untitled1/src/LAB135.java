import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAB135 {


    public static void main(String[] args) {

        String[] arr ={"Apple", "Orange", "Banana"};
        String[] arr1 ={"Red", "Orange", "Yellow"};
        String[] arr2 ={"Left", "Right", "Forward", "Back"};

        System.out.println(array2List(arr));//  ->  ["Apple", "Orange", "Banana"]
        System.out.println(array2List(arr1)); // ->  ["Red", "Orange", "Yellow"]
        System.out.println(array2List(arr2));//  ->  ["Left", "Right", "Forward", "Back"]
    }


    public static List<String> array2List(String[] stringArray) {

             ArrayList<String> getList = new ArrayList<>(Arrays.asList(stringArray));
        return getList;
    }
    }




