/**
 * This program simulates a mock election using traversal and replacement methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
import java.util.*;
public class TestCandidate4
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
        election.add(new Candidate("Mickey Jones", 3000));
        election.add(new Candidate("Rebecca Morgan", 2000));        
        election.add(new Candidate("Kathleen Turner", 8000));
        election.add(new Candidate("Tory Parker", 500));
        election.add(new Candidate("Ashton Davis", 10000));  
        
        System.out.println("Original results: ");
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
        
        System.out.println("Changing Michael Duffy to John Elmos: ");
        replaceName(election, "Michael Duffy", "John Elmos");
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
        
        System.out.println("Changing Mickey Jones votes to 2500: ");
        replaceVotes(election, "Mickey Jones", 2500);
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
        
        System.out.println("Replacing Kathleen Turner with John Kennedy: ");
        replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
        System.out.println();
        printVotes(election);
        printResults(election);
    }
    
    public static void printVotes(List<Candidate> list)
    {
        for(int i = 0; i < list.size(); i++)
           System.out.println(list.get(i));
    }
    
    public static int getTotal(List<Candidate> list)
    {
        int totalVotes = 0;
        for(Candidate candidate : list)
        {
            totalVotes += candidate.getNumVotes();
        }
        return totalVotes;
    }
    
    public static void replaceName(List<Candidate> list, String find, String replace)
    {
       for(int index = 0; index < list.size(); index++)
          if (list.get(index).getName().equals(find))
               list.get(index).setName(replace);
    }
    
    public static void replaceVotes(List<Candidate> list, String find, int replace)
    {
       for(int index = 0; index < list.size(); index++)
          if (list.get(index).getName().equals(find))
               list.get(index).setNumVotes(replace);
    }
    
    public static void replaceCandidate(List<Candidate> list, String findName, String replaceName, int replaceNumVotes)
    {
       for(int index = 0; index < list.size(); index++)
       {
          if(list.get(index).getName().equals(findName))
          {
              list.get(index).setName(replaceName);
              list.get(index).setNumVotes(replaceNumVotes);
          }
       }
    }
    
    public static void printResults(List<Candidate> list)
    {
        System.out.printf("%-22s%-25s%-20s\n", "Candidate", "Votes Received", "% of Total Votes");
        for(Candidate candidate : list)
        {
            System.out.printf("%-27s%-25d%-25.0f\n", candidate.getName(), candidate.getNumVotes(),((double)candidate.getNumVotes() / getTotal(list) * 100));
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(list));
    }
}