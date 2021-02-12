/**
 * This program simulates a mock election using traversal and deletion methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
public class TestCandidate7Version2
{
    public static void main(String[] args)
    {
        Candidate[] election = new Candidate[10];
        
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
        
        System.out.println("Deleted location 6: ");
        election = deleteByLoc(election, 6);
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
        
        System.out.println("Deleted Kathleen Turner: ");
        election = deleteByName(election, "Kathleen Turner");
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
    }
    
    public static void printVotes(Candidate[] list) 
    {
        for(int i = 0; i < list.length; i++)
           System.out.println(list[i]);
    }
    
    public static int getTotal(Candidate[] list)
    {
        int totalVotes = 0;
        for(int i = 0; i < list.length; i++)
        {
            totalVotes += list[i].getNumVotes();
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
    
    public static void insertPosition(Candidate[] list, int insertionPosition, String insertedName, int insertedVotes)
    {
        for(int index = list.length - 1; index > insertionPosition; index--)
        list[index] = list[index - 1];
        
        list[insertionPosition] = new Candidate(insertedName, insertedVotes);
    }
    
    public static void insertCandidate(Candidate[] list, String findName, String insertedName, int insertedVotes)
    {
       int location = 0;
        
       for(int index = 0; index < list.length; index++)
         if (list[index].getName().equals(findName))
              location = index;
               
       for(int index = list.length - 1; index > location; index--)
           list[index] = list[index-1];
       
       list[location] = new Candidate(insertedName, insertedVotes);
    }
    
    public static Candidate[] deleteByLoc(Candidate[] list, int deletedPosition)
    {
        Candidate[] shortenedList = new Candidate[list.length - 1];
        if ((deletedPosition > 0) && (deletedPosition < list.length))
          {
              for(int index = deletedPosition; index < shortenedList.length; index++)
                  shortenedList[index] = list[index + 1];
          }
        return shortenedList;
    }
    
    public static Candidate[] deleteByName(Candidate[] list, String deletedCandidate)
    {
       Candidate[] shortenedList = new Candidate[list.length - 1];
       int location = 0;
        
       for(int index = 0; index < list.length; index++)
          if (list[index].getName().equals(deletedCandidate))
               { 
                   location = index;
                   break;
                }
          
       if ((location > 0) && (location < list.length))
         {
             for(int index = location; index < shortenedList.length; index++)
                 shortenedList[index] = list[index + 1];
         }
       return shortenedList;
    }
    
    public static void printResults(Candidate[] list)
    {
        System.out.printf("%-22s%-25s%-20s\n", "Candidate", "Votes Received", "% of Total Votes");
        for(int i = 0; i < list.length; i++)
        {
            System.out.printf("%-27s%-25d%-25.0f\n", list[i].getName(), list[i].getNumVotes(),((double)list[i].getNumVotes() / getTotal(list) * 100));
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(list));
    }
}