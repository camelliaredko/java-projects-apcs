/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Olga Redko
 * @version: 01/02/2017
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
   //default constructor
   CO2FromElectricity()
   {
   }

   //A mutator method that calculates the average annual electricity bill.
   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double sum = 0.0;
       for (double bill : monthlyBill)
       {
           sum += bill;
       }
       return sum / monthlyBill.size();
   }
   
   //A mutator method that calculates the average annual price of electricity.
   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
        double sum = 0.0;
        for (double price : monthlyPrice)
        {
            sum += price;
        }
        return sum / monthlyPrice.size();
   }

   //A mutator method that calculates the annual home CO2 emission from electricity.
   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        return avgBill / avgPrice * 1.37 * 12;
   }
}