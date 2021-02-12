/**
 * Hurricane description: This program calculates the average category, pressure, and wind speed of all Atlantic Hurricanes which have occurred from 1980 - 2006, and it tallies the number of storms in each category.
 *
 * @author: Olga Redko
 * @version: 11/12/2016
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
        //declare and initialize variables
        int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        int [] speed = new int[arrayLength];
        String [] name = new String[arrayLength];
        
        int cat1Sum = 0;
        int cat2Sum = 0;
        int cat3Sum = 0;
        int cat4Sum = 0;
        int cat5Sum = 0;

        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNextDouble())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            speed[index] = inFile.nextInt();
            name [index] = inFile.next();
            index++;
        }
        inFile.close();

        //PROCESSING - calculate and convert values
        // convert windspeed from knots to MPH
        int [] speedmph = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++)
        {
            speedmph [i] = (int) (speed[i] * 1.150779);
        }
        
        // determine category
        // count number of each category
        int [] category = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++)
        {
            if( speedmph[i] <= 95 )
            {
                category [i] = 1;
                cat1Sum++;
            }
            else if( speedmph[i] <= 110 )
            {
                category [i] = 2;
                cat2Sum++;
            }
            else if( speedmph[i] <= 129 )
            {
                category [i] = 3;
                cat3Sum++;
            }
            else if( speedmph[i] <= 156 )
            {
                category [i] = 4;
                cat4Sum++;
            }
            else
            {
                category [i] = 5;
                cat5Sum++;
            }
        }
        
        //Find min, max and average for category, windspeed and pressure
        double categorySum = 0;
        double speedmphSum = 0;
        double pressureSum = 0;
        
        int categoryAverage;
        int speedmphAverage;
        int pressureAverage;
        for(int i = 0; i < arrayLength; i++)
        {
            categorySum += category [i];
            speedmphSum += speedmph [i];
            pressureSum += pressure [i];
        }
        categoryAverage = (int) (categorySum / arrayLength);
        speedmphAverage = (int) (speedmphSum / arrayLength);
        pressureAverage = (int) (pressureSum / arrayLength);
        
        Integer categoryMin = Integer.MAX_VALUE;
        Integer speedmphMin = Integer.MAX_VALUE;
        Integer pressureMin = Integer.MAX_VALUE;
        
        Integer categoryMax = Integer.MIN_VALUE;
        Integer speedmphMax = Integer.MIN_VALUE;
        Integer pressureMax = Integer.MIN_VALUE;
        for(int i = 0; i < arrayLength; i ++)
        {
            if (category[i] < categoryMin)
                categoryMin = category[i];
            if (speedmph[i] < speedmphMin)
                speedmphMin = speedmph[i];
            if (pressure[i] < pressureMin)
                pressureMin = pressure[i];            
            if (category[i] > categoryMax)
                categoryMax = category[i];
            if (speedmph[i] > speedmphMax)
                speedmphMax = speedmph[i];
            if (pressure[i] > pressureMax)
                pressureMax = pressure[i];
        }
        
        //Output - print table using printf to format the columns
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        outFile.println("                      Hurricanes 1980 - 2006");
        outFile.println();
        outFile.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        outFile.println("=====================================================================");
        for (int i = 0; i < arrayLength; i++)
        {
            outFile.printf("%d%12s%11d%16d%17d\n", year[i], name[i], category[i], pressure[i], speedmph[i]);
            outFile.println("");
        }
        outFile.println("=====================================================================");
        outFile.printf("%s%20d%16d%17d\n", "Average", categoryAverage, pressureAverage, speedmphAverage);
        outFile.println("");
        outFile.printf("%s%20d%16d%17d\n", "Maximum", categoryMax, pressureMax, speedmphMax);
        outFile.println("");
        outFile.printf("%s%20d%16d%17d\n", "Minimum", categoryMin, pressureMin, speedmphMin);
        outFile.println("");
        outFile.println("");
        outFile.printf("%s%2d\n", "Number of Category 1: ", cat1Sum);
        outFile.println("");
        outFile.printf("%s%2d\n", "Number of Category 2: ", cat2Sum);
        outFile.println("");
        outFile.printf("%s%2d\n", "Number of Category 3: ", cat3Sum);
        outFile.println("");
        outFile.printf("%s%2d\n", "Number of Category 4: ", cat4Sum);
        outFile.println("");
        outFile.printf("%s%2d\n", "Number of Category 5: ", cat5Sum);
		outFile.close();

        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for (int i = 0; i < arrayLength; i++)
        {
            System.out.printf("%d%12s%11d%16d%17d\n", year[i], name[i], category[i], pressure[i], speedmph[i]);
        }
        System.out.println("=====================================================================");
        System.out.printf("%s%20d%16d%17d\n", "Average", categoryAverage, pressureAverage, speedmphAverage);
        System.out.printf("%s%20d%16d%17d\n", "Maximum", categoryMax, pressureMax, speedmphMax);
        System.out.printf("%s%20d%16d%17d\n", "Minimum", categoryMin, pressureMin, speedmphMin);
        System.out.println("");
        System.out.printf("%s%2d\n", "Number of Category 1: ", cat1Sum);
        System.out.printf("%s%2d\n", "Number of Category 2: ", cat2Sum);
        System.out.printf("%s%2d\n", "Number of Category 3: ", cat3Sum);
        System.out.printf("%s%2d\n", "Number of Category 4: ", cat4Sum);
        System.out.printf("%s%2d\n", "Number of Category 5: ", cat5Sum);
        }
    }//end main()
//end Hurricanes2
