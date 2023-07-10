import java.util.Scanner;

public class feb3night2 {
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("*                  TIP CALCULATOR                *");
        System.out.println("**************************************************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Bill Amount: $ ");
        double amount = input.nextDouble();

        System.out.print("Enter the tip percentage: % ");
        double percentage = input.nextDouble();
        System.out.println("Your Tip Amount is: $ "+(int)(amount*percentage/100));



    }


}
