/**
 * This program displays information about students and quiz scores using algorithms.
 * 
 * @author Olga Redko 
 * @version 4/7/2017
 */
public class Student
{
    private String name;
    private int qz1;
    private int qz2;
    private int qz3;
    private int qz4;
    private int qz5;
    
    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getQuiz(int quizNumber)
    {
        if (quizNumber == 1)
        {
            return this.qz1;
        }
        else if (quizNumber == 2)
        {
            return this.qz2;
        }
        else if (quizNumber == 3)
        {
            return this.qz3;
        }
        else if (quizNumber == 4)
        {
            return this.qz4;
        }
        else
        {
            return this.qz5;
        }
    }
    
    public void setQuiz(int quizNumber, int quizScore)
    {
        if (quizNumber == 1)
        {
            this.qz1 = quizScore;
        }
        else if (quizNumber == 2)
        {
            this.qz2 = quizScore;
        }
        else if (quizNumber == 3)
        {
            this.qz3 = quizScore;
        }
        else if (quizNumber == 4)
        {
            this.qz4 = quizScore;
        }
        else
        {
            this.qz5 = quizScore;
        }
    }
    
    public String toString()
    {
        return (this.name + this.qz1 + this.qz2 + this.qz3 + this.qz4 + this.qz5);
    }
}