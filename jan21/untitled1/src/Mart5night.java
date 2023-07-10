public class Mart5night {
    public static void main(String[] args) {

        System.out.println(generatePlate("VA")); // -> e.g "ADS-2252"
        System.out.println(generatePlate("MD")); // -> e.g "3BS6121"
        System.out.println(generatePlate("DC")); // -> e.g "NS7821"
        System.out.println(generatePlate("NY")); // -> ""

    }
    // implement the method
    public static String generatePlate(String str) {


//        int i=0;
        String random = "";
        char ch = (char) (65 + (int) (Math.random() * 26));
        char ch1 = (char) (65 + (int) (Math.random() * 26));
        char ch2 = (char) (65 + (int) (Math.random() * 26));

        int randomnum = (int) (1000 + Math.random() * 4000);
        int randomnum1 = (int) (Math.random() * 10);
//        if(str.equals("VA")) {
//            return "\""+(""+ch+ch1+ch2)+"-"+randomnum+"\"";
//
//        }else if (str.equals("MD")){
//            return "\""+randomnum1+(""+ch+ch1)+randomnum+"\"";
//
//        }else if(str.equals("DC")){
//            return "\""+(""+ch+ch1)+randomnum+"\"";
//        }
//        return "\"\"" ;
        return switch (str) {
            case "VA" -> "\"" + ("" + ch + ch1 + ch2) + "-" + randomnum + "\"";
            case "MD" -> "\"" + randomnum1 + ("" + ch + ch1) + randomnum + "\"";
            case "DC" -> "\"" + ("" + ch + ch1) + randomnum + "\"";
            default -> "\"\"";
        };
    }
}