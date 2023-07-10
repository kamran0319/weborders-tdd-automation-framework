package Inheritance;

public class Shiba extends Dog{
    boolean isAmeme;

    public Shiba(double weigth, double height, int age, String breed, boolean isAmeme) {
        super(weigth, height, age, breed);
        this.isAmeme = isAmeme;
    }
public Shiba(){}
    public Shiba(boolean isAmeme) {
        this.isAmeme = isAmeme;
    }
    public void beUsedAmeme(){
        System.out.println("Dogecoin");
    }


    public String sss() {
        return "Shiba{" +
                "isAmeme=" + isAmeme +
                '}';
    }
}
