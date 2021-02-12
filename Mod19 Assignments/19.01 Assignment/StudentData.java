/**
 * This program displays information about students' scores with potential IllegalArgumentExceptions.
 * 
 * @author Olga Redko
 * @version 04/11/2017
 */
public class StudentData
{
    private String firstName;
    private String lastName;
    private double[] testScores;
    private char grade;
    
    StudentData(String firstName, String lastName, double[] testScores)
    {
        this.firstName = firstName;
        if(firstName.length() == 0)
        {
            throw new IllegalArgumentException("First name must have at least one character.");
        }
        
        this.lastName = lastName;
        if(lastName.length() == 0)
        {
            throw new IllegalArgumentException("Last name must have at least one character.");
        }
        
        this.testScores = testScores;
        
        courseGrade(testScores);
    }
    
    public char courseGrade(double[] list)
    {
        double averageGrade = 0.0;
        if(list.length == 0)
        {
            throw new IllegalArgumentException("At least one test score value must be inputted.");
        }
        
        for(double score : list)
        {
            averageGrade += score;
        }
        
        averageGrade /= list.length;
        
        if(averageGrade >= 90)
        {
            grade = 'A';
            return grade;
        }
        else if(averageGrade >= 80)
        {
            grade = 'B';
            return grade;
        }
        else if(averageGrade >= 70)
        {
            grade = 'C';
            return grade;
        }
        else if(averageGrade >= 60)
        {
            grade = 'D';
            return grade;
        }
        else
        {
            grade = 'F';
            return grade;
        }
    }
    
    public String toString()
    {
        String toStringDisplay = String.format("%-10s %-10s", firstName, lastName);
        
        for(double score : testScores)
        {
            toStringDisplay += String.format("%-8.2f", score);
        }
        
        toStringDisplay += grade;
        
        return toStringDisplay;
    }
}