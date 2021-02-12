/**
 * This program calculates the value of pi by simulating throwing darts at a dart board.
 * 
 * @author Olga Redko
 * @version 11/19/2016
 */

import java.util.Scanner;
public class Darts
{
    public static double dartsWithinCircle = 0;
    public static double piEstimate = 0;
    public static double piEstimateSum = 0;
    
    //calculates the number of darts that hit the dart board in one trial
    public static double singleTrial(int darts)
    {
        dartsWithinCircle = 0;
        for(int i = 0; i < darts; i++)
        {
           double x = Math.random();
           double y = Math.random();
           if(Math.pow(x, 2) + Math.pow(y, 2) <= 1)
           {
               dartsWithinCircle++;
           }
        }
        return dartsWithinCircle;
    }
    
    //calculates an approximation of pi
    public static double calculatePi(double h, int n)
    {
        double piApproximation = 4 * h / n;
        return piApproximation;
    }
    
    //main method
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many trials would you like to simulate? ");
        int totalTrials = in.nextInt();
        System.out.print("How many darts would you like to throw in each trial? ");
        int totalDarts = in.nextInt();
        
        for(int i = 0; i < totalTrials; i++)
        {
            double dartsHit = singleTrial(totalDarts);
            double piEstimate = calculatePi(dartsHit, totalDarts);
            System.out.printf("%5s%2d%5s%10.6f\n", "Trial [", (i + 1), "]: pi = ", piEstimate);
            piEstimateSum += piEstimate;
        }
        System.out.printf("%12s%10.6f\n", "Estimate of pi = ", piEstimateSum / totalTrials);
    }
}