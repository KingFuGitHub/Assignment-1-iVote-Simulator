
public class Student {

    public int min = 1;
    public int max = 5;

    public static int numberOfStudents(int min, int max){
        
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        return random;
    }
}
