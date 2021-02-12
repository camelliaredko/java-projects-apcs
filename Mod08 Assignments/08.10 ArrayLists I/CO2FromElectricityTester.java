/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Olga Redko
 * @version: 01/02/2017
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
       CO2FromElectricity CO2 = new CO2FromElectricity();

       ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
       ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

       //Values to add to the monthly bill or use your own:
       monthlyBill.add(17.11);
       monthlyBill.add(23.83);
       monthlyBill.add(21.27);

       // Values to add to the monthly Price or use your own:
       monthlyPrice.add(17.11 / 140);
       monthlyPrice.add(23.83 / 195);
       monthlyPrice.add(21.27 / 174);

       double avgBill = CO2.calcAverageBill(monthlyBill);
       double avgPrice = CO2.calcAveragePrice(monthlyPrice);

       double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}