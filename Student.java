import java.util.ArrayList;
import java.util.Arrays;
//Class holds a student's ID and their answer(s)
public class Student 
{
    private String uniqueID;
    private ArrayList<Answer> submittedAnswers = new ArrayList<Answer>();

    public Student()
    {
        this.uniqueID = "000000";
    }

    public Student(String id)
    {
        this.uniqueID = id;
    }

    public void setID(String id)
    {
        this.uniqueID = id;
    }

    public String getID()
    {
        return uniqueID;
    }

    public void setAnswers(ArrayList<Answer> studentAnswers)
    {
        this.submittedAnswers = studentAnswers;
    }

    public ArrayList<Answer> getStudentAnswers()
    {
        return submittedAnswers;
    }

    public void displayStudentAnswers()
    {
        for(int x = 0; x < submittedAnswers.size(); x++)
        {
            submittedAnswers.get(x).displayNumAndAnswer();
        }
    }

}
