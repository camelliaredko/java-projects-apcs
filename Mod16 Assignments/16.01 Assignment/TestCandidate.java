/**
 * This program simulates a mock election using traversal methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
public class TestCandidate
{
    public static void main(String[] args)
    {
        Candidate[] election = new Candidate[5];
        
        // create election
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);        
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);    
        
        System.out.println("Results per candidate: ");
        System.out.println("______________________________");
        System.out.println();
        printVotes(election);
        printResults(election);
    }
    
    public static void printVotes(Candidate[] list) 
    {
        for(int i = 0; i < list.length; i++)
           System.out.println(list[i]);
    }
    
    public static int getTotal(Candidate[] list)
    {
        int totalVotes = 0;
        for(Candidate candidate : list)
        {
            totalVotes += candidate.getNumVotes();
        }
        return totalVotes;
    }
    
    public static void printResults(Candidate[] list)
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