/**
 * This program prints out homework information while implementing the Comparable<T> interface.
 * 
 * @Olga Redko
 * @03/12/2017
 */
import java.util.List;
import java.util.ArrayList;
public class TestHomework3
{
    public static void main(String[] args)
    {
        List<Homework3> homework = new ArrayList<Homework3>();
        
        String listOfEqualPages = "";
        
        MyMath3 math = new MyMath3();
        math.createAssignment(4);
        
        MyScience3 science = new MyScience3();
        science.createAssignment(6);
        
        MyEnglish3 english = new MyEnglish3();
        english.createAssignment(4);
        
        MyJava3 java = new MyJava3();
        java.createAssignment(777);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for(Homework3 h : homework)
        {
            System.out.println(h);
        }
        
        for(int i = 0; i < homework.size(); i++)
        {
            for(int j = 0; j < homework.size(); j++)
            {
             if(homework.get(i).compareTo(homework.get(j)) == 0 && i != j)
             {
                listOfEqualPages += "The homework for " + homework.get(i).typeHomework + " and " + homework.get(j).typeHomework + " are the same number of pages. \n";
                listOfEqualPages = listOfEqualPages.replace("The homework for " + homework.get(j).typeHomework + " and " + homework.get(i).typeHomework + " are the same number of pages. \n", "");
             }
            }
        }
        System.out.println(listOfEqualPages);
    }
}