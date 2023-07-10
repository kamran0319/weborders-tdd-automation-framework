import java.util.Arrays;

public class loopTest6 {
    public static void main(String[] args) {

       String str="hayat cok guzel";

     char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        char temp;
        for (int i = 0,j=ch.length-1; i <j ; i++,j--) {
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;

        }
        System.out.println(new String(ch));








          }


          }

