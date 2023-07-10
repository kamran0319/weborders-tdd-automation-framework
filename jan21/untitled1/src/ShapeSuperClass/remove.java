package ShapeSuperClass;

import java.util.*;

class Main {


    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();

        list.add('a');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('c');
        list.add('d');
        list.add('d');
        list.add('d');
        // list.add('a');


        removeDuplicates(list);
        System.out.println(list);  //   [a, b, c, d]

    }

    public static void removeDuplicates(List<Character> list) {
        //  write your implementation here

        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            char currentChar = list.get(i);
            char nextChar = list.get(i + 1);
            if (currentChar == nextChar) {
                list.remove(i);
                i--;
            }
        }
    }
}