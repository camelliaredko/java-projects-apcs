
/**
 * This class tests recursive methods
 * 
 * @author Olga Redko
 * @version 02/06/2017
 */

class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    public int fOf(int x)
    {
        if (x <= 20)                        //the base case
        {
            System.out.println(x + " <= 20, therefore f(" + x + ") = -15");
            return -15;
        }
        else
        {
            System.out.println(x + " > 20, therefore f(" + x + ") = f(" + x + " / 2 + 2) - 1 = f(" + (x / 2 + 2) + ") - 1");
            return fOf(x/2 + 2) - 1;
        }
    }    
}
public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x / 2 + 2) - 1    if x >  20");
        System.out.println("f(x) = ");
        System.out.println("       15              if x <= 20");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 100;
        System.out.println("x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();  
    }
}