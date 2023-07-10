

public class TV {
    //implement the class
    int channel;
    int volume;
    boolean isOn;
    public TV(int channel1,int volume1,boolean isOn1){
        channel=channel1;
        volume=volume1;
        isOn=isOn1;
    }
    public int Channel(){
        if(channel<=120 && channel>=1){
            return channel;
        }
        return 0;
    }
    public int Volume(){
        if(volume<=50 && volume>=1){
            return volume;
        }
        return 0;
    }
    public boolean IsOn(){
        if(isOn==true){
            return true;
        }
        return false;
    }
}
