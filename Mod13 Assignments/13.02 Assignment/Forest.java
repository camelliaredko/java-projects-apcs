/**
 * Forest class that extends Terrain
 * 
 * @author Olga Redko
 * @version 2/19/2017
 */
public class Forest extends Terrain
{
	// instance variables 
	private int tree;

	/**
	 * Constructor for objects of class forest
	 */
	public Forest(int l, int w, int t)
	{
		super(l, w);
	    // initialise instance variables
		tree = t;
	}

	public int getTree()
	{
		return tree;
	}
}
