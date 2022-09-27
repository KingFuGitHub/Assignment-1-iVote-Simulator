import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {

    // variables and objects
    static Random random = new Random();
    static int numberOfStudent = generateRandomNumberOfStudent();
    static Student student = new Student();
    static iVoteService ivote = new iVoteService();

    // to record answer based on the given generated answer
    public static void recordAnswer(char answer){
        if(answer == 'A'){
            ivote.incrementA();
        }else if(answer == 'B'){
            ivote.incrementB();
        }else if(answer == 'C'){
            ivote.incrementC();
        }else if(answer == 'D'){
            ivote.incrementD();
        }
    }

    // to get a random number of students
    public static int generateRandomNumberOfStudent() {
        int randomNumberOfStudents = random.nextInt(5) + 1;
        return randomNumberOfStudents;
    }

    // to simulate single choice question(s)
    public static void singleChoiceQuestionTest() {
        SingleChoiceQuestion singleChoiceQuestion = new SingleChoiceQuestion();
        for(int i = 0; i < numberOfStudent; i++){
            
            student.generateID();
            System.out.println("--------------------------------------------------------");
            System.out.println("Student ID: " + student.getID());
            System.out.println("--------------------------------------------------------");

            singleChoiceQuestion.setQuestion("Which is not the color of the USA flag?");
            System.out.println(singleChoiceQuestion.getQuestion());

            for (int j = 0; j < 4; j++) {
                String choices[] = { "A. Red", "B. White", "C. Blue", "D. Yellow" };
                singleChoiceQuestion.setQuestionChoice(choices[j]);
                System.out.println(choices[j]);
            }

            student.generateAnswer();
            System.out.println("Student picked: " + student.getAnswer());
            recordAnswer(student.getAnswer());

        }
        ivote.displayResult("Single Choice Question(s)");
    }

    // to simulate multiple choice question(s)
    public static void multipleChoiceQuestionTest() {
        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion();
        for(int i = 0; i < numberOfStudent; i++){
            List<Character> list = new ArrayList<Character>();
            
            student.generateID();
            System.out.println("--------------------------------------------------------");
            System.out.println("Student ID: " + student.getID());
            System.out.println("--------------------------------------------------------");

            multipleChoiceQuestion.setQuestion("Which is not the color of the USA flag?");
            System.out.println(multipleChoiceQuestion.getQuestion());

            for (int j = 0; j < 4; j++) {
                String choices[] = { "A. Red", "B. White", "C. Blue", "D. Yellow" };
                multipleChoiceQuestion.setQuestionChoice(choices[j]);
                System.out.println(choices[j]);
                student.generateAnswer();
                if(!list.contains(student.getAnswer())){
                    list.add(student.getAnswer());
                    recordAnswer(student.getAnswer());
                }
            }
            System.out.println("Student picked: " + list);
        }
        ivote.displayResult("Multiple Choice Question(s)");
    }

    public static void main(String[] args) {
        // to print out the number of students
        System.out.println(numberOfStudent);

        // displaying the simulation of the single choice question(s)
        System.out.println("********************************************************");
        System.out.println("Number of students: " + numberOfStudent);
        System.out.println("********************************************************");
        singleChoiceQuestionTest();

        // to clear the answers from the previous single choice question(s)
        ivote.clearAnswer();

        // displaying the simulation of the multiple choice question(s)
        System.out.println("********************************************************");
        System.out.println("Number of students: " + numberOfStudent);
        System.out.println("********************************************************");
        multipleChoiceQuestionTest();
    }

}