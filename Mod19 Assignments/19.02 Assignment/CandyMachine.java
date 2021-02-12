/**
 * This program simulates a transaction using exceptions and assertions.
 * 
 * @author Olga Redko
 * @version 04/11/2017
 */
public class CandyMachine
{
    public static void main(String[] args)
    {
        Dispenser dispenser = new Dispenser(100, 50);
        CashRegister cashRegister = new CashRegister(75);
        
        sellProduct(dispenser, cashRegister, 25);
        
        //Checks if IllegalArgumentException works
        /*
        Dispenser errorDispenser = new Dispenser(-1, -1);
        Dispenser errorDispenser2 = new Dispenser(1, -1);
        CashRegister errorCashRegister = new CashRegister(-1);
        
        System.out.println(errorDispenser);
        System.out.println(errorDispenser2);
        System.out.println(errorCashRegister);
        */
    }
    
    public static void sellProduct(Dispenser dispenser, CashRegister cashRegister, int amount)
    {
        for(int i = 0; i < amount; i++)
        {
            dispenser.makeSale();
        }
        cashRegister.acceptAmount(amount * dispenser.getProductCost());
        System.out.println(dispenser.makeSale());
    }
}