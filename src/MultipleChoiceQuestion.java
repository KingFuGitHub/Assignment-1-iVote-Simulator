public class MultipleChoiceQuestion implements Question {

    // variable
    private String question;
    private String questionChoice;

    // set the question with a given string
    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    // to display the question
    @Override
    public String getQuestion() {
        return question;
    }

    // to display the question choice(s)
    @Override
    public String getQuestionChoice() {
        return questionChoice;
    }

    // to set the question choice(s)
    @Override
    public void setQuestionChoice(String questionChoice) {
        this.questionChoice = questionChoice;
    }

}