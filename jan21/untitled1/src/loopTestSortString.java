import java.util.Arrays;

public class loopTestSortString {
    public static void main(String[] args) {

        System.out.println(sortString("helloworld")); //dehllloorw
        System.out.println(sortString("javascript"));  //aacijprstv
        System.out.println(sortString("algorithm"));  //aghilmort
        System.out.println(sortString("barack"));  //aabckr
        System.out.println(sortString("parviz")); //aiprvz
        System.out.println(sortString("stamlo")); // almost
    }


    public static String sortString(String str){
        //implement here
           char[] ch=str.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);

    }
}