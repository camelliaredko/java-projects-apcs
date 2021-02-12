/**
 * Mountain class extends Terrain.
 * 
 * @author Olga Redko 
 * @version 2/19/2017
 */
public class Mountain extends Terrain
{
	// instance variables 
	private int mountain;

	/**
	 * Constructor for objects of class mountain
	 */
	public Mountain(int l, int w, int m)
	{
		super(l, w);
	    // initialise instance variables
		mountain = m;
	}


	public int getMountain()
	{
		return mountain;
	}
}