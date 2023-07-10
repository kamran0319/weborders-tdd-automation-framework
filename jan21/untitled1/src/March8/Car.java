package March8;
public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    int price;
    public Car(){

    }

    public Car(String make, String model, int topSpeed, int price) {
        numberOfDoors=4;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors, int topSpeed, int price) {
        make="unknown";
        model="unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int numberOfDoors) {
        topSpeed=320;
        price=43000;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    public String getInfo() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                '}';
    }
}
