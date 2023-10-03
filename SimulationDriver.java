import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class SimulationDriver 
{
    public static void main(String[] args)
    {
        //Set Question 1 (Single Choice) and list of possible answers.
        Question question1 = new Question();
        question1.setQuestion("Which of these is an animal?");
        question1.setIfSingle(true);

        //Set Answers
        ArrayList<Answer> answerList1 = new ArrayList<Answer>();
        Answer answer1 = new Answer(1, "Fox");
        Answer answer2 = new Answer(2, "Backpack");
        Answer answer3 = new Answer(3, "House");
        Answer answer4 = new Answer(4, "Car");
    
        answerList1.add(answer1);
        answerList1.add(answer2);
        answerList1.add(answer3);
        answerList1.add(answer4);
        question1.setAnswers(answerList1);

        //Generate 30 students with random answers
        ArrayList<Student> listOfStudents1 = new ArrayList<Student>();
        StudentGenerator sg1 = new StudentGeneratorSingle();
        listOfStudents1 = sg1.generateStudents(answerList1);
        
        
        //In this scenario the first student will vote twice, but only the second time (this time) will be counted
        Student twoVoter = new Student("1");
        ArrayList<Answer> extraStudentAnswers = new ArrayList<Answer>();
        extraStudentAnswers.add(answer1);
        twoVoter.setAnswers(extraStudentAnswers);
        listOfStudents1.add(twoVoter);

        
        //Gather results for quesiton 1
        VotingService vs1 = new VotingServiceSingle();
        vs1.acceptSubmissions(listOfStudents1, question1);
        
        
        System.out.println("\n");


        //Set Question 2 (Multiple Choice) and list of possible answers.
        Question question2 = new Question();
        question2.setQuestion("Which of these are colors?");
        question2.setIfSingle(false);

        //Set Answers
        ArrayList<Answer> answerList2 = new ArrayList<Answer>();
        Answer answer5 = new Answer(1, "Red");
        Answer answer6 = new Answer(2, "Pencil");
        Answer answer7 = new Answer(3, "Blue");
        Answer answer8 = new Answer(4, "Chair");
    
        answerList2.add(answer5);
        answerList2.add(answer6);
        answerList2.add(answer7);
        answerList2.add(answer8);
        question2.setAnswers(answerList2);

        //Generate 30 more students with random answers
        ArrayList<Student> listOfStudents2 = new ArrayList<Student>();
        StudentGenerator sg2 = new StudentGeneratorMultiple();
        listOfStudents2 = sg2.generateStudents(answerList2);

        //Gather results for question 2        
        VotingService vs2 = new VotingServiceMultiple();        
        vs2.acceptSubmissions(listOfStudents2, question2);

        System.out.println("Done");
    }

}