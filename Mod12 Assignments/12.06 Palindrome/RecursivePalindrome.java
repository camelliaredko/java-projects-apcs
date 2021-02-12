/**
 * This class determines whether or not an inputted word is a palindrome.
 * 
 * @author Olga Redko
 * @version 02/11/2017
 */
import java.util.Scanner;
public class RecursivePalindrome 
{
	private String reverse(String word) 
	{
		if ( word.length() == 0 )
			return "";

		String firstChar = word.substring( 0, 1 );
		
		firstChar = helperFunction(firstChar);
		
		String reverseRest = reverse( word.substring( 1 ) );

		String result = reverseRest + firstChar;
		
		return result;
	}
	
	private String helperFunction(String character)
	{
	    character = character.replace(" ", "");
        character = character.replace(".", "");
        character = character.replace(",", "");
        character = character.replace("!", "");
        character = character.toLowerCase();
        		
		return character;
	}
	
	public String simplifyPhrase(String phrase)
	{
	    phrase = phrase.replace(" ", "");
        phrase = phrase.replace(".", "");
        phrase = phrase.replace(",", "");
        phrase = phrase.replace("!", "");
        phrase = phrase.toLowerCase();
        		
		return phrase;
	}
	
	public String determinePalindrome(String word)
	{
	    String reversedWord = reverse(word);
	    if(reversedWord.equals(word))
	    {
	        return "";
	    }
	    else
	    {
	        return "not ";
	    }
	}
	
	public void userInterface()
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String simplifyInput = simplifyPhrase(input);
        
        if(input.equalsIgnoreCase("q"))
        {
            System.out.println("Thank you for using this program.");
        }
        else
        {
            System.out.println(input + " is " + determinePalindrome(simplifyInput) + "a palindrome!");
            System.out.println("Please enter another phrase or enter \"q\" to quit.");
            userInterface();
         }
    }
}