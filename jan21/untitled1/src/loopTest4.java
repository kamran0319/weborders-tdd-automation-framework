import java.util.Arrays;
import java.util.Scanner;

public class loopTest4 {
    public static void main(String[] args) {
       String[] titlesArraya={"Pluto TV Kids","CNET","Fear Factor"};
       String[] categoriesArray={"Kamran Zordu","Sakina Gozeldi","Daniz smartdi"};
       printArray(titlesArraya,categoriesArray);
    }
    public static void printArray(String[] arr1,String[] arr2){
        String str="";
        for (int i = 0; i < arr1.length; i++) {
            str="\""+arr1[i]+"\""+" , "+"\""+arr2[i]+"\"";
            System.out.println(str);

        }

//        System.out.println(str);
    }
}