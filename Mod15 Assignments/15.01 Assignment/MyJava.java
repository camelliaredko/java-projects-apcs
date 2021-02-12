/**
 * This program prints out homework assignments while using an abstract class.
 * 
 * @author Olga Redko
 * @version 03/12/2017
 */
public class MyJava extends Homework
{
	public MyJava()
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
}