import java.util.*;
/**
 * TestCandidate82 
 * 
  */
public class TestCandidate82
{
    
    public static void printVotes(ArrayList<Candidate2> e)
    {
        for(int i = 0; i < e.size(); i++)
          System.out.println(e.get(i));
    }
    public static int getTotal(ArrayList<Candidate2> e)
    {
        int sum = 0;
        for(int i = 0; i <e.size(); i++)
           sum = sum + e.get(i).getVotes();
        return sum;
    }
    public static void printResults(ArrayList<Candidate2> e)
    {
        int total;
        
        total = getTotal(e);
        System.out.println("Candiate\t\tVotes Received\t\t% of Total Votes");
        for(int i = 0; i < e.size(); i++)
          System.out.println(e.get(i).getName() + "\t\t" +
                             e.get(i).getVotes() + "\t\t\t" +
                             ((int)(((double)e.get(i).getVotes()/(double)total)*100.00 + 0.5)));
        System.out.println();
        System.out.println("Total number of votes in election: " + total);
    
    }
    public static void replaceName(ArrayList<Candidate2> e, String find, String replace)
    {
        for(int index = 0; index < e.size(); index++)
          if (e.get(index).getName().equals(find))
               e.get(index).setName(replace);
    }
    public static void replaceVotes(ArrayList<Candidate2> e, String find, int replace)
    {
        for(int index = 0; index < e.size(); index++)
          if (e.get(index).getName().equals(find))
               e.get(index).setVotes(replace);
    }    
    public static void replaceCandidate2(ArrayList<Candidate2> e, String find, String repN, int repV)
    {
        for(int index = 0; index < e.size(); index++)
          if (e.get(index).getName().equals(find))
               {
                   e.get(index).setName(repN);
                   e.get(index).setVotes(repV);
               }
    }   
    public static void insertPosition(ArrayList<Candidate2> e, int loc, String repN, int repV)
    {
       //move items down in the array - last item is lost
       // insert item into ArrayList
       e.add(loc, new Candidate2(repN, repV));
    } 
    public static void insertCandidate2(ArrayList<Candidate2> e, String find, String repN, int repV)
    {
        int location = 0;
        
        // find location of item you want to insert before
        for(int index = 0; index < e.size(); index++)
          if (e.get(index).getName().equals(find))
               location = index;
               
       // insert item into ArrayList
       e.add(location, new Candidate2(repN, repV));
    } 
    public static void deleteByLoc(ArrayList<Candidate2> e, 
                                    int location) 
    {          
       // delete item from ArrayList
       e.remove(location);
    }
    
    
    public static void deleteByName(ArrayList<Candidate2> e, 
                                    String find) 
    {
        int location = 0;
        int index;
        
        // find location of item you want to delete
        for(index = 0; index < e.size(); index++)
          if (e.get(index).getName().equals(find))
               {
                   location = index;
                   break;
                }
               
       // delet  item from ArrayList
       if (index != e.size())
         e.remove(location);
    }          

    public static void main(String[] args)
    {
        ArrayList<Candidate2> election = new ArrayList<Candidate2>();
    
        election.add( new Candidate2("John Smith", 5000));
        election.add( new Candidate2("Mary Miller", 4000));
        election.add( new Candidate2("Michael Duffy", 6000));
        election.add( new Candidate2("Tim Robinson", 2500));
        election.add( new Candidate2("Joe Ashtony", 1800));
        election.add( new Candidate2("Mickey Jones", 3000));
        election.add( new Candidate2("Rebecca Morgan", 2000));
        election.add( new Candidate2("Kathleen Turner", 8000));
        election.add( new Candidate2("Tory Parker", 500));
        election.add( new Candidate2("Ashton Davis", 10000));        
        
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
    
}