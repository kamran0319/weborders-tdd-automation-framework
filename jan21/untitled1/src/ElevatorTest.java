public class ElevatorTest {
    public static void main(String[] args) {

        Lab113_Elevator lab113Elevator = new Lab113_Elevator(10);

        System.out.println("The number of total floor is: "+ lab113Elevator.getNumberOfFloors());
        lab113Elevator.goUp(6);
        lab113Elevator.goUp(4);

        lab113Elevator.goDown(4);
        lab113Elevator.goDown(2);

        lab113Elevator.goUp(9);


        System.out.println("The current floor is: "+ lab113Elevator.getCurrentFloor());


        System.out.println("Door is open ? "+ lab113Elevator.isDoorOpen());
        lab113Elevator.openDoor();
        System.out.println("Door is open ? "+ lab113Elevator.isDoorOpen());





    }
}