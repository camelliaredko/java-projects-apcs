/**
 * test program for square - box - cube
 * 
 * @author Olga Redko
 * @version 2/18/2017
 */
public class TestCube
{
	public static void main (String []args)
	{
	    Rectangle rectangle = new Rectangle(2, 4);
	    Box box = new Box(4,10,3);
	    Cube cube = new Cube(4);
	    
	    System.out.println("The rectangle's dimensions are " + rectangle.getLength() + " X " + rectangle.getWidth());
	    System.out.println("The box's dimensions are " + box.getLength() + " X " + box.getWidth() + " X " + box.getHeight());
	    System.out.println("The cube's dimensions are " + cube.getHeight() + " X " + cube.getWidth() + " X " + cube.getLength());
	}
}
