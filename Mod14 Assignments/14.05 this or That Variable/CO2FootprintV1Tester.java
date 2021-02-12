/**
 * This class tests the CO2FootprintV1 class. 
 * The calcTonsCO2(), convertTonsToPoundsCO2(),getTonsCO2(), and getPoundsCO2() methods are called.
 * 
 * @author Olga Redko
 * @version 01/01/2017
 */

public class CO2FootprintV1Tester
{   
    public static void main(String[] args)
    {
        //declaration and initialization of variables
        double gallonsUsed = 1330.55, tonsCO2, poundsCO2;
        
        //create object
        CO2FootprintV1 footprint = new CO2FootprintV1(gallonsUsed);
        
        //call methods
        footprint.calcTonsCO2();
        footprint.convertTonsToPoundsCO2();
        tonsCO2 = footprint.getTonsCO2();
        poundsCO2 = footprint.getPoundsCO2();
        
        //print results
        System.out.println("\t    CO2 Emissions");
        System.out.println("Gallons\t\tPounds\t\tTons");
        System.out.println("of Gas\t       from Gas\t       from Gas");
        System.out.println("***************************************");
        System.out.printf("%6.1f%17.2f%15.3f\n", gallonsUsed, poundsCO2, tonsCO2);
    }
}