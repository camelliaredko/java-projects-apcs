/**
 * Triangle class
 * 
 * @author Olga Redko
 * @version 2/18/2017
 */
public class Triangle
{
	// instance variables 
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * Constructor for objects of class triangle
	 */
	public Triangle(double a, double b, double c)
	{
		// initialise instance variables
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public double getSideA()
	{
		return sideA;
	}
	public double getSideB()
	{
	    return sideB;
	}
	public double getSideC()
	{
	    return sideC;
	}
}
