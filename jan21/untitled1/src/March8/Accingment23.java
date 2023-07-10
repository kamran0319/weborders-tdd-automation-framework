package March8;

public class Accingment23 {
    public static void main(String[] args) {


     System.out.println(reverse(123456)); // 654321
    System.out.println(reverse(-123456)); // -654321
    System.out.println(reverse(1147483647)); // 0  -> because 7463847411 is out of range for int
    System.out.println(reverse(2110000002)); // 2000000112
    System.out.println(reverse(-1366899991)); //-1999986631
    System.out.println(reverse(-2147321113)); // 0  -> because -3111237412 is out of range for int

}
    public static int reverse(int x){  //do not change the method parameter and return type

            int reversed = 0;

            while(x>0){

                int lastDigit = x%10;
                reversed = reversed*10 + lastDigit;
                x = x/10;

            }

            return reversed;
        }
    }



