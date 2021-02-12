/**
 * This program calculates various information about a car's usage of gas using a constructor with multiple parameters.
 *
 * @author Olga Redko
 * @version 11/23/2016
 * 
 */
public class CarV5
{
    //private instance variables
    private String carType; 
    private int startMiles, endMiles, distance;
    private double gallonsUsed, pricePerGallon, cost, milesPerGallon, gallonsPerMile;
    
    //default constructor
    CarV5()
    {
    }
    
    //constructor with parameters
    CarV5 (String carType, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon)
    {
        this.carType = carType;
        this.startMiles = startMiles;
        this.endMiles = endMiles;
        this.gallonsUsed = gallonsUsed;
        this.pricePerGallon = startMiles;
    }
    
    //calculate the distance traveled for one day
    public int calcDistance()
    {
        return this.endMiles - this.startMiles;
    } 
    
    //calculate the number of miles per gallon
    public double calcMPG()
    {
        return ( this.endMiles - this.startMiles ) / this.gallonsUsed;      
    } 
   
    //calculate the number of gallons per mile
    public double calcGPM()
    {
        return this.gallonsUsed / ( this.endMiles - this.startMiles );
    }
    
    //calculate the total cost
    public double totalCost()
    {
        return this.pricePerGallon * this.gallonsUsed;
    }
    
    //main method
    public static void main(String[ ] args)
    {   
        //variable declaration and initialization
        String carType = "3142 Time Traveler";
        int startMiles = 56066;
        int endMiles = 56318;
        double gallonsUsed = 9;
        double pricePerGallon = 2.19;
        
        int distance;
        double milesPerGallon, gallonsPerMile, cost;
        
        CarV5 car1 = new CarV5(carType, startMiles, endMiles, gallonsUsed, pricePerGallon);
        
        distance = car1.calcDistance();
        milesPerGallon = car1.calcMPG();
        gallonsPerMile = car1.calcGPM();
        cost = car1.totalCost();
        
        //print data table
        System.out.printf("%100s\n", "Gas Mileage Calculations");
        System.out.printf("%s%20s%20s%20s%20s%20s%20s%20s%20s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("============================================================================================================================================================================");
        System.out.printf("%s%13d%20d%20d%20.1f%20.2f%20.2f%20.1f%20.3f\n", carType, startMiles, endMiles, distance, gallonsUsed, pricePerGallon, cost, milesPerGallon, gallonsPerMile);
    }
}