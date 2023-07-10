package March8;

public class Lab116B11 {
    public static void main(String[] args) {

        System.out.println(interleaveStrings("abc", "def"));//"adbecf"
        System.out.println(interleaveStrings("hello", "world"));//"hweolrllod"
        System.out.println(interleaveStrings("a", "bcdefg"));//"abcdefg"
        System.out.println(interleaveStrings("abc", ""));//"abc"
    }
    public static String interleaveStrings(String s1, String s2) {
        // Implement your solution using StringBuilder here
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while ( i< s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                sb.append(s1.charAt(i));
                i++;
            }
            if (j < s2.length()) {
                sb.append(s2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}
