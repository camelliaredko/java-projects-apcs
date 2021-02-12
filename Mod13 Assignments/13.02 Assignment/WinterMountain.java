/**
 * WinterMountain class extends Mountain.
 * 
 * @author Olga Redko
 * @version 2/19/2017
 */
public class WinterMountain extends Mountain
{
	// instance variables 
	private double temperature;

	/**
	 * Constructor for objects of class wintermountain
	 */
	public WinterMountain(int l, int w, int m, double t)
	{
		super(l, w, m);
	    // initialise instance variables
		temperature = t;
	}
	
	public double getTemperature()
	{
	    return temperature;
	}
}
