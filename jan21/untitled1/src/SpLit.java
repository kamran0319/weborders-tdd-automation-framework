import java.util.*;
public class SpLit {
    public static void main(String[] args) {
//          String[] str=new String[]{"Hi","hello","Goodboy"};
        System.out.println(Arrays.toString(Uppercase(new String[]{"Hi","hello","Goodboy"})));
//        int[] eachElementLength=getnumString(new String[]{"Hi","hello","Goodboy"});
//        System.out.println(Arrays.toString(eachElementLength));
    }

//    public static int[] getnumString(String[] arr){
//
//        int[] newint = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newint[i]=arr[i].length();
//        }
//
//             return newint;
    public static String[] Uppercase(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i].toUpperCase();
            
            
        }
        return arr;
        }
    }

