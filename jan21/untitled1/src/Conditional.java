import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
     String name ="In";
        System.out.print("name:");
        String str = inp.nextLine();
        // Don't change the code above! Write your code below
        System.out.println(" the first 3 letters of " +str+" is "+str.substring(0,3));
    }

}



