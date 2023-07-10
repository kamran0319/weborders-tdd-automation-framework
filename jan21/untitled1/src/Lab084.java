public class Lab084 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new char[] {'d','a','d'}));// true
        System.out.println(isPalindrome(new char[] {'m','o','m'})); //true
        System.out.println(isPalindrome(new char[] {'b','a','d'})); //false
        System.out.println(isPalindrome(new char[] {'c','i','v','i','c'})); //true
        System.out.println(isPalindrome(new char[] {'m','a','d','a','m'})); //true
        System.out.println(isPalindrome(new char[] {'a','d','a','m'})); //false
    }


    public static boolean isPalindrome(char[] arr){
        // implement here

        String reverse="";
        String normal="";
        for (int i =0; i < arr.length; i++) {
            reverse=arr[i]+reverse;
            normal=normal+arr[i];
        }
            if(reverse.equals(normal)){
                return true;
            }else {
                return false;
            }

    }

}
