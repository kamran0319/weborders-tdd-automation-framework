//package April01.jan23;
//
//import java.awt.List;
//import java.util.Arrays;
//import java.util.stream.*;
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//
//        // List<String> list = new ArrayList<>(Arrays.asList("fox","Elephant", "Dog", "cat", "Mouse", "bat", "Eagle", "shark", "fox","fox", "elk","elk", "cat","Ant"));
//
//        System.out.println(filterMapSort(new ArrayList<>(Arrays.asList("fox","Elephant", "Dog", "cat", "Mouse", "bat", "Eagle", "shark", "fox","fox", "elk","elk", "cat","Ant"))));
//
//    }
//
//
//
//
//    public static List<String> filterMapSort(List<String> list){
//
//        List<String> streamList = list.stream()
//                .filter(l->l.length()==3 && !l.contains("e"))
//                .map(l->new StringBuilder(l).reverse().toString().toUpperCase())
//                .sorted()
//                .distinct()  // remove duplicate
//                .collect(Collectors.toList());
//
//
//
//        return streamList;
//
//    }
//
//}
