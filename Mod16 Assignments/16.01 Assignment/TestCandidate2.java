/**
 * This program simulates a mock election using traversal methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
import java.util.*;
public class TestCandidate2
{
    public static void main(String[] args)
    {
        List<Candidate> election = new ArrayList<Candidate>();
        
        // create election
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));        
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));   
        
        System.out.println("Results per candidate: ");
        System.out.println("______________________________");
        System.out.println();
        printVotes(election);
        printResults(election);
    }
    
    public static void printVotes(List<Candidate> List)
    {
        for(int i = 0; i < List.size(); i++)
           System.out.println(List.get(i));
    }
    
    public static int getTotal(List<Candidate> List)
    {
        int totalVotes = 0;
        for(Candidate candidate : List)
        {
            totalVotes += candidate.getNumVotes();
        }
        return totalVotes;
    }
    
    public static void printResults(List<Candidate> List)
    {
        System.out.printf("%-22s%-25s%-20s\n", "Candidate", "Votes Received", "% of Total Votes");
        for(Candidate candidate : List)
        {
            System.out.printf("%-27s%-25d%-25.0f\n", candidate.getName(), candidate.getNumVotes(),((double)candidate.getNumVotes() / getTotal(List) * 100));
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(List));
    }
}