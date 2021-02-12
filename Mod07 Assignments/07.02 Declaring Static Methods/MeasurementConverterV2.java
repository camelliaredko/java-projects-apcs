/**
 * MeasurementConverterV2_Key converts to and from English and metric units of measurement.
 * 
 * @author Olga Redko
 * @version 11/19/2016
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 1.609344;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km * 0.6213711922;
    } 
    
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double lb)
    {
        return lb * 0.45359237;
    } 
    
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kg)
    {
        return kg * 2.204622622;
    } 
    
    //convert gallons to liters
    public static double convertGallonsToLiters(double gl)
    {
        return gl * 3.785411784;
    }
    
    //convert liters to gallons
    public static double convertLitersToGallons(double li)
    {
        return li * 0.2641720524;
    }
    
    //convert square meters to square feet
    public static double convertSquareMetersToSquareFeet(double sqm)
    {
        return sqm * 10.76391042;
    }
    
    //convert square feet to square meters
    public static double convertSquareFeetToSquareMeters(double sqf)
    {
        return sqf * 0.09290304;
    }
        
    //main method
    public static void main(String[ ] args)
    {
        printPurpose();                                                               //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);                                      //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);                                             //invoke the convertMilesToFeet() static method and pass the feet variable as an argument
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);                          //invoke the convertMilesToKilometers() static method and pass the feet variable as an argument
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);                                 //invoke the convertKilometersToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convertPoundsToKilograms(pounds);                          //invoke the convertPoundsToKilograms() static method and pass the feet variable as an argument
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
        
        kilograms = 98;
        pounds = convertKilogramsToPounds(kilograms);                                 //invoke the convertKilogramsToPounds() static method and pass the feet variable as an argument
        System.out.printf("%8.1f kg. = %7.1f lb. %n", kilograms, pounds);
        
        double gallons = 55;
        double liters = convertGallonsToLiters(gallons);                              //invoke the convertGallonsToLiters() static method and pass the feet variable as an argument
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters);
        
        liters = 2;
        gallons = convertLitersToGallons(liters);                                     //invoke the convertLitersToGallons() static method and pass the feet variable as an argument
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons); 
        
        double squareFeet = 12;
        double squareMeters = convertSquareFeetToSquareMeters(squareFeet);            //invoke the convertSquareFeetToSquareMeters() static method and pass the feet variable as an argument
        System.out.printf("%7.1f sqf. = %7.1f sqm. %n", squareFeet, squareMeters);
        
        squareMeters = 5;
        squareFeet = convertSquareMetersToSquareFeet(squareMeters);                   //invoke the convertSquareMetersToSquareFeet() static method and pass the feet variable as an argument
        System.out.printf("%7.1f sqm. = %7.1f sqf. %n", squareMeters, squareFeet);
    }//end of main method
}//end of class