package April06Class;

public class today06 {
    public static void main(String[] args) {
//      System.out.println(toCamelCase("the quick BROWN fox")); //"theQuickBrownFox"

      System.out.println(getReverse(455248));
//      Integer integer=Integer.valueOf("45211145");
//        System.out.println(integer);
//        int inte=Integer.valueOf("452225555");
//        System.out.println(inte);
//        double price=Double.parseDouble("23.56");
//        System.out.println(price);
//        long l=Long.parseLong("32");
//        System.out.println(l);
//        Long s=Long.parseLong("42");
//        System.out.println(s);
//      String input = "Hello world, how are you?";
//      int index = input.indexOf(' '); // find index of first space
//      if (index != -1) { // if space found
//        int secondIndex = input.indexOf(' ', index + 1); // find index of second space
//        if (secondIndex != -1) { // if second space found
//          String secondWord = input.substring(index + 1, secondIndex); // extract second word
//          System.out.println("Second word: " + secondWord);
//          System.out.println("Starting point: " + (index + 1)); // starting point of second word
//        }
//      }

    }
//  public static String toCamelCase(String s){
//    StringBuilder sb=new StringBuilder(s);
//    for (int i = 0; i < sb.length(); i++) {
//      if(sb.charAt(i)==' '){
//        sb.deleteCharAt(i);
//        i--;
//      }
//    }
//
//    return sb.toString();
//  }
//  }
public static int getReverse(int num){
  int reversed = 0;

  while(num>0){

    int lastDigit = num%10;
    reversed = reversed*10 + lastDigit;
    num = num/10;

  }

  return reversed;
}
}


