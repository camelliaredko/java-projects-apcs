/**
 * This program uses sequential search to find music based on the title, year, or singer.
 * 
 * @author Olga Redko
 * @version 04/09/2017
 */
public class TestMusic
{
    public static void main(String[] args)
    {
        Music[] myMusic = new Music[10];
        
        myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music("What If It’s You", 1995, "Reba McEntire");
        myMusic[3] = new Music("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
        myMusic[9] = new Music("White Flag", 2004, "Dido");
        
 		System.out.println("Music Library:");
		System.out.println("--------------");
		
		printMusic(myMusic);
		System.out.println();
		
		searchTitle(myMusic, "Let Go");
		System.out.println();
		
		searchTitle(myMusic, "Some Day");
		System.out.println();
		
		searchYear(myMusic, 2001);
		System.out.println();
		
		searchYear(myMusic, 2003);
		System.out.println();
		
		searchSinger(myMusic, "Avril Lavigne");
		System.out.println();
		
		searchSinger(myMusic, "Tony Curtis");
    }
    
    public static void searchTitle(Music[] r, String titleToFind)
    {
	    System.out.println("Search - Title - " + titleToFind);
	    int[] counter = new int[r.length];
        int sum = 0;
        
	    for(int i = 0; i < r.length; i++)
	    {
	       if (r[i].getTitle().compareTo(titleToFind) == 0)
	       {
	           counter[sum] = i;
	           sum++;
	       }
	    }
        if (sum != 0)
        {  // we have found the title
            System.out.println("We found " + titleToFind + " in the library: ");
            for(int j = 0; j < sum; j++)
            {
               System.out.println(r[counter[j]].getTitle() + ", " + r[counter[j]].getYear() + ", " + r[counter[j]].getSinger());
            }
        }
        else
           System.out.println(titleToFind + " is not in the library");
    }
    
    public static void searchYear(Music[] r, int yearToFind)
    {
	   System.out.println("Search - Year - " + yearToFind);
	   System.out.println("Find results: ");
	   int[] counter = new int[r.length];
       int sum = 0;
	    
	   for(int i = 0; i < r.length; i++)
	   {
	       if (r[i].getYear() == yearToFind)
	       {
	           counter[sum] = i;
	           sum++;
	       }
	   }
           if (sum != 0)
           {   // we have found the year
               for(int j = 0; j < sum; j++)
               {
               System.out.println(r[counter[j]].getTitle() + ", " + r[counter[j]].getYear() + ", " + r[counter[j]].getSinger());
               }
               System.out.println("There are " + sum + " listings for " + yearToFind);
           }
           else
              System.out.println("There are no listings for " + yearToFind);
    }
    
    public static void searchSinger(Music[] r, String singerToFind)
    {
	   System.out.println("Search - Singer - " + singerToFind);
	   System.out.println("Find results: ");
	   int[] counter = new int[r.length];
       int sum = 0;
       
	   for(int i = 0; i < r.length; i++)
	   {
	       if (r[i].getSinger().compareTo(singerToFind) == 0)
	       {
	           counter[sum] = i;
	           sum++;
	       }
	   }
           if (sum != 0)
           {   // we have found the singer
               for(int j = 0; j < sum; j++)
               {
                  System.out.println(r[counter[j]].getTitle() + ", " + r[counter[j]].getYear() + ", " + r[counter[j]].getSinger());
               }
               System.out.println("There are " + sum + " listings for " + singerToFind);
           }
           else
              System.out.println("There are no listings for " + singerToFind);
    }
    
    public static void printMusic(Music[] library)
    {
        for(Music music : library)
        {
            System.out.println(music);
        }
    }
}