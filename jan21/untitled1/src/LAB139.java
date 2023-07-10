import java.util.*;

public class LAB139 {


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 7, 9, 5, 11);  int intToFind = 5;
        List<Integer> integerList1 = Arrays.asList(6, 8, 10, 11, 13);  int intToFind1 = 8;
        List<Integer> integerList2 = Arrays.asList(9, 23, 44, 2, 88, 44);  int intToFind2 = 44;
        System.out.println(foundIntTwice(integerList, intToFind));
        System.out.println(foundIntTwice(integerList1, intToFind1));
        System.out.println(foundIntTwice(integerList2, intToFind2));
//        System.out.println(Collections.frequency(integerList,intToFind));

    }

    public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {

        Collections.frequency(integerList, intToFind);
        List<Integer> newlist = new ArrayList<>();
        if (Collections.frequency(integerList, intToFind) >= 2) {
            return true;
        } else {


            return false;

        }
    }
}


