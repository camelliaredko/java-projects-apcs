/**
 * This program counts and lists all the prime numbers from 1 to the user's inputted upper limit.
 * 
 * @author Olga Redko
 * @version 03/09/2017
 */
import java.util.Scanner;
public class PrimeNumberGeneratorTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrimeNumberGenerator prime = new PrimeNumberGenerator(); //object prime is created
        System.out.println("Enter an upper limit for calculating a list of prime numbers.");
        int number = in.nextInt(); //user inputs the upper limit for the list of prime numbers
        prime.setNumber(number); //upper limit is set
        String primeList = prime.generatePrimeNumbers(); //mutator method
        System.out.println("The prime numbers from 1 to " + prime.getNumber() + " include " + primeList); //results are printed
        System.out.println("There are " + prime.primeCounter(primeList) + " prime numbers from 1 to " + prime.getNumber());
    }
}