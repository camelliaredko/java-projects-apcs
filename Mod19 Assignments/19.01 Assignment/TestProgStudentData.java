/**
 * This program displays information about students' scores with potential IllegalArgumentExceptions.
 * 
 * @author Olga Redko
 * @version 04/11/2017
 */
public class TestProgStudentData
{
    public static void main(String[] args)
    {
        //IllegalArgumentExceptions tested
        /*
        double[] noTestScores = {};
        StudentData noScores = new StudentData("First", "Last", noTestScores);
        StudentData noFirstName = new StudentData("", "Last", noTestScores);
        StudentData noLastName = new StudentData("First", "", noTestScores);
        */
        
        double[] johnTestScores = {89, 78, 95, 63, 94};
        StudentData john = new StudentData("John", "Doe", johnTestScores);
        
        double[] lindsayTestScores = {88, 90, 100, 88, 90, 100};
        StudentData lindsay = new StudentData("Lindsay", "Green", lindsayTestScores);
        
        System.out.println(john);
        System.out.println(lindsay);
    }
}