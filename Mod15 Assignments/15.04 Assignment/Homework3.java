/**
 * This program prints out homework information while implementing the Comparable<T> interface.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public abstract class Homework3 implements Comparable<Homework3>
{
	public int pagesRead;
	public String typeHomework;

	/**
	 * Constructor for objects of class Homework
	 */
	public Homework3()
	{
		// initialize instance variables
		pagesRead = 0;
		typeHomework = "none";
	}
	
    public abstract void createAssignment(int p);
	
	public int getPagesRead()
	{
		return pagesRead;
	}
	
	public void setPagesRead(int pr)
	{
	    pagesRead = pr;
	}
	
	public String getTypeHomework()
	{
		return typeHomework;
	}
	
	public void setTypeHomework(String t)
	{
	    typeHomework = t;
	}
	
	public int compareTo(Homework3 obj)
	{
	    if (pagesRead < obj.pagesRead)
	        return -1;
	    else if (pagesRead == obj.pagesRead)
	        return 0;
	    else
	        return 1;
	}
}
