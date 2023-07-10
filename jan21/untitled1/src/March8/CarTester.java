package March8;

public class CarTester {
    public static void main(String[] args) {


        Car car = new Car("Toyota", "Avalon", 215, 25000);
        System.out.println(car.getInfo());
        Car car1=new Car(5,200,18000);
        System.out.println(car1.getInfo());
        Car car2=new Car("Chevy","Silverado",4);
        System.out.println(car2.getInfo());
    }
}
