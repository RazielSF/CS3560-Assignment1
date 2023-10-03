import java.util.ArrayList;
import java.util.Arrays;

//For Questions that accept multiple answers
public class VotingServiceMultiple implements VotingService
{
    //private ArrayList<String> listofIDs = new ArrayList<String>();    Used to test service correctly working
    private Question question;

    //Takes in the student list, along with their answers, and the inputted question.
    @Override
    public void acceptSubmissions(ArrayList<Student> answerList, Question q)
    {
        this.question = q;

        //Removes any students that submitted more than once, but keeps their latest submission. (Not efficient, but works)
        for(int x = 0; x < answerList.size(); x++)
        {
            for(int y = 0; y < answerList.size(); y++)
            {
                if(x == y)
                {

                }

                else
                {
                    if(answerList.get(x).getID().equals(answerList.get(y).getID()))
                    {
                        answerList.remove(x);
                        x = 0;
                        y = 0;
                    }
                }
            }
        }

        /* Adds all IDs into an array (Used during testing)
        for(int z = 0; z < answerList.size(); z++)
        {
            listofIDs.add(answerList.get(z).getID());
        } */

        //Sets an array with the same number of total possible answers
        int questionNumbers[] = new int[question.getListOfAnswers().size()];

        //Sets all ints in the array to zero.
        for(int c = 0; c < questionNumbers.length; c++)
        {
            questionNumbers[c] = 0;
        }

        //Counts the number of times an answer was chosen for each student
        for(int a = 0; a < answerList.size(); a++)
        {
            for(int b = 0; b < answerList.get(a).getStudentAnswers().size(); b++)
            {
                int ansNum = answerList.get(a).getStudentAnswers().get(b).getAnswerNumber() - 1;
                questionNumbers[ansNum] += 1;
            }

        }


        displayResults(questionNumbers);


    }

    /* Used for testing
    public void displayIDs()
    {
        for(int x = 0; x < listofIDs.size(); x++)
        {
            System.out.println(listofIDs.get(x));
        }
    } */

    //Displays the total votes each answer receieved
    public void displayResults(int[] test)
    {
        System.out.println(question.getQuestion());
        
        for(int x = 0; x < question.getListOfAnswers().size(); x++)
        {
            question.displayOneAnswers(x);
            System.out.print(" recieved " + test[x] + " votes.");
            System.out.println();
        }

    }


}
