
/**
 * Candidate2
 * 
 *
 */
public class Candidate2
{
 // instance variables 
 private int numVotes;
 private String name;

 /**
  * Constructor for objects of class Candidate2
  */
 public Candidate2(String n, int v)
 {
  // initialise instance variables
  numVotes = v;
  name = n;
 }
 
 public String getName()
 {
     return name;
 }
 
 public int getVotes()
 {
     return numVotes;
 }
 public void setVotes(int n)
 {
     numVotes = n;
 }
 public void setName(String n)
 {
     name = n;
 }
 public String toString() 
 {
     return name + " received " + numVotes + " votes.";
 }
    
 
    
}