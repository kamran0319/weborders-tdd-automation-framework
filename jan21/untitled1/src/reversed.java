import java.util.Scanner;

public class reversed {
    public static void main(String[] args) {
// it gives you reversed number what number you added 

        Scanner input = new Scanner(System.in);
        int reversed =input.nextInt();
        int num= ( reversed%10);
         int num1= ( reversed/10);
        int num3=num1%10;
        int nam2 = (num1/10);
        System.out.println(""+num+num3+nam2);


    }
}
