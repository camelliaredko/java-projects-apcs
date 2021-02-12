/**
 * This program calculates the number of miles a car travels per gallon and the car's daily traveled distance.
 *
 * @author Olga Redko
 * @version 11/22/2016
 * 
 */
public class CarV3
{
    //default constructor
    CarV3()
    {
    }
    
    //heading of data table
    public void dataTableHeading(int sMiles, int eMiles, int dist, double gals, double mpg)
    {
        System.out.printf("%70s\n", "Gas Mileage Calculations");
        System.out.printf("%s%20s%20s%20s%20s%20s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal");
        System.out.println("==================================================================================================================");
        System.out.printf("%s%13d%20d%20d%20.1f%20.1f\n", "3142 Time Traveler", sMiles, eMiles, dist, gals, mpg);
    }
        
    //calculate the distance traveled for one day
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles - sMiles;
    } 
    
    //calculate the number of miles per gallon
    public double calcMPG(int dist, double gals)
    {
        return dist / gals;      
    } 
   
    //main method
    public static void main(String[ ] args)
    {   
        //variable declaration and initialization
        int startMiles1 = 56066;
        int endMiles1 = 56318;
        double gallons1 = 9;
        int distance1;
        double milesPerGallon1;
        
        CarV3 car1 = new CarV3();
        
        distance1 = car1.calcDistance(startMiles1, endMiles1);
        milesPerGallon1 = car1.calcMPG(distance1, gallons1);
        
        car1.dataTableHeading(startMiles1, endMiles1, distance1, gallons1, milesPerGallon1);
    }
}