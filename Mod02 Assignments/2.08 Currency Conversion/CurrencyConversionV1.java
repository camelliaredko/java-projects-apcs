/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * 
 * Modified by: Olga Redko
 * Date: 09/17/2016
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {   
        // starting number of US dollars
        double startingUsDollars = 5000.00;                                           // local variable for US Dollars
        
        // money spent
        double pesosSpent = 7210.25;                                                  // local variable for Mexican pesos spent
        double yenSpent = 99939.75;                                                   // local variable for Japanese yen spent
        double eurosSpent = 624.95;                                                   // local variable for European euros spent
        
        // exchange rates
        double pesoExchangeRate = 19.57852;                                           // local variable for exchange rate of US Dollars to pesos
        double yenExchangeRate = 102.0731;                                            // local variable for exchange rate of US Dollars to yen
        double euroExchangeRate = 0.892963;                                           // local variable for exchange rate of US Dollar to euros

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        // starting US dollars
        System.out.println("Starting US dollars:        " + startingUsDollars);

        // US dollars spent in Mexico
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        System.out.println("US dollars spent in Mexico: " + dollarsSpentInMexico);

        // conversion for Japanese yen
        double dollarsSpentInJapan = yenSpent / yenExchangeRate;
        System.out.println("US dollars spent in Japan:  " + dollarsSpentInJapan);

        // conversion for Euros
        double dollarsSpentInFrance = eurosSpent / euroExchangeRate;
        System.out.println("US dollars spent in France: " + dollarsSpentInFrance);
        
        // remaining US dollars
        System.out.println("================================================");
        double remainingUsDollars = startingUsDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInFrance;
        System.out.println("Remaining US dollars:       " + remainingUsDollars);        

        // buying souvenirs
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Calculations for Souvenir #1
        int costItem1 = 4;                             //cost per item of first souvenir
        int budget1 = 50;                              //budget for first item
        int totalItem1 = budget1 / costItem1;          //how many items can be purchased
        double fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        // Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = (int)(budget2 / costItem2);           //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class