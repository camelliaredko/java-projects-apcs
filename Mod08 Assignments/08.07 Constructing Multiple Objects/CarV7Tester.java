public class CarV7Tester
{
    public static void main(String[ ] args)
    {   
        //variable declaration and initialization
        String carType1 = "3142 Time Traveler", carType2 = "2016 Toyota Prius Three", carType3 = "2010 Rolls-Royce Ghost";
        int startMiles1 = 56066, startMiles2 = 10239, startMiles3 = 79283;
        int endMiles1 = 56318, endMiles2 = 11279, endMiles3 = 79493;
        double gallonsUsed1 = 9, gallonsUsed2 = 20, gallonsUsed3 = 15;
        double pricePerGallon1 = 2.19, pricePerGallon2 = 2.30, pricePerGallon3 = 2.25;
        
        int distance1, distance2, distance3;
        double milesPerGallon1, gallonsPerMile1, cost1,
               milesPerGallon2, gallonsPerMile2, cost2,
               milesPerGallon3, gallonsPerMile3, cost3;
        
        //create object
        CarV7 car1 = new CarV7(carType1, startMiles1, endMiles1, gallonsUsed1, pricePerGallon1);
        CarV7 car2 = new CarV7(carType2, startMiles2, endMiles2, gallonsUsed2, pricePerGallon2);
        CarV7 car3 = new CarV7(carType3, startMiles3, endMiles3, gallonsUsed3, pricePerGallon3);
        
        //call methods
        distance1 = car1.calcDistance();
        milesPerGallon1 = car1.calcMPG();
        gallonsPerMile1 = car1.calcGPM();
        cost1 = car1.totalCost();
        
        distance2 = car2.calcDistance();
        milesPerGallon2 = car2.calcMPG();
        gallonsPerMile2 = car2.calcGPM();
        cost2 = car2.totalCost();
        
        distance3 = car3.calcDistance();
        milesPerGallon3 = car3.calcMPG();
        gallonsPerMile3 = car3.calcGPM();
        cost3 = car3.totalCost();
        
        //print data table
        System.out.printf("%100s\n", "Gas Mileage Calculations");
        System.out.printf("%s%20s%20s%20s%20s%20s%20s%20s%20s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("============================================================================================================================================================================");
        System.out.printf("%s%13d%20d%20d%20.1f%20.2f%20.2f%20.1f%20.3f\n", carType1, startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, cost1, milesPerGallon1, gallonsPerMile1);
        System.out.printf("%s%8d%20d%20d%20.1f%20.2f%20.2f%20.1f%20.3f\n", carType2, startMiles2, endMiles2, distance2, gallonsUsed2, pricePerGallon2, cost2, milesPerGallon2, gallonsPerMile2);
        System.out.printf("%s%9d%20d%20d%20.1f%20.2f%20.2f%20.1f%20.3f\n", carType3, startMiles3, endMiles3, distance3, gallonsUsed3, pricePerGallon3, cost3, milesPerGallon3, gallonsPerMile3);
    }
}