/**
 * This program determines the user's basal metabolic rate.
 * 
 * @author Olga Redko
 * @version 10/08/2016
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMR
{
    public static void main(String[] args)
    {
        double BMR;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        
        System.out.print("Enter your name: ");
        String name = in.next();
        
        System.out.print("Gender (M or F): ");
        String genderMorF = in.next();
        char maleGender = genderMorF.charAt(0);
        
        System.out.print("Enter your age: ");
        String yearsOld = in.next();
        int age = Integer.parseInt(yearsOld);
        
        System.out.print("Height in inches: ");
        String height = in.next();
        int heightInInches = Integer.parseInt(height);
        double heightInCm = heightInInches * 2.54;          //converts height from inches to centimeters
        
        System.out.print("Weight in pounds: ");
        String weight = in.next();
        int weightInPounds = Integer.parseInt(weight);
        double weightInKg = weightInPounds * 0.453592;     //converts weight from pounds to kilograms
        System.out.println("\n");
        
        System.out.println("Calculate Your Basal Metabolism \n");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + genderMorF);
        System.out.println("Age: " + age);
        System.out.println("Weight (kg): " + df.format(weightInKg));
        System.out.println("Height (cm): " + df.format(heightInCm));
        
        boolean isMale = maleGender == 'M';
        
        if(isMale)
            BMR = 10 * weightInKg + 6.25 * heightInCm - 5 * age + 5;
        else
            BMR = 10 * weightInKg + 6.25 * heightInCm - 5 * age - 161;
        
        System.out.println("Basal Metabolic Rate: " + df.format(BMR) + " calories per day");
    }
}
