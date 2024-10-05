package com.techatpark.practices.model;

public class Questions {

    private  Long questionId;
    private String question;
    private Long choiceId;
    private String choice;
    private Long matchId;

    private boolean correctValue;

    @Override
    public String toString() {
        return "Questions{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", choiceId=" + choiceId +
                ", choice='" + choice + '\'' +
                ", matchId=" + matchId +
                ", correctValue=" + correctValue +
                '}';
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
    public boolean isCorrectValue() {
        return correctValue;
    }

    public void setCorrectValue(boolean correctValue) {
        this.correctValue = correctValue;
    }


}
