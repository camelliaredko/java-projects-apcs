/**
 * This program simulates a mock election using traversal and insertion methods.
 * 
 * @author Olga Redko
 * @version 03/18/2017
 */
public class Candidate
{
    private String name;
    private int numVotes;
    
    public Candidate(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getNumVotes()
    {
        return this.numVotes;
    }
    
    public void setNumVotes(int numVotes)
    {
        this.numVotes = numVotes;
    }
    
    public String toString()
    {
        return(this.name + " received " + this.numVotes + " votes.");
    }
}
