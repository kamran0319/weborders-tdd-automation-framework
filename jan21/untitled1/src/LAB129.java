import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LAB129 {


    public static void main(String[] args) {

        //TESTS
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "java", "scala", "ruby", "clojure", "java"));
        removeAll(list, "java");
        System.out.println(list); //[python, scala, ruby, clojure]


        List<String> list2 = new ArrayList<>(Arrays.asList("java", "java", "java", "java", "java"));
        removeAll(list2, "java");
        System.out.println(list2);  // []

    }

    public static void removeAll(List<String> list, String targetWord) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(targetWord)){
                list.remove(list.get(i));
                i--;

            }

        }







    }
}

