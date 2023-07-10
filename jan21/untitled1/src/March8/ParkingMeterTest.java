package March8;

public class ParkingMeterTest {
    int timeLeft=0;
    int maxTime;

    public ParkingMeterTest(int maxTime) {
        this.maxTime = maxTime;
    }
    public void add(int temp1){
        if(temp1==25){
            timeLeft+=30;
        }
    }
    public boolean add(){
        if (timeLeft<maxTime){
            return true;
        }
        return false;
    }
    public void tick(){
        if(timeLeft>0){
            timeLeft-=1;

        }
    }
    public boolean isExpired(){
        if(timeLeft==0){
            return true;

        }
        return false;
    }
}
