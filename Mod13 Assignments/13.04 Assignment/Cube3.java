/**
 * Cube3
 * 
 * @author R. Enger, modified by Olga Redko
 * @version 2/21/2017
 */
public class Cube3 extends Box3
{
    /**
     * Constructor for objects of class cube
     */ 
    public Cube3(int s)
    {
        // call superclass
        super(s, s, s);
    }
    
    public String toString()
	{
	    return "Cube - " + super.getLength() + " X " + super.getWidth() + " X " + super.getHeight();
	}
}
