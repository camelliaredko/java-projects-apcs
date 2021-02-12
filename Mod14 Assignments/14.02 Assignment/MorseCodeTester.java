/**
 * This program translates English to morse code.
 * 
 * @author Olga Redko
 * @version 3/7/2017
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);               
        System.out.print("Enter a line and it will be translated to morse code (no punctuation): ");       
        String englishLine = in.nextLine().toLowerCase();
        
        MorseCode.morseCodeTranslator(englishLine);
    }
}