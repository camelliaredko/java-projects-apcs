/**
 * This program calculates the Fibonacci number for values that the user inputs.
 * 
 * @author Olga Redko
 * @version 02/11/2017
 */

import java.util.Scanner;
class FibonacciNumbers
{   
    public int fibonacci(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (n == 0)
        {
            return 0;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public void userInterface()
    {
        int value;
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(input.equalsIgnoreCase("q"))
        {
            System.out.println("Thank you for using this program.");
        }
        else
        {
            value = Integer.parseInt(input);
            if(value < 0)
            {
                System.out.println("That's not a whole number! Please enter a whole number or enter \"q\" to quit.");
                userInterface();
            }
            else
            {
                System.out.println("The Fibonacci number for " + value + " is " + fibonacci(value));
                System.out.println("Please enter another whole number or enter \"q\" to quit.");
                userInterface();
            }
        }
    }
    
    public static void main(String[] args)
    {
        FibonacciNumbers calcFibonacci = new FibonacciNumbers();
        System.out.println("Enter a whole number whose Fibonacci number you would like to know. \nEnter \"q\" to quit.");
        calcFibonacci.userInterface();
    }
}