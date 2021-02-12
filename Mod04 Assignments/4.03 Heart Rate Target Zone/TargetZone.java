
/**
 * This program calculates the user's heart rate target zone and determines whether
 * or not it is within the target zone.
 *
 * @author Olga Redko
 * @version 10/3/2016
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String zone = "within";             //default assumes target is within zone
        Scanner in = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Enter your age: ");
        String age = in.next();
        System.out.print("Enter your resting heart rate: ");
        String restingHeartRate = in.next();
        System.out.print("Enter your heart rate after exercising: ");
        String exercisingHeartRate = in.next();
        double exercisingHeartRateDouble = Double.parseDouble(exercisingHeartRate);

        //Calculate heart rate target zone min and max
        double maximumHeartRate = 206.9 - ( 0.67 * Double.parseDouble(age));
        double heartRateReserve = maximumHeartRate - Double.parseDouble(restingHeartRate);
        double targetZoneMin = heartRateReserve * 0.65 + Double.parseDouble(restingHeartRate);
        double targetZoneMax = heartRateReserve * 0.85 + Double.parseDouble(restingHeartRate);
        int targetZoneMinInt = (int) targetZoneMin;
        int targetZoneMaxInt = (int) targetZoneMax;
       
        //Determine if heart rate after exercise is not within the target zone's min and max.
        //If heart rate is below, change value of zone variable to "below".
        boolean isBelow = exercisingHeartRateDouble < targetZoneMin;
        
        if(isBelow)
        zone = "BELOW";

        //If heart rate is above, change value of zone variable to "above".
        boolean isAbove = exercisingHeartRateDouble > targetZoneMax;
        
        if(isAbove)
        zone = "ABOVE";
        //Print two output statements
        //The first stating the heart rate target zone values.
        System.out.println("Your heart rate target zone is between " + targetZoneMinInt + " and " + targetZoneMaxInt);

        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. Use the variable "zone" to display the correct status.
        System.out.print("After just exercising, your heart rate is " + zone + " your target zone.");
    } //end main
}//end class TargetZone