/**
 * This program prints out homework information while using an abstract and interface class.
 * 
 * @Olga Redko
 * @03/12/2017
 */
public class MyEnglish2 extends Homework2
{
	public MyEnglish2()
	{
		super();
	}

    public void createAssignment(int p)
    {
        pagesRead = p;
        typeHomework = "English";
    }

    public String toString()
    {
        return typeHomework + " - must read " + pagesRead + " pages.";
    }
    
    public void doReading()
    {
        pagesRead -= 1;
    }
}