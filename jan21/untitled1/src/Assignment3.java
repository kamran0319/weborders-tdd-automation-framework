import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-999 : ");
        int num1=scan.nextInt();
        int num2 = num1%10;
//        System.out.println(num2);
        int num3 = (num1/10)%10;
//        System.out.println(num3);
        int num4 = num1/100;
//        System.out.println(num4);

        if(num1>=1 && num1<999){
            int total = num3+num2+num4;
            System.out.println(""+total);
        }


        System.out.println(" Out of range");

    }
}
