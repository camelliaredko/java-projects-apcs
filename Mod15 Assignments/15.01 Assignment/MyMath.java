/**
 * This program prints out homework assignments while using an abstract class.
 * 
 * @author Olga Redko
 * @version 03/12/2017
 */
public class MyMath extends Homework
{
	public MyMath()
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
}