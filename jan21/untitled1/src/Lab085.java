public class Lab085 {
    public static void main(String[] args) {
        System.out.println(averageLength(new String[] {"belt", "hat", "jelly", "bubble gum"})); // 5.5;
        System.out.println(averageLength(new String[] {"hi", "hola", "bonjour", "hallo", "konnichiwa"})); // 5.6;
        System.out.println(averageLength(new String[] {"dog", "shiba", "inu"})); // 3.6666666666666665;
        System.out.println(averageLength(new String[] {"ciao", "bye", "hasta luego", "auf wiedersehen", "aloha"})); // 7.6;
    }


    public static double averageLength(String [] arr) {

        int lengtharr;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
          lengtharr=arr[i].length();
          sum=sum+ lengtharr;

        }

          return sum*1.0/(arr.length);




    }

}
