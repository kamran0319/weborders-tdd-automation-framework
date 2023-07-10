import static java.lang.Character.*;

public class feb17 {
    public static void main(String[] args) {
        vowelOrConsonant('e'); // Vowel
        vowelOrConsonant('T'); // Consonant
        vowelOrConsonant('U');// Vowel
        vowelOrConsonant('a');// Vowel
        vowelOrConsonant('O');// Vowel
        vowelOrConsonant('X');// Consonant
        vowelOrConsonant('z');// Consonant

    }
    public static void vowelOrConsonant(char ch){
        //implement here
        char resul=toLowerCase(ch);
        switch(resul ){
            case 'a':System.out.println("Vowel");
                break;
            case 'i':System.out.println("Vowel");
                break;
            case 'o':System.out.println("Vowel");
                break;
            case'u':System.out.println("Vowel");
                break;
            case 'e':System.out.println("Vowel");
                break;
            default:System.out.println("Consonant");
                break;
        }

    }
}


