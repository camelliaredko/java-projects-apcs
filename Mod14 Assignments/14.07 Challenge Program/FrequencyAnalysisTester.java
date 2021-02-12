
/**
 * This program calculates and displays the frequency of each letter in a text.
 * 
 * @Olga Redko
 * @03/11/2017
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FrequencyAnalysisTester
{
    public static void main(String[] args) throws IOException
    {
        FrequencyAnalysis analysis = new FrequencyAnalysis();
        String analyzedText = analysis.textReader().toLowerCase();
        int[] occurrences = analysis.occurrenceCounter(analyzedText);
        double[] frequency = analysis.frequencyCounter(occurrences, analyzedText);
        analysis.resultsTable(occurrences, frequency);
    }
}
