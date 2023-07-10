package April01.jan23;

import java.util.Arrays;
import java.util.List;

public class ArrayListString_To_Array {


    public static void main(String[] args) {

        List<String> str = Arrays.asList("way", "the", "all", "jingle", "bells", "jingle", "bells",
                                              "jingle","purple", "green", "blue", "yellow", "green" );
        System.out.println(Arrays.toString(arr(str)));



    }
    public static String[] arr(List<String> str ){

        String[] arrStr = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            arrStr[i]=str.get(i);

        }
        String[] strArr = new String[arrStr.length];
        for (int i = arrStr.length-1; i>=0; i--) {
            strArr[i]=arrStr[i];
        }

        return strArr;
    }
}

