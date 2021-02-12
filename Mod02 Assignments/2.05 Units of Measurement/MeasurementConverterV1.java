/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Olga Redko
 * Date: 9/16/2016
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                                        // distance in miles
        double feet;                                         // distance in feet
        double kilometers;                                   // distance in kilometers
        double kilograms;                                    // mass in kilograms
        double pounds;                                       // mass in pounds
        double liters;                                       // volume in liters
        double gallons;                                      // volume in gallons
        double millimetersofmercury;                         // pressure in millimeters of mercury
        double atmospheres;                                  // pressure in atmospheres
        
        double feetPerMile = 5280;                           //number of feet per 1 mile
        double kilometersPerMile = 1.60934;                  //number of kilometers per 1 mile
        double kilogramsPerPound = 0.453592;                 //number of kilograms per 1 pound
        double litersPerGallon = 3.78541;                    //number of liters per 1 gallon
        double millimetersofmercuryPerAtmosphere = 760;      //number of millimeters of mercury per 1 atmosphere
        
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable
        System.out.println("******************************");
        System.out.println("This program converts between");
        System.out.println("selected units of measurement");
        System.out.println("******************************");
        

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        //convert miles to feet
        miles = 23.4;
        feet = feetPerMile * miles;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 123;
        kilometers = kilometersPerMile * miles;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        
        //convert kilometers to miles
        kilometers = 104;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        
        //convert pounds to kilograms
        pounds = 234;
        kilograms = kilogramsPerPound * pounds;
        System.out.println(pounds + " lb. = " + kilograms + " kg.");
        
        //convert kilograms to pounds
        kilograms = 342;
        pounds = kilograms / kilogramsPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");
        
        //convert gallons to liters
        gallons = 842;
        liters = litersPerGallon * gallons;
        System.out.println(gallons + " gal. = " + liters + " L.");
        
        //convert liters to gallons
        liters = 967;
        gallons = liters / litersPerGallon;
        System.out.println(liters + " L. = " + gallons + " gal.");
        
        //convert millimeters of mercury to atmospheres
        millimetersofmercury = 9284;
        atmospheres =  millimetersofmercury / millimetersofmercuryPerAtmosphere;
        System.out.println(millimetersofmercury + " mmHg = " + atmospheres + " atm.");
        
        //convert atmospheres to millimeters of mercury
        atmospheres = 2.5;
        millimetersofmercury = millimetersofmercuryPerAtmosphere * atmospheres;
        System.out.println(atmospheres + " atm = " + millimetersofmercury + " mmHg.");

    }//end of main method
}//end of class

