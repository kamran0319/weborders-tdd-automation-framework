import java.util.Scanner;

public class loopTest1 {
    //test case below (dont change):
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:");
       int x= scan.nextInt();
        System.out.println(MorningOrNight(x));


        }
        public static String MorningOrNight(int x){

        if (x>=0 && x<=11){
            return "Morning";
        }else if(x>11 && x<=24){
            return "Night";
        }else if( x>24){
            return "invalid values";
        }
            return "";
        }


    }

