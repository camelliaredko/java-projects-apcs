/**
 * This program simulates a mock election using traversal and deletion methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
public class TestCandidate7
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
        deleteByLoc(election, 6);
        System.out.println();
        printVotes(election);
        printResults(election);
        System.out.println();
        
        System.out.println("Deleted Kathleen Turner: ");
        deleteByName(election, "Kathleen Turner");
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
          if (list[i] != null)
            totalVotes += list[i].getNumVotes();
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
    
    public static void deleteByLoc(Candidate[] list, int location) 
    {          
       if ((location > 0) && (location < list.length))
          {
              for(int index = location; index < list.length -1; index++)
                  list[index] = list[index + 1];
       
              list[list.length-1] = null;
          }
    }
    
    
    public static void deleteByName(Candidate[] list, String find) 
    {
       int location = 0;
       int index;
        
       for(index = 0; index < list.length; index++)
          if ((list[index] != null) && (list[index].getName().equals(find)))
          { 
             location = index;
             break;
          }
          else if (list[index] == null)
          {
              location = -1;
              break;
          }
          
       if ((index != list.length) && (location >= 0))       
        { 
          for(index = location; index < list.length -1; index++)
             list[index] = list[index + 1];
       
           list[list.length-1] = null;
        }
    } 
    
    public static void printResults(Candidate[] list)
    {
        int total;
        total = getTotal(list);
        System.out.printf("%-22s%-25s%-20s\n", "Candidate", "Votes Received", "% of Total Votes");
        for(int i = 0; i < list.length; i++)
          if (list[i] != null)
          {
              System.out.println(list[i].getName() + "\t\t" + list[i].getNumVotes() + "\t\t\t" + ((int)(((double)list[i].getNumVotes()/(double)total)*100.00 + 0.5)));
          }
        System.out.println();
        System.out.println("Total number of votes in election: " + total);
    }
}