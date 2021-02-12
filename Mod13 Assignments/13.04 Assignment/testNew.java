/**
 * testNew
 * 
 * @author Olga Redko
 * @version 2/21/2017
 */
public class testNew
{
	public static void main(String []args)
	{
          Rectangle3 rectangle = new Rectangle3(5, 20);
          Box3 box1 = new Box3(4, 4, 4);
          Box3 box2 = new Box3(4, 10, 5);
          Cube3 cube = new Cube3(4);
	   
	      showEffectBoth(rectangle);
	      showEffectBoth(box1);
	      showEffectBoth(box2);
	      showEffectBoth(cube);
	      
	      if (box1.equals(cube))
	      {
	          System.out.println(box1 + " is the same size as " + cube);
	      }
	      else
	      {
	          System.out.println(box1 + " is not the same size as " + cube);
	      }
	      if (box2.equals(cube))
	      {
	          System.out.println(box2 + " is the same size as " + cube);
	      }
	      else
	      {
	          System.out.println(box2 + " is not the same size as " + cube);
	      }
	 }
	 
	public static void showEffectBoth(Rectangle3 r)
	{
	     System.out.println(r);
	}
}