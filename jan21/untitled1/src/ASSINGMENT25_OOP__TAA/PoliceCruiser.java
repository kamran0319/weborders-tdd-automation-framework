package ASSINGMENT25_OOP__TAA;

public class PoliceCruiser extends Vehicle{

    public PoliceCruiser(double distanceTraveled) {
        super(distanceTraveled);
    }

    @Override
    public double calculateToll() {
        return 0.0;
        //Police cars get to drive free on the toll road.
    }

    @Override
    public String toString() {
        return "PoliceCruiser{} " + super.toString();
    }
}
