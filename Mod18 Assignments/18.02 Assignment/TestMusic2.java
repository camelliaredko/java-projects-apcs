/**
 * This program uses sequential and binary search to find music based on the title, year, or singer.
 * 
 * @author Olga Redko
 * @version 04/09/2017
 */
public class TestMusic2
{
    public static void main(String[] args)
    {
        Music2[] myMusic = new Music2[10];
        
        myMusic[0] = new Music2("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music2("What If It’s You", 1995, "Reba McEntire");
        myMusic[3] = new Music2("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music2("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music2("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music2("Let It Go", 2007, "Tim McGraw");
        myMusic[9] = new Music2("White Flag", 2004, "Dido");
        
        System.out.println("Music2 Library:");
        System.out.println("--------------");
        
        printMusic(myMusic);
        System.out.println();
        
        mergeSortTitles(myMusic, 0, myMusic.length - 1, 1);
        
        searchTitle(myMusic, "Misunderstood");
        System.out.println();
        
        searchTitle(myMusic, "Under Paid");
        System.out.println();
        
        searchYear(myMusic, 2005);
        System.out.println();
        
        searchYear(myMusic, 2006);
        System.out.println();
        
        searchSinger(myMusic, "Darth Maul");
        System.out.println();
        
        searchSinger(myMusic, "Dido");
    }
    
    public static void mergeSortTitles(Music2[] a, int low, int high, int direction)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;
     
        mergeSortTitles(a, low, mid, direction);
        mergeSortTitles(a, mid + 1, high, direction);
      
        mergeTitles(a, low, mid, high, direction);
    }
    public static void mergeTitles(Music2[] a, int low, int mid, int high, int direction)
    {
       Music2[] temp = new Music2[high - low + 1];
       int i = low, j = mid + 1, n = 0;

       while ( i <= mid || j <= high )
       {
         if ( i > mid )
         {
             temp[ n ] = a[ j ];
             j++;
         }
         else if ( j > high )
         {
             temp[ n ] = a[ i ];
             i++;
         }
         else if ( direction == 1 && a[ i ].getTitle().compareTo(a[ j ].getTitle()) < 0 )
         {
             temp[ n ] = a[ i ];
             i++;
         }
         else if ( direction == 2 && a[ i ].getTitle().compareTo(a[ j ].getTitle()) > 0 )
         {
             temp[ n ] = a[ i ];
             i++;
         }
         else
         {
             temp[ n ] = a[ j ];
             j++;
         }
         n++;
       }

       for ( int k = low ; k <= high ; k++ )
         a[ k ] = temp[ k - low ];
    }
    
    public static void searchTitle(Music2[] r, String titleToFind)
    {
        int high = r.length;
        int low = -1;
        int probe;
        
        System.out.println("Search - Title - " + titleToFind);
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(r[probe].getTitle().compareTo(titleToFind) > 0)
               high = probe;
            else
               low = probe;
        }
        if((low >= 0) && (r[low].getTitle().compareTo(titleToFind) == 0))
        {
           System.out.print("Found: ");
           System.out.println(r[low].getTitle() + ", " + r[low].getYear() + ", " + r[low].getSinger());
        }
        else
           System.out.println("Not found.");
    }
    
    public static void searchYear(Music2[] r, int yearToFind)
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
    
    public static void searchSinger(Music2[] r, String singerToFind)
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
    
    public static void printMusic(Music2[] library)
    {
        for(Music2 music : library)
        {
            System.out.println(music);
        }
    }
}