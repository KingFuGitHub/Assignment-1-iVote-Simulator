import java.util.Random;
import java.util.UUID;
import java.util.HashMap;

public class Student {  

    private static String generateStudentUUID(){
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }


    public static HashMap<String, String> generateStudentData(){
        Random random = new Random();
        HashMap<String, String> student = new HashMap<String, String>();
        String names[] = {"Bob", "Long", "Alex"};

        int randomNumberOfStudents = random.nextInt(5) + 1;

        for(int i = randomNumberOfStudents; i <= 5; i++){
            student.put(generateStudentUUID(), names[random.nextInt(2)]);
        }

        return student;
    }

    


    
}
