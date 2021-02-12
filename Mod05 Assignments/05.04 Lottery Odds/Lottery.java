/**
 * This program is a game where the user can win by correctly guessing parts of a three-digit lottery number.
 * 
 * @author Olga Redko
 * @version 10/16/2016
 */

import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        String lotteryNumber = "";
        String guess = "";
        
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
        {
            int randomNum = (int)(Math.random()*10);
            lotteryNumber += Integer.toString(randomNum);
        }
        
        System.out.println("Please enter your three numbers (e.g. 123): ");
        guess = in.next();
        
        System.out.println("Winner: " + lotteryNumber);
        
        if(lotteryNumber.equals(guess))
        {
            System.out.println("Congratulations, both pairs matched.");
        }
        else if(lotteryNumber.substring(0, 2).equals(guess.substring(0, 2)))
        {
            System.out.println("Congratulations, the front pair matched.");
        }
        else if(lotteryNumber.substring(1, 3).equals(guess.substring(1, 3)))
        {
            System.out.println("Congratulations, the end pair matched.");
        }
        else
        {
            System.out.println("Sorry, no matches. You only had \none chance out of 100 to win anyway.");
        }
        }
    }