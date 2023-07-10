import java.util.Arrays;

public class Lab100 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};

        char[] arr2 = {'h','e','l','l','o'};

        String[][] arr3 = { {"hey","what's","up"},
                {"hola","que","hondas"},
                {"como","te","vas"},
                {"how","do","you", "do"}
        };
               printArray(arr1);
               printArray(arr2);
               printArray(arr3);



    }
public static void printArray(int[] arr1){

    for (int i = 0; i < arr1.length; i++) {
        int temp=arr1[i];
        System.out.print(temp+" ");

    }
    System.out.println();
}

public static void printArray(char[] arr2){
    for (int i = 0; i < arr2.length; i++) {
        String str=Character.toString(arr2[i]);
        System.out.print(str);

    }
    System.out.println();
}
public static void printArray(String[][] arr3){
           String str="";
    for (int i = 0; i < arr3.length; i++) {
        for (int j = 0; j < arr3[i].length; j++) {
            str+=arr3[i][j]+" ";

        }
        System.out.println(str);
           str="";
    }

}


}