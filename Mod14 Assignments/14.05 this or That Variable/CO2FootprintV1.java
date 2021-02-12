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
    private double gallonsUsed;   //number of gallons used
    private double tonsCO2;       //tons of CO2 emitted
    private double poundsCO2;     //pounds of CO2 emitted
    
    /**
     * Constructor for objects of type CO2FootprintV1
     * @param gals number of gallons used
     */
    CO2FootprintV1(double gallonsUsed)
    {
        this.gallonsUsed = gallonsUsed;
        this.tonsCO2 = 0.0;
        this.poundsCO2 = 0.0;
    }
    
    /**
     * Mutator method to calculate the tons of CO2 emitted (no parameters). 
     */
    public void calcTonsCO2()
    {
        this.tonsCO2 = this.gallonsUsed * 8.78E-3;
    }
    
    /**
     * Getter method to return the value of the tons of CO2 emitted (no parameters).
     * @return the tons of CO2 emitted.
     */
    public double getTonsCO2()
    {
        return this.tonsCO2;
    }
    
    /** 
     * Mutator method to convert the number of tons of CO2 emitted to the number of pounds of CO2 emitted (no parameters).
     */
    public void convertTonsToPoundsCO2()
    {
        this.poundsCO2 = this.tonsCO2 * 2204.62;
    }
    
    /**
     * Getter method to return the value of the pounds of CO2 emitted (no parameters).
     * @return the pounds of CO2 emitted
     */
    public double getPoundsCO2()
    {
        return this.poundsCO2;
    }

}    