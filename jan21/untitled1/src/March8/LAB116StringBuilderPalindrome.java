package March8;

public class LAB116StringBuilderPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(" Able was I ere I saw Elba"));//-> true
        System.out.println(isPalindrome(" Madam, I'm Adam"));//-> true
        System.out.println(isPalindrome("Mr. Owl ate my metal worm"));//-> true
        System.out.println(isPalindrome("Do geese see God?"));//-> true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));//-> true
        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog"));//-> true
        System.out.println(isPalindrome("Show me the code"));//false
    }

    public static boolean isPalindrome(String str) {
        // implement

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.toLowerCase().charAt(i));
            }
        }if (sb.toString().equals(sb.reverse().toString())){
            return true;
        }

        return false;
    }

}
