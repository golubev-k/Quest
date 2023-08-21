package com.quest_project.web.logic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {

    public static final String ANSWER_PARAMETER = "answer";

    public static final String NUMBER_OF_GAMES_PLAYED_PARAMETER = "numberOfGamesPlayed";
    public static final String NUMBER_OF_QUESTION = "numberOfQuestion";

    public static final String RESULT_MESSAGE_PARAMETER = "resultMessage";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();

        String textOfAnswer = null;
        String numberOfAnswer = req.getParameter(ANSWER_PARAMETER);
        int numberOfGamesPlayed = (int) session.getAttribute(NUMBER_OF_GAMES_PLAYED_PARAMETER);
        int numberOfQuestion = (int) session.getAttribute(NUMBER_OF_QUESTION);


        if (numberOfAnswer.equals("1")) {
            textOfAnswer = GameLogic.getIfChosenFirstAnswer((int) session.getAttribute(NUMBER_OF_QUESTION));
        }

        if (numberOfAnswer.equals("2")) {
            textOfAnswer = GameLogic.getIfChosenSecondAnswer((int) session.getAttribute(NUMBER_OF_QUESTION));
        }

        if (textOfAnswer.contains("Правильный ответ")) {
            numberOfQuestion++;
            session.setAttribute(NUMBER_OF_QUESTION, numberOfQuestion);
            getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);
        }

        if (textOfAnswer.contains("Победа")) {
            numberOfGamesPlayed++;
            session.setAttribute(NUMBER_OF_GAMES_PLAYED_PARAMETER, numberOfGamesPlayed);
            session.setAttribute(RESULT_MESSAGE_PARAMETER, textOfAnswer);
            getServletContext().getRequestDispatcher("/win.jsp").forward(req, resp);
        }

        if (textOfAnswer.contains("Поражение")) {
            numberOfGamesPlayed++;
            session.setAttribute(NUMBER_OF_GAMES_PLAYED_PARAMETER, numberOfGamesPlayed);
            session.setAttribute(RESULT_MESSAGE_PARAMETER, textOfAnswer);
            getServletContext().getRequestDispatcher("/lose.jsp").forward(req, resp);
        }
    }
}
