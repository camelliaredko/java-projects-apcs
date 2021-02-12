/**
 * This program arranges the order of movies using insertion sort.
 * 
 * @author Olga Redko
 * @version 04/08/2017
 */
public class Movie2
{
    private String title;
    private int year;
    private String studio;
    
    public Movie2(String t, int y, String s)
    {
        title = t;
        year = y;
        studio = s;
    }
    
    public String toString()
    {
        return(title + ", " + year + ", " + studio);
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getStudio()
    {
        return studio;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setYear(int y)
    {
        year = y;
    }
    
    public void setStudio(String s)
    {
        studio = s;
    }
}