import java.util.UUID;
import java.util.Random;

public class Student {  

    // variables
    private String ID;
    private char answer;

    // to generate unique IDs for a student
    // Furthermore, there is no need to check when student submit because it's unique and can't submit twice.
    public void generateID(){
        this.ID = UUID.randomUUID().toString();
    }

    // to get ID from a student
    public String getID(){
        return this.ID;
    }

    // to generate a random answer from A to D
    public void generateAnswer(){
        Random random = new Random();
        // bound is 0 through 4 not including 5
        answer = (char)(random.nextInt(4) + 65);
    }

    // to get the answer
    public char getAnswer(){
        return this.answer;
    }

    
}
