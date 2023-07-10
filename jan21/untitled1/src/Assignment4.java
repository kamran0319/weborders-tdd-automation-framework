import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount =scan.nextDouble();
        int dollars = (int)amount;
        System.out.println(dollars);
        int quarters = (int) ((amount*100)-(dollars*100))/25;
        System.out.println(quarters);
        int dimes = (int)( ((amount*100)-(dollars*100))-(quarters*25))/10;
        System.out.println(dimes);
        int nickels = (int)( ((amount*100)-(dollars*100))-(quarters*25))%10/5;
        System.out.println(nickels);
        int pennies =(int)(( ((((amount*100)-(dollars*100))-(quarters*25))%10)-5)/1);
        System.out.println(pennies);




    }
}
