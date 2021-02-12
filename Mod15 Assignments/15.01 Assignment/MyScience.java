/**
 * This program prints out homework assignments while using an abstract class.
 * 
 * @author Olga Redko
 * @version 03/12/2017
 */
public class MyScience extends Homework
{
	public MyScience()
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
}