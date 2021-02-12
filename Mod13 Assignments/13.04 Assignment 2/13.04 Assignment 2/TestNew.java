/**
 * testNew sample solution
 * 
 * 
 * @version 5/5/2007
 */
public class TestNew
{
 public static void main(String []args)
 {
           Rectangle3 one = new Rectangle3(5, 20);
           Box3 two = new Box3(4, 4, 4);
           Box3 three = new Box3(4, 10, 5);
           Cube3 four = new Cube3(4);
    
       showEffectBoth(one);
       showEffectBoth(two);
          showEffectBoth(three);
          showEffectBoth(four);
          
          if (two.equals(four))
             System.out.println(two + " is same size as " + four);
          else
             System.out.println(two + " is not the same size as " + four);  
          if (three.equals(four))
             System.out.println(three + " is same size as " + four);
          else
             System.out.println(three + " is not the same size as " + four);  
  }
  
  public static void showEffectBoth(Rectangle3 r)
  {
      System.out.println(r);
  }
}