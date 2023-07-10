package ASSINGMENT25_OOP__TAA;

public class Car extends Vehicle {
    private boolean hasTrailer;
    private boolean isHov;     //represents if the car is "HOV3+" car.

    public Car(int distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean isHov) {
        this.isHov = isHov;
    }

    @Override
    public String toString() {
        return "Car      " + getDistanceTraveled() + "     " + super.toString();   // Example:  Car			 231.0				$5.62
    }

   double calculateToll() {
        double toll = super.getDistanceTraveled() * 0.020;
        if(isHov) {
            toll = 0;
        }
        if(hasTrailer) {
            toll += 1;
        }
        return toll;

    }
}
