public class CLASSTASK055 {
    public static void main(String[] args) {


        System.out.println(randomString()); //  dshvf (example, the actual chars could be different)

        System.out.println(randomString(7)); //cbsassw
        System.out.println(randomString(5, true)); // RVDHC
        System.out.println(randomString(3, false)); //hsd

    }

    // Create 3 overloaded methods here
    public static String randomString() {

        return randomString(5);
    }

    public static String randomString(int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            char ch = (char) (97 + Math.random() * 26);
            str += ch;

        }
        return str;
    }

    public static String randomString(int num, boolean isUpperCase) {

        return isUpperCase?randomString(num).toUpperCase():randomString(num);
    }
}
