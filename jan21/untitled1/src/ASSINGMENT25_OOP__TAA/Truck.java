package ASSINGMENT25_OOP__TAA;

public class Truck extends Vehicle {

    private int noOfAxles;   //represents the amount of axles the truck has.

    public Truck(double distanceTraveled, int noOfAxles) {
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;
    }

    public int getNoOfAxles() {
        return noOfAxles;
    }

    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }

    @Override
    public String toString() {
        return "Truck    " + getDistanceTraveled() +"    "+ super.toString();
    }

    @Override
    public double calculateToll() {
        if (noOfAxles == 4) {
            return super.getDistanceTraveled() * 0.040;
        } else if (noOfAxles == 6) {
            return super.getDistanceTraveled() * 0.045;
        } else {
            return super.getDistanceTraveled() * 0.048;
        }
    }
}
