/**
 * This program simulates a mock election using traversal and deletion methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
import java.util.*;
public class TestCandidate8
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
        printResults(election);
        System.out.println();
        
        System.out.println("Deleted location 6: ");
        System.out.println();
        deleteByLoc(election, 6);
        printResults(election);
        System.out.println();
        
        System.out.println("Deleted Kathleen Turner: ");
        deleteByName(election, "Kathleen Turner");
        printResults(election);
        System.out.println();
        System.out.println();
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
    
    public static void replaceCandidate(List<Candidate> list, String findName, String replaceName, int replaceQuiz1, int replaceQuiz2, int replaceQuiz3, int replaceQuiz4, int replaceQuiz5)
    {
       for(int index = 0; index < list.size(); index++)
       {
          if(list.get(index).getName().equals(findName))
          {
              list.get(index).setName(replaceName);
              list.get(index).setNumVotes(replaceQuiz1);
              list.get(index).setNumVotes(replaceQuiz2);
              list.get(index).setNumVotes(replaceQuiz3);
              list.get(index).setNumVotes(replaceQuiz4);
              list.get(index).setNumVotes(replaceQuiz5);
          }
       }
    }
    
    public static void insertPosition(List<Candidate> list, int insertionPosition, String insertedName, int insertedVotes)
    {
        list.add(insertionPosition, new Candidate(insertedName, insertedVotes));
    }
    
    public static void insertCandidate(List<Candidate> list, String findName, String insertedName, int insertedVotes)
    {
       int location = 0;
        
       for(int index = 0; index < list.size(); index++)
         if (list.get(index).getName().equals(findName))
              location = index;
       
       list.add(location, new Candidate(insertedName, insertedVotes));
    }
    
    public static void deleteByLoc(List<Candidate> list, int location) 
    {          
       list.remove(location);
    }
    
    public static void deleteByName(List<Candidate> list, String find) 
    {
       int location = 0;
       int index;
        
        // find location of item you want to delete
       for(index = 0; index < list.size(); index++)
          if (list.get(index).getName().equals(find))
               {
                   location = index;
                   break;
                }
               
       // delet  item from ArrayList
       if (index != list.size())
         list.remove(location);
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