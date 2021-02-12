/**
 * This program translates English to morse code.
 * 
 * @author Olga Redko
 * @version 3/7/2017
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode
{   
    public static void morseCodeTranslator(String englishText) throws IOException 
    {
        int i = 0;
        String[] morseCharacters = new String[37];
        String englishCharacters = "abcdefghijklmnopqrstuvwxyz1234567890 ";
        
        File fileName = new File("morsecode.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNext())
        {
           morseCharacters[i] = inFile.nextLine();
           i++;
        }
        inFile.close();
        
        String morseLine = "";
        for(int index = 0; index < englishText.length(); index++)
        {
            morseLine += morseCharacters[englishCharacters.indexOf(englishText.substring(index, index + 1))] + " ";
        }
        System.out.println(morseLine);
    }
}