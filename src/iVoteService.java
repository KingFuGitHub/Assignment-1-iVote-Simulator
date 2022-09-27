
public class iVoteService {

    // variables
    private int A;
    private int B;
    private int C;
    private int D;

    // to increment A choice
    public void incrementA() {
        this.A += 1;
    }

    // to get A choice
    public int getA() {
        return this.A;
    }

    // to increment B choice
    public void incrementB() {
        this.B += 1;
    }

    // to get B choice
    public int getB() {
        return this.B;
    }

    // to increment C choice
    public void incrementC() {
        this.C += 1;
    }

    // to get C choice
    public int getC() {
        return this.C;
    }

    // to increment D choice
    public void incrementD() {
        this.D += 1;
    }

    // to get D choice
    public int getD() {
        return this.D;
    }

    // to clear all choices
    public void clearAnswer(){
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
    }

    // to display the final result for each type of question
    public void displayResult(String questionType) {
        System.out.println(
            "--------------------------------------------------------\n" +
            "Result for "+ questionType +"\n" + 
            "--------------------------------------------------------\n" +
            "A: " + A + "\n" +
            "B: " + B + "\n" +
            "C: " + C + "\n" +
            "D: " + D + "\n"
        );
    }

}