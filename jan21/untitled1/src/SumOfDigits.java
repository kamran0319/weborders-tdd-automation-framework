import java.text.DecimalFormat;
import java.util.Scanner;

class Kamran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
        DecimalFormat num1 = new DecimalFormat("##");
        String num2=num1.format(num);
        System.out.println(num2);


    }
}