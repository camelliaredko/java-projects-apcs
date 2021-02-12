/**
 * This program prints out homework information while implementing the Comparable<T> interface.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public class MyScience3 extends Homework3
{
	public MyScience3()
	{
		super();
	}

    public void createAssignment(int p)
    {
        pagesRead = p;
        typeHomework = "Science";
    }

    public String toString()
    {
        return typeHomework + " - must read " + pagesRead + " pages.";
    }
    
    public void doReading()
    {
        pagesRead -= 3;
    }
}