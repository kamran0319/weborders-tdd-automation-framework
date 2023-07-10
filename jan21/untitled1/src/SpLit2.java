import java.util.Arrays;

public class SpLit2 {
    public static void main(String[] args) {

      String str="Java is fun";
      char[] charArray=str.toCharArray();
        System.out.println(Arrays.toString(charArray));


            char temp = charArray[0];
            charArray[0] = charArray[charArray.length - 1];
            charArray[charArray.length - 1] = temp;

        System.out.println(Arrays.toString(charArray));

//        String str2= new String(charArray);
//        System.out.println(str2);

        String s=String.valueOf(charArray);
        System.out.println(s);
        }

    }

