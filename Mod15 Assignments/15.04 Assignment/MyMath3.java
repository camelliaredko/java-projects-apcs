/**
 * This program prints out homework information while implementing the Comparable<T> interface.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public class MyMath3 extends Homework3
{
	public MyMath3()
	{
		super();
	}

    public void createAssignment(int p)
    {
        pagesRead = p;
        typeHomework = "Math";
    }

    public String toString()
    {
        return typeHomework + " - must read " + pagesRead + " pages.";
    }
    
    public void doReading()
    {
        pagesRead -= 2;
    }
}