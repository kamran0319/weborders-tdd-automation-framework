import java.util.Arrays;

public class loopTest5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumber(new String[]{"kamran", "sakina"})));
        System.out.println(Arrays.toString(getString(new String[]{"kamran", "sakina"})));
    }

    public static int[] getNumber(String[] str) {
        int[] lengthnum = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            lengthnum[i] = str[i].length();
        }
        return lengthnum;
    }

    public static String[] getString(String[] str) {

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toUpperCase();
        }
        return str;
    }
}