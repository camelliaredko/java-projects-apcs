/**
 * This class tests the AnnualFuelUse class.
 * It displays various information about a car.
 * 
 * @author Olga Redko
 * @version 1/1/2017
 */

public class AnnualFuelUseTester
{   
    public static void main(String[] args)
    {
        //initialization of array of objects
        AnnualFuelUse[] data = {new AnnualFuelUse(56066, 56318, 9, 2.19),
                                new AnnualFuelUse(56318, 56558, 8, 2.29),
                                new AnnualFuelUse(56558, 56770.5, 8.5, 1.98)};
        int[] days = {1, 4, 7};
        
        //call methods
        for(int index = 0; index < data.length; index++)
        {
            data[index].calcDistance();
            data[index].calcMPG();
            data[index].calcCost();
        }
        
        //finding minima and maxima
        double minDistance = Integer.MAX_VALUE, minMPG = Integer.MAX_VALUE, minPricePerGallon = Integer.MAX_VALUE;
        double maxDistance = Integer.MIN_VALUE, maxMPG = Integer.MIN_VALUE, maxPricePerGallon = Integer.MIN_VALUE;
        for(int index = 0; index < data.length; index++)
        {
          //finding minima
          if(data[index].getDistance() < minDistance)
          {
            minDistance = data[index].getDistance();
          }
          if(data[index].getMPG() < minMPG)
          {
            minMPG = data[index].getMPG();
          }
          if(data[index].getPricePerGallon() < minPricePerGallon)
          {
            minPricePerGallon = data[index].getPricePerGallon();
          }
          
          //finding maxima
          if(data[index].getDistance() > maxDistance)
          {
            maxDistance = data[index].getDistance();
          }
          if(data[index].getMPG() > maxMPG)
          {
            maxMPG = data[index].getMPG();
          }
          if(data[index].getPricePerGallon() > maxPricePerGallon)
          {
            maxPricePerGallon = data[index].getPricePerGallon();
          }
        }
        
        //calculating totals
        double totalDistance = 0.0, totalGallonsUsed = 0.0, totalCost = 0.0, totalMPG = 0.0;
        for(int index = 0; index < data.length; index++)
        {
            totalDistance += data[index].getDistance();
            totalGallonsUsed += data[index].getGallonsUsed();
            totalCost += data[index].getCost();
            totalMPG += data[index].getMPG();
        }
        
        //calculating annual projections
        double annualFactor = 365.25 / days[days.length - 1];
        
        double annualDistance = totalDistance * annualFactor;
        double annualGallonsUsed = totalGallonsUsed * annualFactor;
        double annualCost = totalCost * annualFactor;
        double annualMPG = totalMPG / days.length;
        
        //print results
        System.out.printf("%s%9s%18s%15s%15s%15s%10s%12s%11s\n", "Fill Up", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price", "Cost");
        for(int index = 0; index < data.length; index++)
        {
            System.out.printf("%4d%10d%17.0f%17.1f%13.0f%14.1f%15.1f%10.2f%12.2f\n", 
                      (index + 1), days[index], data[index].getStartMiles(), data[index].getEndMiles(), data[index].getDistance(), data[index].getGallonsUsed(), data[index].getMPG(), data[index].getPricePerGallon(), data[index].getCost());
        }
        System.out.println("");
        System.out.printf("%s%53.0f%29.1f%10.2f\n", "Minimum:", minDistance, minMPG, minPricePerGallon);
        System.out.printf("%s%53.0f%29.1f%10.2f\n", "Maximum:", maxDistance, maxMPG, maxPricePerGallon);
        System.out.println("");
        System.out.printf("%s%54.0f%14.1f%37.2f\n", "Totals:", totalDistance, totalGallonsUsed, totalCost);
        System.out.printf("%s%43.0f%14.2f%15.2f%22.2f\n", "Annual Projection:", annualDistance, annualGallonsUsed, annualMPG, annualCost);
    }
}