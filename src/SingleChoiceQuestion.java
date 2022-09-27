public class SingleChoiceQuestion implements Question{

    // variables
    private String question;
    private String questionChoice;

    // set the question with a parameter of type string
    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    // to display the question
    @Override
    public String getQuestion() {
        return question;
    }

    // to get the question choice
    @Override
    public String getQuestionChoice() {
        return questionChoice;
    }

    // to set a question choice with string as a parameter
    @Override
    public void setQuestionChoice(String questionChoice) {
        this.questionChoice = questionChoice;
    }

}