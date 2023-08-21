package com.quest_project.web.logic;

public class GameLogic {

    private static Question getQuestion(int numberOfQuestion){
        return QuestionsReader.getQuestions().get(numberOfQuestion);
    }

    public static String getTextOfQuestion(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getTextOfQuestion();
    }

    public static String getFirstAnswer(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getFirstAnswer();
    }

    public static String getSecondAnswer(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getSecondAnswer();
    }

    public static String getIfChosenFirstAnswer(int numberOfQuestion) {
        return getQuestion(numberOfQuestion).getIfChosenFirstAnswer();
    }

    public static String getIfChosenSecondAnswer(int numberOfQuestion) {
        return getQuestion(numberOfQuestion).getIfChosenSecondAnswer();
    }
}
