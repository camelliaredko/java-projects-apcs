/**
 * @purpose: To calculate the annual CO2 footprints of different households.
 *
 * @author: Olga Redko
 * @version: 01/03/2017
 */
import java.util.ArrayList;
public class CO2FootprintTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2Footprint> cO2 = new ArrayList<CO2Footprint>();
       cO2.add(new CO2Footprint(true, true, false, true, 1330.55, 20.74, 0.12, 2, 10));
       cO2.add(new CO2Footprint(false, false, false, true, 1482, 60.34, 0.10, 10, 8));
       cO2.add(new CO2Footprint(true, false, false, false, 2239, 40.45, 0.13, 5, 7));
       cO2.add(new CO2Footprint(true, true, true, true, 1120, 32.63, 0.14, 3, 14));
       cO2.add(new CO2Footprint(true, false, false, false, 1922, 43.96, 0.15, 4, 20));
       
       for(CO2Footprint dataRecord : cO2)
       {
           dataRecord.calcPoundsOfCO2FromGas();
           dataRecord.calcPoundsOfCO2FromElectricity();
           dataRecord.calcPoundsOfCO2FromWaste();
           dataRecord.calcWasteReduction();
           dataRecord.calcLightbulbEmissionReduction();
           dataRecord.calcNetCO2Footprint();
       }

       System.out.println("|              Pounds of CO2                 |     Pounds of CO2        |              |");
       System.out.println("|              Emitted from                  |      Reduced from        |              |");
       System.out.println("|    Gas     |  Electricity  |     Waste     |  Recycling  |  New Bulbs | CO2 Footprint|");
       System.out.println("|============|===============|===============|=============|============|==============|");

       CO2Footprint dataRecord;

       for(int index = 0; index < cO2.size(); index ++)
       {
           dataRecord = cO2.get(index);
           System.out.printf("|  %8.2f  |    %8.2f   |   %8.2f    |  %8.2f   |  %8.1f  |   %8.2f   |%n", dataRecord.getPoundsOfCO2FromGas(), dataRecord.getPoundsOfCO2FromElectricity(), dataRecord.getPoundsOfCO2FromWaste(), dataRecord.getWasteReduction(), dataRecord.getLightbulbEmissionReduction(), dataRecord.getNetCO2Footprint());
       }
   }
}