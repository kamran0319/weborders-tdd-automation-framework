import static java.lang.Math.PI;

public class Lab101 {
    public static void main(String[] args) {

        // test your methods here
        double radius=45;
        int width=15;
        int heigth=8;
        getArea(radius);
        getArea(width,heigth);
        getArea(heigth,radius);
    }

    // create your methods here
    public static void getArea(double radius){
        double circle=PI*radius*radius;
        System.out.println(Math.round(circle));
    }
    public static void getArea(int  width,int height){
        int rectangle= width * height;
        System.out.println(Math.round(rectangle));
    }
    public static void getArea(int  heigth,double radius){
        double cylinder=2* PI * radius * radius * heigth;
        System.out.println(Math.round(cylinder));
    }
}