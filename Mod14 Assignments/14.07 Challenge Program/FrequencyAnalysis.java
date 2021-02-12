/**
 * This program calculates and displays the frequency of each letter in a text.
 * 
 * @author Olga Redko
 * @version 03/11/2017
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FrequencyAnalysis
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public static String textReader() throws IOException 
    {
        File fileName = new File("ciphertext.txt");
        Scanner inFile = new Scanner(fileName);
        String text = "";
        
        while(inFile.hasNext())
        {
            text += inFile.next();
        }
        inFile.close();
        return text;
    }

    public static int[] occurrenceCounter(String text)
    {
        int[] letterOccurrence = new int[26];
        for(int i = 0; i < ALPHABET.length(); i++)
        {
            for (int j = 0; j < text.length(); j++)
            {
                if (Character.toString(text.charAt(j)).equals(Character.toString(ALPHABET.charAt(i))))
                {
                    letterOccurrence[i]++;
                }
            }
        }
        return letterOccurrence;
    }

    public static double[] frequencyCounter(int[] occurrence, String text)
    {
        double[] letterFrequency = new double[26];
        for(int i = 0; i < ALPHABET.length(); i++)
        {
            letterFrequency[i] = occurrence[i] / (double)text.length() * 100;
        }
        return letterFrequency;
    }
    
    public static void resultsTable(int[] occurrence, double[] freq) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("ciphertextfreq.txt"));
        System.out.printf("%-10s%-25s%-19s\n", "Letter", "Number of Occurrences", " Percent Frequency");
        outFile.printf("%-10s%-25s%-19s\n", "Letter", "Number of Occurrences", " Percent Frequency");
        outFile.println();
        for(int i = 0; i < ALPHABET.length(); i++)
        {
            System.out.printf("%3s %17d %24.2f\n", Character.toString(ALPHABET.charAt(i)), occurrence[i], freq[i]);
            outFile.printf("%3s %17d %24.2f\n", Character.toString(ALPHABET.charAt(i)), occurrence[i], freq[i]);
            outFile.println();
        }
        outFile.close();
    }
}
