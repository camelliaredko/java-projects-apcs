/**
 * Annual Climate description: The user may choose to view the statistics of annual temperatures and amounts of precipitation of a city in different units.
 *
 * @author: Olga Redko
 * @version: 10/24/2016
 *
 */

import java.util.Scanner;
class AnnualClimate2
{
    public static void main (String [ ] args)
    {
        //Declare and intialize variables
        Scanner in = new Scanner(System.in);
        String city = "Tallahassee";
        String state = "FL";
        double sumTemperature = 0;
        double averageTemperature;
        double annualPrecipitation = 0;

        String month [] ={"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double temperature [] ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};        //initialize with Fahrenheit values
        double precipitation [] ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};  //initialize with inches values

        String tempLabel = "F";   //initialize to F
        String precipLabel = "in."; //initialize to in


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel="(C)";
            for(int index = 0; index < temperature.length; index++)
            {
                temperature[index] = (temperature[index] - 32) * 5 / 9;
            }
        }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("c"))
        {
            precipLabel="(cm)";
            for(int index = 0; index < precipitation.length; index++)
            {
                precipitation[index] *= 2.54;
            }
        }

        System.out.println();
        System.out.println("\t\tClimate Data");
        System.out.println("\tLocation: " + city +", " + state);
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("***************************************************");
        System.out.println();
        
        for(int index = 0; index < 12; index++)
        {
            System.out.printf("%-5s %18.1f %20.1f\n", month[index], temperature[index], precipitation[index]);
        }

        System.out.printf("***************************************************");
        System.out.println();
        
        for(int index = 0; index <= temperature.length - 1; index++)
        {
            sumTemperature += temperature[index];
        }
        averageTemperature = sumTemperature / 12;
        
        for(int index = 0; index <= precipitation.length - 1; index++)
        {
            annualPrecipitation += precipitation[index];
        }
        System.out.printf("           Average: %.1f        Annual: %.1f\n", averageTemperature, annualPrecipitation);        
    }//end main
}//end Annual Climate
