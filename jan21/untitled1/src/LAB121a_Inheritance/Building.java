package LAB121a_Inheritance;

public class Building {
    private String address;
    private int squareFootage;

//    public Building() {
//    }



    public Building(String address, int squareFootage) {
        this.address = address;
        this.squareFootage = squareFootage;
    }


    public String toString() {
        return "Building" +
                "address= " + address + '\'' +
                ", squareFootage= " + squareFootage ;
    }
}
