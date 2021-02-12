/**
 * This class instantiates shapes objects with three private instance variables.
 * It contains two mutator methods to calculate the number of tons emitted annually by my car 
 * and the number of pounds emitted annually by my car.  There are getter methods for each 
 * private instance variable. Private instance variables include myGallonsUsed, myTonsCO2, 
 * and myPoundsCO2.
 * 
 * @author Olga Redko
 * @version 01/01/2017
 */
class CO2FootprintV1
{
    //declaration of private instance variables
    private double myGallonsUsed;   //number of gallons used
    private double myTonsCO2;       //tons of CO2 emitted
    private double myPoundsCO2;     //pounds of CO2 emitted
    
    /**
     * Constructor for objects of type CO2FootprintV1
     * @param gals number of gallons used
     */
    CO2FootprintV1(double gals)
    {
        myGallonsUsed = gals;
        myTonsCO2 = 0.0;
        myPoundsCO2 = 0.0;
    }
    
    /**
     * Mutator method to calculate the tons of CO2 emitted (no parameters). 
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = myGallonsUsed * 8.78E-3;
    }
    
    /**
     * Getter method to return the value of the tons of CO2 emitted (no parameters).
     * @return the tons of CO2 emitted.
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }
    
    /** 
     * Mutator method to convert the number of tons of CO2 emitted to the number of pounds of CO2 emitted (no parameters).
     */
    public void convertTonsToPoundsCO2()
    {
        myPoundsCO2 = myTonsCO2 * 2204.62;
    }
    
    /**
     * Getter method to return the value of the pounds of CO2 emitted (no parameters).
     * @return the pounds of CO2 emitted
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }

}    