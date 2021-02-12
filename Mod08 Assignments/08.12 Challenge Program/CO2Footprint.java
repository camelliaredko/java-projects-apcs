/**
 * This class instantiates CO2Footprint objects.
 *
 * @author: Olga Redko
 * @version: 01/03/2017
 */
public class CO2Footprint
{
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myGallonsUsed, myElectricityBill, myElectricityPrice;
   private int myNumPeople, myNumLightbulbsReplaced;
   
   private double myPoundsOfCO2FromGas, myPoundsOfCO2FromElectricity, myPoundsOfCO2FromWaste, myWasteReduction, myLightbulbEmissionReduction, myNetCO2Footprint;

   CO2Footprint(boolean paper, boolean plastic, boolean glass, boolean cans, double gallonsUsed, double electricityBill, double electricityPrice, int numPeople, int numLightbulbsReplaced)
   {
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myGallonsUsed = gallonsUsed;
       myElectricityBill = electricityBill;
       myElectricityPrice = electricityPrice;
       myNumPeople = numPeople;
       myNumLightbulbsReplaced = numLightbulbsReplaced;
       myPoundsOfCO2FromGas = 0.0;
       myPoundsOfCO2FromElectricity = 0.0;
       myPoundsOfCO2FromWaste = 0.0;
       myWasteReduction = 0.0;
       myLightbulbEmissionReduction = 0.0;
       myNetCO2Footprint = 0.0;
   }

   public void calcPoundsOfCO2FromGas()
   {
        myPoundsOfCO2FromGas = myGallonsUsed * 8.78E-3 * 2204.62;
   }
   
   public void calcPoundsOfCO2FromElectricity()
   {
        myPoundsOfCO2FromElectricity = myElectricityBill / myElectricityPrice * 1.37 * 12;
   }

   public void calcPoundsOfCO2FromWaste()
   {
       myPoundsOfCO2FromWaste = myNumPeople * 1018;
   }

   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myWasteReduction += (184.0 * myNumPeople);
       }
       if(myPlastic)
       {
           myWasteReduction += (25.6 * myNumPeople);
       }
       if(myGlass)
       {
           myWasteReduction += (46.6 * myNumPeople);
       }
       if(myCans)
       {
           myWasteReduction += (165.8 * myNumPeople);
       }
   }

   public void calcLightbulbEmissionReduction()
   {
       myLightbulbEmissionReduction = myNumLightbulbsReplaced * 1.37 * 73;
   }

   public void calcNetCO2Footprint()
   {
       myNetCO2Footprint = myPoundsOfCO2FromGas + myPoundsOfCO2FromElectricity + myPoundsOfCO2FromWaste - ( myWasteReduction + myLightbulbEmissionReduction );
   }

   public double getPoundsOfCO2FromGas()
   {
       return myPoundsOfCO2FromGas;
   }

   public double getPoundsOfCO2FromElectricity()
   {
       return myPoundsOfCO2FromElectricity;
   }

   public double getPoundsOfCO2FromWaste()
   {
       return myPoundsOfCO2FromWaste;
   }

   public double getWasteReduction()
   {
       return myWasteReduction;
   }

   public double getLightbulbEmissionReduction()
   {
       return myLightbulbEmissionReduction;
   }

   public double getNetCO2Footprint()
   {
       return myNetCO2Footprint;
   }
}