import java.util.Scanner;

public class feb16 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int a=1441;
        System.out.println("Welcome to DuoBANK.");
          int count=0;
        do{
            System.out.println("Please enter your pin.");
            a=scan.nextInt();
             if(count==3){
                 System.out.println("You entered wrong pin 3 times, your account is locked. Contact customer service.");
             }
             count++;
        }while(a!=(1441));

        System.out.println("You entered the correct pin. Welcome to your account.!");

    }
    }


