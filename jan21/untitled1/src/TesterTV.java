

public class TesterTV {
    public static void main(String[] args) {
        TV tv=new TV(121,60,false);
        System.out.println("Channel is: "+tv.Channel());
        System.out.println("Volume is: "+tv.Volume());
        System.out.println("TV is on: "+tv.IsOn());
    }
}
