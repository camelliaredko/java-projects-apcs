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
    String myCarType1; 
    int myStartMiles1, myEndMiles1, myDistance1;
    double myGallonsUsed1, myPricePerGallon1, myCost1, myMilesPerGallon1, myGallonsPerMile1;
    
    //default constructor
    CarV5()
    {
    }
    
    //constructor with parameters
    CarV5 (String carTyp, int sMiles, int eMiles, double gals, double thePrice)
    {
        myCarType1 = carTyp;
        myStartMiles1 = sMiles;
        myEndMiles1 = eMiles;
        myGallonsUsed1 = gals;
        myPricePerGallon1 = thePrice;
    }
    
    //calculate the distance traveled for one day
    public int calcDistance()
    {
        return myEndMiles1 - myStartMiles1;
    } 
    
    //calculate the number of miles per gallon
    public double calcMPG()
    {
        return ( myEndMiles1 - myStartMiles1 ) / myGallonsUsed1;      
    } 
   
    //calculate the number of gallons per mile
    public double calcGPM()
    {
        return myGallonsUsed1 / ( myEndMiles1 - myStartMiles1 );
    }
    
    //calculate the total cost
    public double totalCost()
    {
        return myPricePerGallon1 * myGallonsUsed1;
    }
    
    //main method
    public static void main(String[ ] args)
    {   
        //variable declaration and initialization
        String carType1 = "3142 Time Traveler";
        int startMiles1 = 56066;
        int endMiles1 = 56318;
        double gallonsUsed1 = 9;
        double pricePerGallon1 = 2.19;
        double gallonsUsed = 9;
        
        int distance1;
        double milesPerGallon1, gallonsPerMile1, cost1;
        
        CarV5 car1 = new CarV5(carType1, startMiles1, endMiles1, gallonsUsed1, pricePerGallon1);
        
        distance1 = car1.calcDistance();
        milesPerGallon1 = car1.calcMPG();
        gallonsPerMile1 = car1.calcGPM();
        cost1 = car1.totalCost();
        
        //print data table
        System.out.printf("%100s\n", "Gas Mileage Calculations");
        System.out.printf("%s%20s%20s%20s%20s%20s%20s%20s%20s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("============================================================================================================================================================================");
        System.out.printf("%s%13d%20d%20d%20.1f%20.2f%20.2f%20.1f%20.3f\n", carType1, startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, cost1, milesPerGallon1, gallonsPerMile1);
    }
}