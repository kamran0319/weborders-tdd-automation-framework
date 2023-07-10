import java.util.Scanner;

public class feb15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Put your score: ");
        int score = scan.nextInt();
        System.out.println("Which attempt is this to retake the test ?");
        int test=scan.nextInt();
        int attempt1=1;
        int attempt2=2;
        int attempt3=3;


        if(test==attempt1){
            System.out.println("After the second retake attemptm your score is: "+(score-(score*10/100)));

        }else if(test==attempt2){
            System.out.println("After the second retake attemptm your score is: "+(score-(score*20/100)));
        }else if(test==attempt3){
            System.out.println("After the second retake attemptm your score is: "+(score-(score*35/100)));
        }else {
            System.out.println("Your didn't pass");
        }





    }

    }
