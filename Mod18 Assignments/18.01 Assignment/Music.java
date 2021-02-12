/**
 * This program uses sequential search to find music based on the title, year, or singer.
 * 
 * @author Olga Redko 
 * @version 04/09/2017
 */
public class Music
{
    private String title;
    private int year;
    private String singer;
    
    Music(String title, int year, String singer)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public void setSinger(String singer) 
	{
		this.singer = singer;
	}
	
	public String getTitle() 
	{
		return title;
	}
	public int getYear() 
	{
		return year;
	}
	public String getSinger() 
	{
		return singer;
	}
	
	public String toString()
	{
	    return String.format(title + ", " + year + ", " + singer);
	}
}
