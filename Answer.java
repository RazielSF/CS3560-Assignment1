import java.util.ArrayList;
import java.util.Arrays;
//Class that holds answer number and answer text
public class Answer 
{
    private int number;
    private String answerText;

    public Answer()
    {
        this.number = 0;
        this.answerText = "Empty";
    }

    public Answer(int num, String text)
    {
        this.number = num;
        this.answerText = text;
    }

    public void setNumber(int num)
    {
        this.number = num;
    }

    public void setText(String text)
    {
        this.answerText = text;
    }

    public int getAnswerNumber()
    {
        return number;
    }

    public String getAnswerText()
    {
        return answerText;
    }

    public void displayNumAndAnswer()
    {
        System.out.print(number + ". " + answerText);
    }

}
