public class MatSqrt {
    public static void main(String[] args) {

        sort3Ints(3,2,1); //->  1,2,3
        sort3Ints(3, 3, 1); //->  1,3,3
        sort3Ints(-2, -10, -1); //->  -10,-2,-1
        sort3Ints(99, 78, 22); //->  22,78,99
        sort3Ints(0, -2, 1); //->  -2,0,1
        sort3Ints(7, 0, 0); //->  0,0,7
        sort3Ints(5, 5, 5); //->  5,5,5

    }


    // create your method here
//    public static int sort3Ints(int a, int b, int c);
//int first =(int)(Math.min(a,b,c));

    public static int sort3Ints(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(""+a+","+(Math.min(b,c))+","+(Math.max(b,c)));
        } else if(b<=a&&b<=c){
            System.out.println(""+b+","+(Math.min(a,c))+","+(Math.max(a,c)));
        } else if (c<=b&&c<=a) {
            System.out.println(""+c+","+(Math.min(b,a))+","+(Math.max(a,b)));

        }
        return 0000000000;
    }
}




