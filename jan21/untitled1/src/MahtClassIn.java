public class MahtClassIn {
    public static void main(String[] args) {
printReverse();
    }
    public static void  printReverse(){
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        int c = (int) (Math.random()*10);
        int d = (int) (Math.random()*10);
        System.out.println(""+a+b+c+d);
        System.out.println(""+d+c+b+a);
    }
}
