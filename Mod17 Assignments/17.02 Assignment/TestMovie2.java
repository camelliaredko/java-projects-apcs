/**
 * This program arranges the order of movies using insertion sort.
 * 
 * @author Olga Redko
 * @version 04/08/2017
 */
public class TestMovie2
{
  public static void main(String[] args)
  {
        Movie2[] myMovies = new Movie2[10];
        
        myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters, Inc.", 2001, "Pixar");
       
		System.out.println("Before Sorting: ");
		printList(myMovies);
		System.out.println();
		
		System.out.println("Sorted by Title - ascending:");
		myMovies = sortTitles(myMovies, 1);
		printList(myMovies);
		System.out.println();
		
		System.out.println("Sorted by Year - descending");
		myMovies = sortYears(myMovies, 2);
		printList(myMovies);
		System.out.println();
		
		System.out.println("Sorted by Studio - ascending:");
		myMovies = sortStudios(myMovies, 1);
		printList(myMovies);
		System.out.println();
  }
    
  public static Movie2[] sortTitles(Movie2[] source, int direction)
  {
      Movie2[] dest = new Movie2[source.length];
        for(int i = 0; i < source.length; i++)
      {
        Movie2 next = source[i];
        int insertindex = 0;
        int k = i;
        while( k > 0 && insertindex == 0)
        {
            //ascending
            if(direction == 1 && next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
            {
                insertindex = k;
            }
            //descending
            else if(direction == 2 && next.getTitle().compareTo(dest[k-1].getTitle()) < 0)
            {
                insertindex = k;
            }
            else
            {
                dest[k] = dest[k-1];
            }
            k--;
        }
        dest[ insertindex ] = next;
	  }
	  return dest;
  }
    
    public static Movie2[] sortYears(Movie2[] source, int direction)
    {
      Movie2[] dest = new Movie2[source.length];
        for(int i = 0; i < source.length; i++)
      {
        Movie2 next = source[i];
        int insertindex = 0;
        int k = i;
        while( k > 0 && insertindex == 0)
        {
            //ascending
            if(direction == 1 && next.getYear() > (dest[k-1].getYear()))
            {
                insertindex = k;
            }
            //descending
            else if(direction == 2 && next.getYear() < (dest[k-1].getYear()))
            {
                insertindex = k;
            }
            else
            {
                dest[k] = dest[k-1];
            }
            k--;
        }
        dest[ insertindex ] = next;
	  }
	  return dest;
  }

  public static Movie2[] sortStudios(Movie2[] source, int direction)
  {
      Movie2[] dest = new Movie2[source.length];
        for(int i = 0; i < source.length; i++)
      {
        Movie2 next = source[i];
        int insertindex = 0;
        int k = i;
        while( k > 0 && insertindex == 0)
        {
            //ascending
            if(direction == 1 && next.getStudio().compareTo(dest[k-1].getStudio()) > 0)
            {
                insertindex = k;
            }
            //descending
            else if(direction == 2 && next.getStudio().compareTo(dest[k-1].getStudio()) < 0)
            {
                insertindex = k;
            }
            else
            {
                dest[k] = dest[k-1];
            }
            k--;
        }
        dest[ insertindex ] = next;
	  }
	  return dest;
  }
  
  public static void printList(Movie2[] movies)
  {
      for(Movie2 m : movies)
      {
          System.out.println(m);
      }
  }
}