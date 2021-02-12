/**
 * This program searches for contacts using binary and sequential search.
 * 
 * @author Olga Redko
 * @version 04/09/2017
 */
public class TestContact
{
    public static void main(String[] args)
    {
       Contact[] myContacts = new Contact[6];
    
       myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
       myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com");
       myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
       myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
       myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
       myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com");
       
       printContacts(myContacts);
       System.out.println();
       
       mergeSortNames(myContacts, 0, myContacts.length - 1, 1);
       findByName(myContacts, "Johnnie");
       findByName(myContacts, "Sam Parker");
       
       findByRelation(myContacts, "friend");
       findByRelation(myContacts, "aunt");
       
       findByPhone(myContacts, "(333) 555-8989");
       findByPhone(myContacts, "(342) 555-7011");
       
       findByBMonth(myContacts, "May");
       findByBMonth(myContacts, "Mar");
       
       mergeSortEmails(myContacts, 0, myContacts.length - 1, 1);
       findByEmail(myContacts, "rgoodman@hotmail.com");
       findByEmail(myContacts, "susieE@hotmail.com");
    }
  
    public static void mergeSortNames(Contact[] a, int low, int high, int direction)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;
     
        mergeSortNames(a, low, mid, direction);
        mergeSortNames(a, mid + 1, high, direction);
      
        mergeNames(a, low, mid, high, direction);
    }
    public static void mergeNames(Contact[] a, int low, int mid, int high, int direction)
    {
       Contact[] temp = new Contact[high - low + 1];
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
         else if ( direction == 1 && a[ i ].getName().compareTo(a[ j ].getName()) < 0 )
         {
             temp[ n ] = a[ i ];
             i++;
         }
         else if ( direction == 2 && a[ i ].getName().compareTo(a[ j ].getName()) > 0 )
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
  
    public static void findByName(Contact[] r, String nameToFind)
    {
        int high = r.length;
        int low = -1;
        int probe;
        System.out.println("Find Name - " + nameToFind);
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(r[probe].getName().compareTo(nameToFind) > 0)
               high = probe;
            else
               low = probe;
        }
        if((low >= 0) && (r[low].getName().compareTo(nameToFind) == 0))
        {
           System.out.print("Found: ");
           System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", r[low].getName(), r[low].getRelation(), r[low].getBday(), r[low].getPhone(), r[low].getEmail());
           System.out.println();
        }
        else
        {
           System.out.println("Not found.");
           System.out.println();
        }
    }
    
    public static void findByRelation(Contact[] r, String relationToFind)
    {
       System.out.println("Find Relation - " + relationToFind);
       System.out.println("Find results: ");
       int[] counter = new int[r.length];
       int sum = 0;
        
       for(int i = 0; i < r.length; i++)
       {
           if (r[i].getRelation().equals(relationToFind))
           {
               counter[sum] = i;
               sum++;
           }
       }
           if (sum != 0)
           {   // we have found the relation
               for(int j = 0; j < sum; j++)
               {
               System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", r[counter[j]].getName(), r[counter[j]].getRelation(), r[counter[j]].getBday(), r[counter[j]].getPhone(), r[counter[j]].getEmail());
               }
               System.out.println("There are " + sum + " listings for " + relationToFind);
               System.out.println();
           }
           else
           {
              System.out.println("There are no listings for " + relationToFind);
              System.out.println();
           }
    }
    
    public static void findByBMonth(Contact[] r, String monthToFind)
    {
       System.out.println("Find Bday - " + monthToFind);
       System.out.println("Find results: ");
       int[] counter = new int[r.length];
       int sum = 0;
        
       for(int i = 0; i < r.length; i++)
       {
           if (r[i].getBday().substring(0, 3).equals(monthToFind))
           {
               counter[sum] = i;
               sum++;
           }
       }
           if (sum != 0)
           {   // we have found the month
               for(int j = 0; j < sum; j++)
               {
               System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", r[counter[j]].getName(), r[counter[j]].getRelation(), r[counter[j]].getBday(), r[counter[j]].getPhone(), r[counter[j]].getEmail());
               }
               System.out.println("There are " + sum + " listings for " + monthToFind);
               System.out.println();
           }
           else
           {
              System.out.println("There are no listings for " + monthToFind);
              System.out.println();
            }
    }
    
    public static void findByPhone(Contact[] r, String phoneToFind)
    {
       System.out.println("Find Phone - " + phoneToFind);
       System.out.println("Find results: ");
       int[] counter = new int[r.length];
       int sum = 0;
        
       for(int i = 0; i < r.length; i++)
       {
           if (r[i].getPhone().equals(phoneToFind))
           {
               counter[sum] = i;
               sum++;
           }
       }
           if (sum != 0)
           {   // we have found the phone
               for(int j = 0; j < sum; j++)
               {
               System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", r[counter[j]].getName(), r[counter[j]].getRelation(), r[counter[j]].getBday(), r[counter[j]].getPhone(), r[counter[j]].getEmail());
               }
               System.out.println("There are " + sum + " listings for " + phoneToFind);
               System.out.println();
           }
           else
           {
              System.out.println("There are no listings for " + phoneToFind);
              System.out.println();
           }
    }
    
     public static void mergeSortEmails(Contact[] a, int low, int high, int direction)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;
     
        mergeSortEmails(a, low, mid, direction);
        mergeSortEmails(a, mid + 1, high, direction);
      
        mergeEmails(a, low, mid, high, direction);
    }
    public static void mergeEmails(Contact[] a, int low, int mid, int high, int direction)
    {
       Contact[] temp = new Contact[high - low + 1];
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
         else if ( direction == 1 && a[ i ].getEmail().compareTo(a[ j ].getEmail()) < 0 )
         {
             temp[ n ] = a[ i ];
             i++;
         }
         else if ( direction == 2 && a[ i ].getEmail().compareTo(a[ j ].getEmail()) > 0 )
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
    
    public static void findByEmail(Contact[] r, String emailToFind)
    {
        System.out.println("Find Email - " + emailToFind);
        int high = r.length;
        int low = -1;
        int probe;
        
        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(r[probe].getEmail().compareTo(emailToFind) > 0)
               high = probe;
            else
               low = probe;
        }
        if((low >= 0) && (r[low].getEmail().compareTo(emailToFind) == 0))
        {
           System.out.print("Found: ");
           System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", r[low].getName(), r[low].getRelation(), r[low].getBday(), r[low].getPhone(), r[low].getEmail());
           System.out.println();
        }
        else
        {
           System.out.println("Not found.");
           System.out.println();
        }
    }
    
    public static void printContacts(Contact[] contacts)
    {
      System.out.println("\t\t\t\tContact List");
      System.out.println();
      System.out.println();
      System.out.printf("%-15s %-14s %-14s %-18s %-15s\n", "Name", "Relation", "Birthday", "Phone", "Email");
      System.out.println("-------------------------------------------------------------------------------------");
      for (Contact c : contacts)
      {
          System.out.println(c);
      }
    }
}
