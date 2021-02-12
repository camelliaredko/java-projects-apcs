/**
 * This program simulates a transaction using exceptions and assertions.
 * 
 * @author Olga Redko
 * @version 04/11/2017
 */
public class Dispenser
{
    private int numberOfItems;
    private int cost;
    
    Dispenser()
    {
        this.numberOfItems = 50;
        this.cost = 50;
    }
    
    Dispenser(int numberOfItems, int cost)
    {
        this.numberOfItems = numberOfItems;
        if(numberOfItems < 0)
        {
            throw new IllegalArgumentException("The number of items must be nonnegative.");
        }
        
        this.cost = cost;
        if (cost < 0)
        {
            throw new IllegalArgumentException("The cost must be nonnegative.");
        }
        
        this.cost = cost;
    }
    
    public int getCount()
    {
        return numberOfItems;
    }
    public int getProductCost()
    {
        return cost;
    }
    
    public String makeSale()
    {
        String displayMessage = "";
        this.numberOfItems--;
        if(numberOfItems < -1)
        {
            displayMessage = "There isn't a sufficient amount of the product.";
            return displayMessage;
        }
        else
        {
            displayMessage = "Collect your item at the bottom and enjoy.";
            return displayMessage;
        }
    }
}