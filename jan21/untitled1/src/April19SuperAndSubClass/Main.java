package April19SuperAndSubClass;

public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(4);
        System.out.println();
        spider.printName(9.0);
        System.out.println();
        new Arthropod().printName(5.2);
    }
}
