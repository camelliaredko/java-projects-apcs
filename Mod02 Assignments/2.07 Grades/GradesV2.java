
/**
 * This program calculates the average grade each time a new score is added to the total.
 * 
 * @author Olga Redko
 * @version 9/17/2016
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int numTests = 0;          //counts number of tests
        int testGrade = 0;         //individual test grade
        int totalPoints = 0;       //total points for all tests
        double average = 0.0;      //average grade
        
        //calculate the average grade
        numTests++;                //number of tests
        testGrade = 97;            //test grade
        totalPoints += testGrade;  //total points
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests );
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        
        //calculate the average grade
        numTests++;                //number of tests
        testGrade = 79;            //test grade
        totalPoints += testGrade;  //total points
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests );
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        
        //calculate the average grade
        numTests++;                //number of tests
        testGrade = 83;            //test grade
        totalPoints += testGrade;  //total points
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests );
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        
        //calculate the average grade
        numTests++;                //number of tests
        testGrade = 88;            //test grade
        totalPoints += testGrade;  //total points
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests );
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
    
    }//end of main method
}//end of class