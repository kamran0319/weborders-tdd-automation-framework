import static java.lang.Character.toLowerCase;

public class feb17next {
    public static void main(String[] args) {
        //TESTS
        System.out.println(convertToRoman(1)); // I
        System.out.println(convertToRoman(5)); // V
        System.out.println(convertToRoman(10)); // X
        System.out.println(convertToRoman(7)); // VII
        System.out.println(convertToRoman(3)); // III
        System.out.println(convertToRoman(0)); // Invalid
        System.out.println(convertToRoman(-2)); // Invalid
        System.out.println(convertToRoman(123)); // Invalid

    }


    public static String convertToRoman(int num){


        //implement the method

        switch (num){
            case 1:
                return "I";

            case 2:
                return "II";
            case 3:
                return "III";

            case 4:
                return "IV";

            case 5:
                return "V";

            case 6:
                return "VI";

            case 7:
                return "VII";

            case 8:
                return "IIX";

            case 9:
                return "IX";

            case 10:
               return "X";

            default:
                return "Invalid";

        }

    }
}


