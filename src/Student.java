import java.util.Random;
import java.util.UUID;

public class Student {

    public static int numberOfStudents() {

        Random random = new Random();

        // the bound is not inclusive
        int randomNumberOfStudents = random.nextInt(5) + 1;
        return randomNumberOfStudents;
    }

    public static String generateStudentUUID(){
        String uniqueID = UUID.randomUUID().toString();

        return uniqueID;
    }

    
}
