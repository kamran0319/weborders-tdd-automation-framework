package March8;

public class LAB116A {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("abbcccddddeeeee")); // "abcde"
        System.out.println(removeConsecutiveDuplicates("aaaabcccccccccddefffffffffff")); // "abcdef"
    }

    public static StringBuilder removeConsecutiveDuplicates(String input) {
        // Implement your solution using StringBuilder here

        StringBuilder sb = new StringBuilder(input);

        if (sb.length() <= 1) {
            return new StringBuilder(sb.toString());
        }
        if(sb.charAt(0)==sb.charAt(1)){
            return removeConsecutiveDuplicates(sb.substring(1));
        } else {
//            return sb.charAt(0) +removeConsecutiveDuplicates(sb.substring(1));
            return removeConsecutiveDuplicates(sb.substring(1));

        }
    }
}