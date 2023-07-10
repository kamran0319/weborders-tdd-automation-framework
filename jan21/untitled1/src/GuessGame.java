import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int correctNum=(int)(Math.random()*101);
//        System.out.println("Correct num: "+correctNum);

        int guessedNum;
        do{
            System.out.println("Enter the num: ");
            guessedNum=scan.nextInt();
            if(guessedNum>100 || guessedNum<0){
                System.out.println("You entered an invalid number. ");
            }else if(guessedNum>correctNum){
                System.out.println("Your guess is too high");
            }else if(guessedNum<correctNum){
                System.out.println("Your guess is too low");
            }



        }while (guessedNum!=correctNum);
        System.out.println("Congratulations, you found the number. It is : "+correctNum);
    }
}
