import java.util.ArrayList;
import java.util.Arrays;

public interface VotingService 
{
    public void acceptSubmissions(ArrayList<Student> answerList, Question quiestion);

    //public void displayIDs();     Used while testing

    public void displayResults();

}
