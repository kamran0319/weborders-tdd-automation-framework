
import java.util.ArrayList;
public class LAB124 {


        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            list.add("hello");
            list.add("hola");
            list.add("hallo");
            list.add("que paso");
            list.add("como");

            test(list);

            System.out.println(list); //[duo, hola, hallo, que paso, tech]

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("hello");
            list2.add("como");

            test(list2);

            System.out.println(list2); //[duo,tech]

            ArrayList<String> list3 = new ArrayList<>();
            list3.add("duo");
            list3.add("hola");
            list3.add("hallo");
            list3.add("que paso");
            list3.add("tech");

            test(list3);
            System.out.println(list3);


        }



        public static void test(ArrayList<String> words){
            // implement here


            System.out.println(words.get(0)+words.get(words.size()-1));

        }
    }


