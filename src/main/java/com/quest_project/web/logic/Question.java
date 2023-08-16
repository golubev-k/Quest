package com.quest_project.web.logic;

public class Question {
    private String textOfQuestion;
    private int numberOfQuestion;
    private String firstAnswer;
    private String secondAnswer;
    private String ifChosenFirstAnswer;
    private String ifChosenSecondAnswer;

    public Question(int numberOfQuestion, String textOfQuestion, String firstAnswer, String secondAnswer, String ifChosenFirstAnswer, String ifChosenSecondAnswer) {
        this.textOfQuestion = textOfQuestion;
        this.numberOfQuestion = numberOfQuestion;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.ifChosenFirstAnswer = ifChosenFirstAnswer;
        this.ifChosenSecondAnswer = ifChosenSecondAnswer;
    }

    public String getTextOfQuestion() {
        return textOfQuestion;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getIfChosenFirstAnswer() {
        return ifChosenFirstAnswer;
    }

    public String getIfChosenSecondAnswer() {
        return ifChosenSecondAnswer;
    }
}
