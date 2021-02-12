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
    
    public int fOf1(double x)
    {
        if (x <= 10)                        //the base case
        {
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -7");
            return -7;
        }
        else
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 4) + 2 = f(" + (x - 4) + ") + 2");
            return fOf1(x-4) + 2;
        }
    }    
    public int fOf2(double x)
    {
        if (x <= 25)                        //the base case
        {
            System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
            return 20;
        }
        else
        {
            System.out.println(x + " > 25, therefore ... f(" + x + ") = f(" + x + " / 12 + 5) - 3 = f(" + (x / 12 + 5) + ") - 3");
            return fOf2(x/12+5) - 3;
        }
    }   
    public int fOf3(double x)
    {
        if (x > 20)                        //the base case
        {
            System.out.println(x + " > 20, therefore ... f(" + x + ") = -100");
            return -100;
        }
        else
        {
            System.out.println(x + " <= 20, therefore ... f(" + x + ") = f(" + x + " * 2) - 4 = f(" + (x * 2) + ") - 4");
            return fOf3(x*2) - 4;
        }
    }   
}

public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        double x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x - 4) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -7              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 25;
        System.out.println("Example 1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf1(x));
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("       f(x / 12 + 5) - 3    if x > 25");
        System.out.println("f(x) = ");
        System.out.println("       20              if x <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 30;
        System.out.println("Example 2:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf2(x));
        System.out.println();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x * 2) - 4    if x <=  20");
        System.out.println("f(x) = ");
        System.out.println("       -100              if x > 20");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 500;
        System.out.println("Example 3:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf3(x));
        System.out.println();  
    }
}