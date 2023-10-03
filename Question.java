import java.util.ArrayList;
import java.util.Arrays;
//Holds the question itself and its possible answers
public class Question
{
    private boolean isSingleChoice;
    private String fullQuestion;
    private ArrayList<Answer> answers = new ArrayList<Answer>();

    public Question()
    {
        this.fullQuestion = "Empty";
    }

    public Question(String q, boolean a)
    {
        this.fullQuestion = q;
        isSingleChoice = a;
    }

    public void setQuestion(String question)
    {
        this.fullQuestion = question;
    }

    public void setAnswers(ArrayList<Answer> answerList)
    {
        this.answers = answerList;
    }

    public String getQuestion()
    {
        return fullQuestion;
    }

    public void setIfSingle(boolean s)
    {
        this.isSingleChoice = s;
    }

    public boolean getIfSingle()
    {
        return isSingleChoice;
    }

    public ArrayList<Answer> getListOfAnswers()
    {
        return answers;
    }

    public void displayAllAnswers()
    {
        for(int x = 0; x < answers.size(); x++)
        {
            answers.get(x).displayNumAndAnswer();
            System.out.println();
        }
    }

    public void displayOneAnswers(int y)
    {
        answers.get(y).displayNumAndAnswer();
    }
    
}
