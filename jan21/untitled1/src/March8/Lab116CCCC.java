package March8;

public class Lab116CCCC {
    public static void main(String[] args) {

        System.out.println(toCamelCase("the quick BROWN fox")); //"theQuickBrownFox"
        System.out.println(toCamelCase("hello world")); //"helloWorld"
        System.out.println(toCamelCase("HELLO WORLD")); //"helloWorld"
        System.out.println(toCamelCase("heLLo biG WOrLD")); //"helloBigWorld"
    }

    public static String toCamelCase(String s) {
        s = s.toLowerCase();

        int index = s.indexOf(" ");
        int secondIndex = s.indexOf(' ', index + 1);
        int thirdIndex = s.indexOf(' ', secondIndex + 1);

        StringBuilder sb = new StringBuilder(s);

//    sb.replace(sb.indexOf(""),sb.indexOf(" "), sb.substring(sb.indexOf(""),sb.indexOf(" ")).toLowerCase());
        sb.replace(sb.indexOf(" ") + 1, sb.indexOf(" ") + 2, sb.substring(sb.indexOf(" ") + 1, sb.indexOf(" ") + 2).toUpperCase());
        sb.replace(secondIndex + 1, secondIndex + 2, sb.substring(secondIndex + 1, secondIndex + 2).toUpperCase());
        sb.replace(thirdIndex + 1, thirdIndex + 2, sb.substring(thirdIndex + 1, thirdIndex + 2).toUpperCase());
//        sb.toString().replaceAll("[W]","w");
        sb.replace(0,1,sb.substring(0,1).toLowerCase());

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }

        }
            return sb.toString();
        }

    }

