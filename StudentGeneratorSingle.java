import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGeneratorSingle implements StudentGenerator
{
    //Generates 30 random students with a random answer 
    public ArrayList<Student> generateStudents(ArrayList<Answer> answerList)
    {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();

        int randomAnswer;
        int multipleAnswer;

        int numOfStudents = 30;

        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        for(int x = 0; x < numOfStudents; x++)
        {
            ArrayList<Answer> studentAnswers = new ArrayList<Answer>();
            
            Student test = new Student();

            listOfStudents.add(test);

            //Student is given an ID
            listOfStudents.get(x).setID(Integer.toString(x + 1));

            //Randomly selects an answer from the answer list and Student "selects" that answer
            randomAnswer = rand2.nextInt(answerList.size());
            studentAnswers.add(answerList.get(randomAnswer));

            listOfStudents.get(x).setAnswers(studentAnswers);
        }

        return listOfStudents;
    }

}
