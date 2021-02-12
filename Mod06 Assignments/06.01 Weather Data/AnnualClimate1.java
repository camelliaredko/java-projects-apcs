/**
 * Annual Climate description:
 *
 * @author: Olga Redko
 * @version: 10/24/2016
 *
 */

import java.util.Scanner;
class AnnualClimate1
{
   	public static void main (String [ ] args)
	{
		//Declare and intialize variables
		Scanner in = new Scanner(System.in);
		String city = "Tallahassee";
		String state = "FL";
		double averageTemperature = 0; //not sure if this is necessary
		double annualPrecipitation = 0; //not sure if this is necessary

		String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double temperature [] ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7}; 		//initialize with Fahrenheit values
		double precipitation [] ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1}; 	//initialize with inches values

		String tempLabel = "F";   //initialize to F
		String precipLabel = "cm"; //initialize to cm


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555; (°F - 32) x 5/9 = °C

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
			    //code for assigning new C values to the temperature array
			}

		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";


		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();




	}//end main
}//end Annual Climate
