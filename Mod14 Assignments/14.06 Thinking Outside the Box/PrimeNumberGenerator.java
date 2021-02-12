/**
 * This program counts and lists all the prime numbers from 1 to the user's inputted upper limit.
 * 
 * @author Olga Redko
 * @version 03/09/2017
 */
class PrimeNumberGenerator
{    
    private int number;

    public void setNumber(int number) 
    {
      this.number = number; //setter method
    }

    public int getNumber()
    {
        return this.number; //getter method
    }
    
    public String generatePrimeNumbers()
    {
        String primeNumberList = ""; //list that will have prime numbers added to it
        
        for(int i = 2; i <= this.number; i++)
        {
            primeNumberList += i + " "; //number is added to the list
            for(int j = 2; j < i / 2; j++) //loops the numbers that will be divided
            {
                if(i % j == 0)
                {
                    primeNumberList = primeNumberList.replace(" " + i + " ", " "); //removes nonprime numbers from the list
                }
            }
        }
        primeNumberList = primeNumberList.replace(" " + 4 + " ", " ");
        
        return primeNumberList; //returns prime number list
    }
    
    public int primeCounter(String list)
    {
        int counter = 0; //counter for how many prime numbers there are
        
        for(int i = 0; i < list.length(); i++)
        {
            if(Character.toString(list.charAt(i)).equals(" "))
            {
                counter++;
            }
        }
        
        return counter; //returns how many prime numbers there are
    }
}