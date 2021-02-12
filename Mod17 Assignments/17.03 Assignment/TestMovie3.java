/**
 * This program arranges the order of movies using selection sort.
 * 
 * @author Olga Redko
 * @version 04/08/2017
 */
public class TestMovie3
{
  public static void main(String[] args)
  {
        Movie3[] myMovies = new Movie3[10];
        
        myMovies[0] = new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie3("Monsters, Inc.", 2001, "Pixar");
       
        System.out.println("Before Sorting: ");
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted by Title - descending:");
        myMovies = sortTitles(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted by Year - descending");
        myMovies = sortYears(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        
        System.out.println("Sorted by Studio - ascending:");
        myMovies = sortStudios(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
  }
    
  public static Movie3[] sortTitles(Movie3[] source, int direction)
  {
     int posmax;
     Movie3 temp;

      for (int i = source.length - 1 ; i >= 0 ; i-- )
      {
          posmax = 0;
          for (int k = 0 ; k <= i ; k++ )
          {
              if (direction == 1 && source[ k ].getTitle().compareTo(source[ posmax ].getTitle()) > 0)
              {
                 posmax = k;
              }
              else if (direction == 2 && source[ k ].getTitle().compareTo(source[ posmax ].getTitle()) < 0)
              {
                  posmax = k;
              }
          }
          temp = source[ i ];
          source[ i ] = source[ posmax ];
          source[ posmax ] = temp;
     }
     return source;
  }
  
  public static Movie3[] sortYears(Movie3[] source, int direction)
  {
     int posmax;
     Movie3 temp;

      for (int i = source.length - 1 ; i >= 0 ; i-- )
      {
          posmax = 0;
          for (int k = 0 ; k <= i ; k++ )
          {
              if (direction == 1 && source[ k ].getYear() > source[ posmax ].getYear())
              {
                 posmax = k;
              }
              else if (direction == 2 && source[ k ].getYear() < source[ posmax ].getYear())
              {
                  posmax = k;
              }
          }
          temp = source[ i ];
          source[ i ] = source[ posmax ];
          source[ posmax ] = temp;
     }
     return source;
  }
  
  public static Movie3[] sortStudios(Movie3[] source, int direction)
  {
     int posmax;
     Movie3 temp;

      for (int i = source.length - 1 ; i >= 0 ; i-- )
      {
          posmax = 0;
          for (int k = 0 ; k <= i ; k++ )
          {
              if (direction == 1 && source[ k ].getStudio().compareTo(source[ posmax ].getStudio()) > 0)
              {
                 posmax = k;
              }
              else if (direction == 2 && source[ k ].getStudio().compareTo(source[ posmax ].getStudio()) < 0)
              {
                  posmax = k;
              }
          }
          temp = source[ i ];
          source[ i ] = source[ posmax ];
          source[ posmax ] = temp;
     }
     return source;
  }
  
  public static void printMovies(Movie3[] movies)
  {
      for(Movie3 m : movies)
      {
          System.out.println(m);
      }
  }
}