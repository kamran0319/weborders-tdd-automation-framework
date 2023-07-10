import java.text.DecimalFormat;

public class Salman {
    public static void main(String[] args) {

        double num1 = 56887/5.03;
        DecimalFormat num = new DecimalFormat("##");
        String dollar = num.format(num1);
        System.out.println(dollar);
    }
}
