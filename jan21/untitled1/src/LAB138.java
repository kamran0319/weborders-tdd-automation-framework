import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LAB138 {


    public static void main(String[] args) {
          List<Integer> integerList =Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997);
        System.out.println(Arrays.asList(findLargest(integerList)));

    }

    public static List<Integer> findLargest(List<Integer> integerList) {
          List<Integer> reverse = new ArrayList<>();
        for (int i = integerList.size()-1; i>=0 ; i--) {
            reverse.add(integerList.get(i));

        }


        return reverse;
    }
}



