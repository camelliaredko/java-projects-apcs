/**
 * This program simulates a mock election using traversal and replacement methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
public class TestCandidate3
{
    public static void main(String[] args)
    {
        Candidate[] election = new Candidate[10];
        
        // create election
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);        
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);    
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);        
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000);    
        
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
    
    public static void replaceName(Candidate[] list, String find, String replace)
    {
       for(int index = 0; index < list.length; index++)
          if (list[index].getName().equals(find))
               list[index].setName(replace);
    }
    
    public static void replaceVotes(Candidate[] list, String find, int replace)
    {
       for(int index = 0; index < list.length; index++)
          if (list[index].getName().equals(find))
               list[index].setNumVotes(replace);
    }
    
    public static void replaceCandidate(Candidate[] list, String findName, String replaceName, int replaceNumVotes)
    {
       for(int index = 0; index < list.length; index++)
       {
          if (list[index].getName().equals(findName))
          {
               list[index].setName(replaceName);
               list[index].setNumVotes(replaceNumVotes);
          }
       }
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