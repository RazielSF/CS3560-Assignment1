import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGeneratorMultiple implements StudentGenerator
{
    //Generates random number of students students and answers, generates potentially multiple answers if question is multiple choice 
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

            //Since the question is multiple choice, there is a chance that a student may submit another answer
            ArrayList<Integer> chosenAnswers = new ArrayList<Integer>();
            chosenAnswers.add(randomAnswer);

            //Randomly decide if student will choose another answer
            multipleAnswer = rand3.nextInt(2);
                
            while(multipleAnswer != 0 || studentAnswers.size() != answerList.size())
            {
                randomAnswer = rand2.nextInt(answerList.size());

                //Don't add the answer if the student already chose that answer already
                if(chosenAnswers.contains(randomAnswer))
                {
                    multipleAnswer = rand3.nextInt(2);
                    //Try again
                }

                //Add answer if student has not selected it previously.
                else
                {
                    studentAnswers.add(answerList.get(randomAnswer));
                    chosenAnswers.add(randomAnswer);
                    multipleAnswer = rand3.nextInt(2);
                }

                //Randomly decide to continue submitting
                if(multipleAnswer == 0)
                {
                    break;
                }
            }


            listOfStudents.get(x).setAnswers(studentAnswers);
        }




            

        return listOfStudents;
    }
    
}
