package April19SuperAndSubClass3;

public class Car extends Vehicle {

    public static void generateVin(){
        System.out.println("Generate Car Vin");
    }


    public static void getvin(){

        System.out.println("get vehicle zin");
    }


    public static void main(String[] args) {
        Car car=new Car();
        Car.generateVin();
        Vehicle.generateVin();
        car.getvin();
        Car.getvin();

    }
}
