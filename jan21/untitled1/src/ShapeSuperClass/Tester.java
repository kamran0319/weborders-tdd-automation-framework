//package ShapeSuperClass;
//
//import java.util.Scanner;
//public class Tester {
//    public static void main(String[] args) {
//        System.out.println("How many shapes  do you want to add to the game: ");
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//
//        Shape[] shapes = new Shape[count];
//
//        for (int i = 0; i < count; i++) {
//            System.out.println("What type of shape you want to create:\n 1.Circle.\n 2.Rectangle");
//                     int type = scanner.nextInt();
//            System.out.println("Creating Shape no"+(i+1));
//
//                     if(type==1){
//                         System.out.println("Please enter the radius for a Circle: ");
//                         double radius = scanner.nextDouble();
//                         shapes[i] = new Circle(radius);
//                     }else if(type==2){
//                         System.out.println("Please enter the width and heigth for a Rectangle:");
//                         double width = scanner.nextDouble();
//                         double heigth = scanner.nextDouble();
//                         shapes[i] = new Rectangle(width,heigth);
//
//                     }else {
//                         System.out.println("Wrong entry. Default Shape will be created. ");
//                         shapes[i] = new Circle(1);
//                     }
//            System.out.println("-------------------------------------------------------------");
//        }
//        System.out.println("Here are the shapes that you've created: ");
//        for(Shape shape : shapes){
//            System.out.println(shape + "The perimeter: "+shape.getPerimeter());
//        }
//    }
//}
