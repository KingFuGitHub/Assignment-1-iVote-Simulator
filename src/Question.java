

// Using OOP concept interface
public interface Question {

    // each question type should have set question
    public void setQuestion(String question);

    // each question should be able to display the question
    public String getQuestion();

    // each question should be able to set a question choice
    public void setQuestionChoice(String questionChoice);

    // each question should be able to display the question choice(s)
    public String getQuestionChoice();

}
