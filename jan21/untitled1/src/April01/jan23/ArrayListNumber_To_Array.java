package April01.jan23;

import java.util.Arrays;
import java.util.List;

public class ArrayListNumber_To_Array {


    public static void main(String[] args) {

        List<Integer> num=Arrays.asList(25,12,48,62,89,144,52);
        System.out.println(Arrays.toString(arrNum(num)));
    }
    public static Integer[] arrNum(List<Integer> num){

        Integer[] result=new Integer[num.size()];
        for (int i = 0; i < num.size(); i++) {
            result[i]=num.get(i);

        }

        return result;
    }

}