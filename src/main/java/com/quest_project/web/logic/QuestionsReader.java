package com.quest_project.web.logic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuestionsReader {
    static private String fileName;
    static String[] partsOfQuestion = new String[4];
    static List<Question> list = getQuestions();


    static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        try {
            InputStream is = QuestionsReader.class.getClassLoader().getResourceAsStream("questions.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                partsOfQuestion = line.split(";");

                int numberOfQuestion = Integer.parseInt(partsOfQuestion[0]);
                String question = partsOfQuestion[1];
                String firstAnswer = partsOfQuestion[2];
                String secondAnswer = partsOfQuestion[3];
                String ifChosenFirstAnswer = partsOfQuestion[4];
                String ifChosenSecondAnswer = partsOfQuestion[5];

                questions.add(new Question(numberOfQuestion, question, firstAnswer, secondAnswer, ifChosenFirstAnswer, ifChosenSecondAnswer));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return questions;
    }
}
