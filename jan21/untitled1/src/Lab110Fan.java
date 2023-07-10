public class Lab110Fan {
    static int noOfFans=0;
    int SLOW=1;
    int MEDIUM=2;
    int FAST=3;
    int speed=SLOW;
    boolean isOn;
    double radius=5;
    String color="blue";
    String manufacturer="WhirlWind";
    String productId="xxx";

    public Lab110Fan() {
    }

    public Lab110Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }


    public String toString() {
        if(isOn==true){
            return "The fan speed is: "+speed+"   The fan color is: "+color+"   The fan radius is: "+radius;
        }else {
            return "fan is off "+" The fan color is: "+color+"     The fan radius is: "+radius;
        }
    }
    public static String getNoOfFansCreated(){
        noOfFans++;
        return "The number of Fan objects is: "+noOfFans;
    }

    public String generateProductId(){
        String alphabet="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789";
        String str="";
        for (int i = 0; i < 10; i++) {
            int randommix=(int)(Math.random()*alphabet.length());
            str+=alphabet.charAt(randommix);

        }
        return "The product ID is: "+str;
    }
}

