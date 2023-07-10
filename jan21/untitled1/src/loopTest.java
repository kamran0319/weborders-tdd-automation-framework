import java.util.Scanner;

public class loopTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("#1: ");
        int num1 = s.nextInt();
        System.out.println("#2: ");
        int num2 = s.nextInt();
        //start on line 11
//        while (num1<=num2){
//            if (num1%2!=0){
//                System.out.print(num1+" ");
//
//            }
//            num1++;
//
//        }

              for(int i=num1;i<=num2;i++){

                  if(i%2!=0 ){
                      System.out.print(i+" ");
                  }
//                  System.out.print(num1+" ");
              }




    }
}