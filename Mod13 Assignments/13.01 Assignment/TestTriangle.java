/**
 * test program for triangle - equilateral - isoscelesright
 * 
 * @author Olga Redko
 * @version 2/18/2017
 */
public class TestTriangle
{
	public static void main (String []args)
	{
	    Triangle triangle = new Triangle(4, 5, 6);
	    Equilateral equilateral = new Equilateral(5);
	    IsoscelesRight isosceles = new IsoscelesRight(1.5);
	    
	    System.out.println("Triangle has sides A = " + triangle.getSideA() + ", B = " + triangle.getSideB() + ", C = " + triangle.getSideC());
	    System.out.println("Equilateral Triangle has sides A = " + equilateral.getSideA() + ", B = " + equilateral.getSideB() + ", C = " + equilateral.getSideC());
	    System.out.println("Isosceles Right Triangle has sides A = " + isosceles.getSideA() + ", B = " + isosceles.getSideB() + ", C = " + isosceles.getSideC());
	}
}
