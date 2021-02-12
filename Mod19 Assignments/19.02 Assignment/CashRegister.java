/**
 * This program simulates a transaction using exceptions and assertions.
 * 
 * @author Olga Redko
 * @version 04/11/2017
 */
public class CashRegister
{
    private int cashOnHand;
    
    CashRegister()
    {
        cashOnHand = 500;
    }
    
    CashRegister(int cashOnHand)
    {
        this.cashOnHand = cashOnHand;
        if(cashOnHand <= 0)
        {
            throw new IllegalArgumentException("The cash value must be positive.");
        }
    }
    
    public void acceptAmount(int addedAmount)
    {
        if(addedAmount < 0)
        {
            throw new IllegalArgumentException("The added amount must be nonnegative.");
        }
        cashOnHand += addedAmount;
    }
}