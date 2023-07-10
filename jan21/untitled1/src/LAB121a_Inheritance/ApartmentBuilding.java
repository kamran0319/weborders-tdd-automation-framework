package LAB121a_Inheritance;

public class ApartmentBuilding extends Building {
    private int totalUnits;



    public ApartmentBuilding(String address, int squareFootage, int totalUnits) {
        super(address, squareFootage);
        this.totalUnits = totalUnits;
    }


    public String toString() {
        return super.toString()+"  ApartmentBuilding" +
                "totalUnits= " + totalUnits ;
    }
}
