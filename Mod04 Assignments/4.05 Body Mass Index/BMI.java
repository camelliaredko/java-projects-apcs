/**
 * This program determines the user's BMI and whether the user is underweight, normal weight, overweight, or obese.
 * 
 * @author Olga Redko
 * @version 10/08/2016
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI
{
    public static void main(String[] args)
    {
        String weightCategory = "";
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weight = in.next();
        int weightInPounds = Integer.parseInt(weight);
        double weightInKilograms = weightInPounds * 0.453592;
        
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String feetHeight = in.next();
        String inchesHeight = in.next();
        int feet = Integer.parseInt(feetHeight);
        int inches = Integer.parseInt(inchesHeight);
        int totalHeightInches = feet * 12 + inches;
        double metersHeight = totalHeightInches / 39.3701;
        System.out.println();
        
        System.out.println("Body Mass Index Calculator");
        System.out.println("===========================");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Height (m): " + df.format(metersHeight));
        System.out.println("Weight (kg): " + df.format(weightInKilograms));
        
        double BMI = weightInKilograms / (metersHeight * metersHeight);
        
        if(BMI < 18.5)
            weightCategory = "Underweight";
        else if(BMI <= 24.9)
            weightCategory = "Normal or healthy weight";
        else if(BMI <= 29.9 )
            weightCategory = "Overweight";
        else
            weightCategory = "Obese";
        
        System.out.println("BMI: " + df.format(BMI));
        System.out.println("Category: " + weightCategory);
    }
}
