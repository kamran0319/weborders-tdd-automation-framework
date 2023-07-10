import java.util.Scanner;

public class feb15second {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your salary : $");
        int salary = scan.nextInt();
        System.out.println("Are you full time employee ?(true or false) : ");
        boolean fulltime =scan.nextBoolean();
        if(fulltime==true){
            System.out.println("This is you final salary :"+(salary+20000));
        }else {
            System.out.println("This is you final salary :"+(salary-5000));
        }





    }

    }
