import java.util.Scanner;

public class Assignment2a {
    public static void main(String[] args) {

        System.out.println("*************************************************************************");
        System.out.println("*      TIP CALCULATOR                                                   *");
        System.out.println("*************************************************************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Bill Amount : ");
        double amount = scan.nextDouble();
        System.out.print("Enter the tip percentage : ");
        double persentage =scan.nextDouble();
        System.out.print("Enter the number of people : ");
        int people = scan.nextInt();
        double tip=amount*persentage/100;
//        System.out.println("Your Tip Amount is : "+ tip);
        System.out.println("**************************************************************************");
        double total=tip+amount;
        System.out.println("The total bill amount is : "+total);
        System.out.println("Tip Amount per person is : "+tip/people);
    }
}
