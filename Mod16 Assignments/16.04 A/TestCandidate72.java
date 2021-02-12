
/**
 * TestCandidate72 
 * 
 * 
 */
public class TestCandidate72
{
    
    
    public static void printVotes(Candidate2[] e)
    {
        for(int i = 0; i < e.length; i++)
          if (e[i] != null)
             System.out.println(e[i]);
    }
    public static int getTotal(Candidate2[] e)
    {
        int sum = 0;
        for(int i = 0; i <e.length; i++)
          if (e[i] != null)
            sum = sum + e[i].getVotes();
        return sum;
    }
    public static void printResults(Candidate2[] e)
    {
        int total;
        
        total = getTotal(e);
        System.out.println("Candiate\t\tVotes Received\t\t% of Total Votes");
        for(int i = 0; i < e.length; i++)
          if (e[i] != null)
            System.out.println(e[i].getName() + "\t\t" +
                             e[i].getVotes() + "\t\t\t" +
                             ((int)(((double)e[i].getVotes()/(double)total)*100.00 + 0.5)));
        System.out.println();
        System.out.println("Total number of votes in election: " + total);
    
    }
    public static void replaceName(Candidate2[] e, String find, String replace)
    {
        for(int index = 0; index < e.length; index++)
          if ((e[index] != null) && (e[index].getName().equals(find)))
               e[index].setName(replace);
    }
    public static void replaceVotes(Candidate2[] e, String find, int replace)
    {
        for(int index = 0; index < e.length; index++)
          if ((e[index] != null) && (e[index].getName().equals(find)))
               e[index].setVotes(replace);
    }    
    public static void replaceCandidate2(Candidate2[] e, String find, String repN, int repV)
    {
        for(int index = 0; index < e.length; index++)
          if ((e[index] != null) && (e[index].getName().equals(find)))
               {
                   e[index].setName(repN);
                   e[index].setVotes(repV);
               }
    }   
    public static void insertPosition(Candidate2[] e, int loc, String repN, int repV)
    {
       //move items down in the array - last item is lost
       for(int index = e.length - 1; index > loc; index--)
           e[index] = e[index-1];
       
       e[loc] = new Candidate2(repN, repV);
    } 
    public static void insertCandidate2(Candidate2[] e, String find, String repN, int repV)
    {
        int location = 0;
        
        // find location of item you want to insert before
        for(int index = 0; index < e.length; index++)
          if ((e[index] != null) && (e[index].getName().equals(find)))
               {
                   location = index;
                   break;
                }
          else if (e[index] == null)
               {
                   location = index;
                   break;
                }
       //move items down in the array - last item is lost
       for(int index = e.length - 1; index > location; index--)
           e[index] = e[index-1];
       
       e[location] = new Candidate2(repN, repV);
    }    
    public static void deleteByLoc(Candidate2[] e, 
                                    int location) 
    {          
       if ((location > 0) && (location < e.length))
          {
              //move items up in the array -
              for(int index = location; index < e.length -1; index++)
                  e[index] = e[index + 1];
       
              e[e.length-1] = null;
          }
    }
    
    
    public static void deleteByName(Candidate2[] e, 
                                    String find) 
    {
        int location = 0;
        int index;
        
        // find location of item you want to delete
        for(index = 0; index < e.length; index++)
          if ((e[index] != null) && (e[index].getName().equals(find)))
               { 
                   location = index;
                   break;
                }
          else if (e[index] == null)
                {
                    location = -1;
                    break;
                }
          
       if ((index != e.length) && (location >= 0))       
        { //move items up in the array 
          for(index = location; index < e.length -1; index++)
             e[index] = e[index + 1];
       
           e[e.length-1] = null;
        }
    } 

    public static void main(String[] args)
    {
        Candidate2[] election = new Candidate2[10];
    
        election[0] = new Candidate2("John Smith", 5000);
        election[1] = new Candidate2("Mary Miller", 4000);
        election[2] = new Candidate2("Michael Duffy", 6000);
        election[3] = new Candidate2("Tim Robinson", 2500);
        election[4] = new Candidate2("Joe Ashtony", 1800);
        election[5] = new Candidate2("Mickey Jones", 3000);
        election[6] = new Candidate2("Rebecca Morgan", 2000);
        election[7] = new Candidate2("Kathleen Turner", 8000);
        election[8] = new Candidate2("Tory Parker", 500);
        election[9] = new Candidate2("Ashton Davis", 10000); 
        
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