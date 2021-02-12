/**
 * This program calculates the user's weight on different planets.
 *
 * @author Olga Redko
 * @version 11/20/2016
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetV1
{
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
    public static void printHeading()
    {
        System.out.printf("%40s\n", "My Weight on the Planets");
        System.out.printf("%10s%20s%20s\n", "Planet", "Gravity", "Weight (lbs)");
        System.out.println("--------------------------------------------------");
    }
    
    public static double[] readGravityData()throws IOException 
    {
		int i = 0;
		double[] gravity = new double[9];
		
		File fileName = new File("gravity1.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext())
		{
			gravity[i] = inFile.nextDouble() / 10;
			i++;
		}
		inFile.close();
		gravity[2] = 1;
		return gravity;
    }
    
    public static double[] calcWeight(double earthw, double[] grav)
    {
        double[] planetsWeight = new double[grav.length];
        for(int i = 0; i < grav.length; i++)
        {
            planetsWeight[i] = earthw * grav[i];
        }
        return planetsWeight;
    }

    public static void printResults(String[] plnt, double[] grav, double[] planetw)
    {
        for(int i = 0; i < plnt.length; i++)
        {
            System.out.printf("%10s%20.2f%20.2f\n", plnt[i], grav[i], planetw[i]);
        }
    }
    
    public static void main(String[] args)throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int earthWeight = in.nextInt();        
        printHeading();
        String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] gravity = readGravityData();
        double[] weight = calcWeight(earthWeight, gravity);
        printResults(planet, gravity, weight);
    } //end main
}//end class