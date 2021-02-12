/**
 * This program prints out homework information while using an abstract and interface class.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public abstract class Homework2 implements Processing
{
	public int pagesRead;
	public String typeHomework;

	/**
	 * Constructor for objects of class Homework
	 */
	public Homework2()
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
}
