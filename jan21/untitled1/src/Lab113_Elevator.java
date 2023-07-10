public class Lab113_Elevator {

private int currentFloor=1;
private int numberOfFloors;
private boolean doorOpen;

    public Lab113_Elevator() {
    }

    public Lab113_Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
    public void openDoor(){
        doorOpen=true;
    }
    public void closeDoor(){
        doorOpen=false;

    }
    public void goUp(int desiredFloor){
        if(doorOpen==false && currentFloor+desiredFloor<=numberOfFloors){
            currentFloor=desiredFloor+currentFloor;
        }
    }
    public void goDown(int desiredFloor){
        if(doorOpen==false && currentFloor-desiredFloor>=1){
            currentFloor=currentFloor-desiredFloor;
        }
    }

}
