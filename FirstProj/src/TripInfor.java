import java.util.Scanner;

public class TripInfor {
          public static void main(String[] args) {

              Scanner input = new Scanner(System.in);

              double gallon, mpg,distance,gascost,gas$,km,speedlimit,hours;

              System.out.println("This proqram will calculate the estimated cost of gas for your trip");

              System.out.println( "Please enter the distance that you are planning to travel:  "  );

              distance = input.nextDouble();

              System.out.println("Please enter the average MPG of car that you are planning to drive :");

              mpg = input.nextDouble();

              System.out.println("Please enter the current gas price : ");

              gas$ =input.nextDouble();

              System.out.println("Please enter speedlimit you going to drive : ");

              speedlimit = input.nextDouble();

              hours = distance/speedlimit;

              gallon = distance / mpg;

              gascost = gallon * gas$;

              km = distance * 1.6F;

              System.out.println("Estimated amound of gas your trip is : "+gallon+ " gallons and estimated cost of gas is : $"+ gascost);
              System.out.println("Your trip with km is:  "+ km);
              System.out.println("This trip spending time is: "+ hours);
              System.out.println(" ");
              System.out.println("                                  Have a safe trip ");






          }
}
