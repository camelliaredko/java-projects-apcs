/**
 * This program prints out homework information while using an abstract and interface class.
 * 
 * @Olga Redko
 * @03/12/2017
 */
import java.util.List;
import java.util.ArrayList;
public class TestHomework2
{
    public static void main(String[] args)
    {
        List<Homework2> homework = new ArrayList<Homework2>();
        
        MyMath2 math = new MyMath2();
        math.createAssignment(5);
        
        MyScience2 science = new MyScience2();
        science.createAssignment(6);
        
        MyEnglish2 english = new MyEnglish2();
        english.createAssignment(12);
        
        MyJava2 java = new MyJava2();
        java.createAssignment(777);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for(Homework2 h : homework)
        {
            System.out.println("Before reading: ");
            System.out.println(h);
            System.out.println("After reading: ");
            h.doReading();
            System.out.println(h);
        }
    }
}
