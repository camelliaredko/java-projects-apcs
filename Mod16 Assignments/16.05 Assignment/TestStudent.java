/**
 * This program displays information about students and quiz scores using algorithms.
 * 
 * @author Olga Redko
 * @version 4/7/2017
 */
import java.util.*;
public class TestStudent
{
    public static void main(String[] args)
    {
		List<Student> myClass = new ArrayList<Student>();
		
		myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
		myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
		myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
		myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
		myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
		
        System.out.println("Starting Gradebook: ");
        System.out.println();
        printResults(myClass);
        System.out.println();
        
        System.out.println("Changing Betty's name to Betty Boop: ");
        replaceName(myClass, "Betty Farm", "Betty Boop");
        System.out.println();
        printResults(myClass);
        System.out.println();
		
        System.out.println("Changing Jean's quiz 1 score to 80: ");
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        System.out.println();
        printResults(myClass);
        System.out.println();
        
        System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90: ");
        replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        System.out.println();
        printResults(myClass);
        System.out.println();
        
        System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 before Betty:");
        insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        System.out.println();
        printResults(myClass);
        System.out.println();
        
        System.out.println("Deleting Max Gerard:");
        deleteStudent(myClass, "Max Gerard");
        System.out.println();
        printResults(myClass);
    }
		
    public static void printBook(List<Student> list)
    {
        for(int i = 0; i < list.size(); i++)
           System.out.println(list.get(i));
    }
    
    public static void replaceName(List<Student> list, String find, String replace)
    {
       for(int index = 0; index < list.size(); index++)
          if (list.get(index).getName().equals(find))
               list.get(index).setName(replace);
    }
    
    public static void replaceQuiz(List<Student> list, String name, int quizNumber, int quizScore)
    {
       for(int index = 0; index < list.size(); index++)
          if (list.get(index).getName().equals(name))
               list.get(index).setQuiz(quizNumber, quizScore);
    }
    
    public static void replaceStudent(List<Student> list, String findName, String replaceName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
    {
       for(int index = 0; index < list.size(); index++)
       {
          if(list.get(index).getName().equals(findName))
          {
              list.get(index).setName(replaceName);
              list.get(index).setQuiz(1, quiz1);
              list.get(index).setQuiz(2, quiz2);
              list.get(index).setQuiz(3, quiz3);
              list.get(index).setQuiz(4, quiz4);
              list.get(index).setQuiz(5, quiz5);
          }
       }
    }
    
    public static void insertStudent(List<Student> list, String findName, String addName, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
    {
       int location = 0;
       
        for(int index = 0; index < list.size(); index++)
       {
          if(list.get(index).getName().equals(findName))
          {
              location = index;
          }
       }
       
       list.add(location, new Student(addName, quiz1, quiz2, quiz3, quiz4, quiz5));
    }
    
    public static void deleteStudent(List<Student> list, String findName)
    {
       for(int index = 0; index < list.size(); index++)
       {
          if(list.get(index).getName().equals(findName))
          {
              list.remove(index);
          }
       }
    }
    
    public static void printResults(List<Student> list)
    {
        System.out.printf("%-16s%-6s%-6s%-6s%-6s%-6s\n", "Student name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-------------------------------------------");
        for(Student student : list)
        {
            System.out.printf("%-16s%-6d%-6d%-6d%-6d%-6d\n", student.getName() + ":", student.getQuiz(1), student.getQuiz(2), student.getQuiz(3), student.getQuiz(4), student.getQuiz(5));
        }
        System.out.println();
    }
}