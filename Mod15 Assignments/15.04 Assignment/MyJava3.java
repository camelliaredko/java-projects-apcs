/**
 * This program prints out homework information while implementing the Comparable<T> interface.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public class MyJava3 extends Homework3
{
	public MyJava3()
	{
		super();
	}

    public void createAssignment(int p)
    {
        pagesRead = p;
        typeHomework = "Java";
    }

    public String toString()
    {
        return typeHomework + " - must read " + pagesRead + " pages.";
    }
    
    public void doReading()
    {
        pagesRead -= 4;
    }
}