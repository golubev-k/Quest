package com.quest_project.web.logic;

public class GameLogic {

    static private Question getQuestion(int numberOfQuestion){
        return QuestionsReader.getQuestions().get(numberOfQuestion);
    }

    static public String getTextOfQuestion(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getTextOfQuestion();
    }

    static public String getFirstAnswer(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getFirstAnswer();
    }

    static public String getSecondAnswer(int numberOfQuestion){
        return getQuestion(numberOfQuestion).getSecondAnswer();
    }
    static public String getIfChosenFirstAnswer(int numberOfQuestion) {
        return getQuestion(numberOfQuestion).getIfChosenFirstAnswer();
    }

    static public String getIfChosenSecondAnswer(int numberOfQuestion) {
        return getQuestion(numberOfQuestion).getIfChosenSecondAnswer();
    }
}
