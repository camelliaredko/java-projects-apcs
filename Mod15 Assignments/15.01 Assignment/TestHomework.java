/**
 * This program prints out homework assignments while using an abstract class.
 * 
 * @author Olga Redko
 * @version 03/12/2017
 */
import java.util.ArrayList;
public class TestHomework
{
    public static void main(String[] args)
    {
        ArrayList<Homework> homework = new ArrayList<Homework>();
        
        MyMath math = new MyMath();
        math.createAssignment(5);
        
        MyScience science = new MyScience();
        science.createAssignment(6);
        
        MyEnglish english = new MyEnglish();
        english.createAssignment(12);
        
        MyJava java = new MyJava();
        java.createAssignment(777);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for(Homework h : homework)
        {
            System.out.println(h);
        }
    }
}
