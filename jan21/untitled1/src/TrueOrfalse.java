public class TrueOrfalse {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited")); // → true
        System.out.println(frontAgain("edit")); // → false
        System.out.println(frontAgain("ed")); // → true
        System.out.println(frontAgain("jjj")); // → true
        System.out.println(frontAgain("jjjj")); // → true
        System.out.println(frontAgain("jjjk")); // → false
        System.out.println(frontAgain("x")); // → false
        System.out.println(frontAgain("")); // → false
    }



    public static boolean frontAgain(String str) {


         int ch=str.length();
        if(ch<=1){
            return false;
        }else if (str.substring(0,2).equals(str.substring(ch-2))) {
            return true;


        }
        return false;
    }
}
