package ASSINGMENT25_OOP__TAA;

public abstract class Vehicle {

    private double toll;
    private double distanceTraveled;

    protected Vehicle(double distance) {
        this.distanceTraveled = distance;
        toll=0.0;
    }

    public double getToll() {
        return toll;
    }

    public void setToll(double toll) {
        this.toll = toll;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;

    }
    abstract double calculateToll();
}
