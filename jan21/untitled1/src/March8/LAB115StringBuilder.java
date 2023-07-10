package March8;

public class LAB115StringBuilder {
    public static void main(String[] args) {
        System.out.println(removeNonAlphaNumeric("https://www.duotech.io/"));
        System.out.println(removeNonAlphaNumeric("`HGN)B#Rmck~Xv3"));
        System.out.println(removeNonAlphaNumeric("(703) 569-1510"));
    }

    public static String removeNonAlphaNumeric(String str) {
        //implement
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));

            }
        }

        return sb.toString();
    }
}
