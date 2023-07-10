import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LAB137 {


    public static void main(String[] args) {

      List<String> list = Arrays.asList("purple", "green", "blue", "yellow", "green");
      List<String> list1 = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");
        System.out.println(reverseList(list));
        System.out.println(reverseList(list1));
    }


    public static List<String> reverseList(List<String> stringList) {
          List<String> revers =new ArrayList<>();
        for (int i = stringList.size()-1; i >=0 ; i--) {
            revers.add(stringList.get(i));
        }


        return revers;
    }
    }




