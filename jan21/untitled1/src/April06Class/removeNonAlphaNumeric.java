package April06Class;

public class removeNonAlphaNumeric {
    public static void main(String[] args) {
        System.out.println(convertPrice("$40.90")); // 40.9
        System.out.println(convertPrice("$91.01")); // 91.01
        System.out.println(convertPrice("$1,149.99")); // 1149.99
        System.out.println(convertPrice("$1,699.00")); // 1699.0
        System.out.println(convertPrice("$14,688.35")); // 14688.35
        System.out.println(convertPrice("$1,688,233.35")); // 1688233.35

    }

    public static double convertPrice(String price){
        price=price.replaceAll("[$,]","");


        return Double.parseDouble(price);
    }
}


