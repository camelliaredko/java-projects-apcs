/**
 * To create a program that uses an ArrayList and repeatedly calls to showCenter().
 * 
 * @author Olga Redko
 * @version 2/19/2017
 */
import java.util.ArrayList;
public class TestPoly2
{
    public static void main(String []args)
    {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        
        shapes.add(new Circle2(2, 4, 6));
        shapes.add(new Cylinder2(10, 15, 3, 4));
        shapes.add(new Oval2(25, 10, 4, 7));
        shapes.add(new OvalCylinder2(40, 10, 3, 7, 10));
        
        for (Circle2 c : shapes)
        {
           showCenter(c);
        }
	}
	
	public static void showCenter(Circle2 c)
	{
	    System.out.println("For " + c.toString() + " " + c.center() + "\n");
	}
}