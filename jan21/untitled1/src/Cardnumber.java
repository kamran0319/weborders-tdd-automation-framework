public class Cardnumber {
    public static void main(String[] args) {


        System.out.println(getRandomCreditCardNo(1));
        System.out.println(getRandomCreditCardNo(2));
        System.out.println(getRandomCreditCardNo(3)+"  American Express");
        System.out.println(getRandomCreditCardNo(4)+"  Visa");
        System.out.println(getRandomCreditCardNo(0));
        System.out.println(getRandomCreditCardNo(2330));

    }
    public static String getRandomCreditCardNo(int number){


    //int a=(int)(3000+(Math.random()*1000));
    if(number==3) {
        return (""+(long)(300000000000000l+(Math.random()*10000000000000l)));
    } if (number==4) {
        return (""+(long)(4000000000000000l+(Math.random()*100000000000000l)));
    }if (number==5) {
        return (""+(long)(5000000000000000l+(Math.random()*100000000000000l)));
    }if (number==6) {
        return (""+(long)(6000000000000000l+(Math.random()*100000000000000l)));
    }
        return "mismach cardnumber";
    }
}
