/**
 * This program calculates various information about a car's usage of gas using a constructor and multiple objects.
 *
 * @author Olga Redko
 * @version 1/1/2017
 * 
 */
public class CarV7
{
    //private instance variables
    private String myCarType1; 
    private int myStartMiles1, myEndMiles1, myDistance1;
    private double myGallonsUsed1, myPricePerGallon1, myCost1, myMilesPerGallon1, myGallonsPerMile1;
    
    CarV7 (String carTyp, int sMiles, int eMiles, double gals, double thePrice)
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
}