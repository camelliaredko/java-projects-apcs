/**
 * This class instantiates data objects.
 * 
 * @author Olga Redko
 * @version 1/1/2017
 */
class AnnualFuelUse
{
    //declaration of private instance variables
    private double myCost, myStartMiles, myDistance, myGallonsUsed, myPricePerGallon, myEndMiles, myMPG;
    
    //constructor for objects of type AnnualFuelUse
    AnnualFuelUse(double sMiles, double eMiles, double galUsed, double thePrice)
    {
        myStartMiles = sMiles;
        myEndMiles = eMiles;
        myGallonsUsed = galUsed;
        myPricePerGallon = thePrice;
        myDistance = 0.0;
        myMPG = 0.0;
        myCost = 0.0;
    }
    
    //mutator method to calculate distance traveled
    public void calcDistance()
    {
        myDistance = myEndMiles - myStartMiles;
    }
    
    //getter method to return the value of the distance
    public double getDistance()
    {
        return myDistance;
    }
    
    //mutator method to calculate MPG
    public void calcMPG()
    {
        myMPG = ( myEndMiles - myStartMiles ) / myGallonsUsed;
    }
    
    //getter method to return the value of MPG
    public double getMPG()
    {
        return myMPG;
    }
    
    //mutator method to calculate the cost
    public void calcCost()
    {
        myCost = myPricePerGallon * myGallonsUsed;
    }
    
    //getter method to return the value of the cost
    public double getCost()
    {
        return myCost;
    }
    
    //getter method to return the value of the start miles
    public double getStartMiles()
    {
        return myStartMiles;
    }
    
    //getter method to return the value of the end miles
    public double getEndMiles()
    {
        return myEndMiles;
    }
    
    //getter method to return the value of the gallons used
    public double getGallonsUsed()
    {
        return myGallonsUsed;
    }
    
    //getter method to return the value of the price per gallon
    public double getPricePerGallon()
    {
        return myPricePerGallon;
    }
}    