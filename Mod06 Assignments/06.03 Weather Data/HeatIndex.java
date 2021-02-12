/**
 * Heat Index description: This program neatly displays monthly temperatures, humidity percentages, and heat indices for Key West, Florida.
 *
 * @author: Olga Redko
 * @version: 11/7/2016
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars
    	
        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.print(temperature[n] + "\t");
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.print(humidity[n] + "\t");
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed.
		
		//If the temperature is less than 80 degrees Fahrenheit and 
    	//the humidity is less than 40%, there is no difference between 
    	//actual and apparent temperature.

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0 || humidity[n] >= 40 )
            {
            	t = temperature[n];
            	h = humidity[n];
            	
                hI[n] = -42.379 + 2.04901523 * t + 10.14333127 * h - 0.22475541 * t * h - 6.83783E-3 * t * t - 5.481717E-2 * h * h + 1.22874E-3 * t * t * h + 8.5282E-4 * t * h * h - 1.99E-6 * t * t * h * h;
            }
            else
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(double temp : temperature)
        {
        	tempSum += temp;
        }
        double tempAvg = tempSum/temperature.length;
        
        for(double hum : humidity)
        {
        	humidSum += hum;
        }
        double humidAvg = humidSum/humidity.length;
        
        for(double heatI : hI)
        {
        	hISum += heatI;
        }
        double hIAvg = hISum/hI.length;

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();


        System.out.println("          Months ");
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
        }


        System.out.println("  Avg");
        System.out.println("******************************************************************************************");


        System.out.print("Temp (F)    ");
        for(double temp : temperature)
        {
            System.out.printf("  %3.1f", temp);
        }
        System.out.printf("  %3.1f", tempAvg);
        System.out.println();

        System.out.print("Humidity (%)");
        for(double hum : humidity)
        {
            System.out.printf("  %3.1f", hum);
        }  
        System.out.printf("  %3.1f", humidAvg);
        System.out.println();

        System.out.print("HI (F)      ");
        for(double heatI : hI)
        {
            System.out.printf("  %3.1f", heatI);
        }  
        System.out.printf("  %3.1f", hIAvg);
        System.out.println();
    } //end main()
}//end HeatIndex
