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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();

        String textOfAnswer = null;
        String numberOfAnswer = req.getParameter("answer");
        int numberOfGamesPlayed = (int) session.getAttribute("numberOfGamesPlayed");
        int numberOfQuestion = (int) session.getAttribute("numberOfQuestion");


        if (numberOfAnswer.equals("1")) {
            textOfAnswer = GameLogic.getIfChosenFirstAnswer((int) session.getAttribute("numberOfQuestion"));
        }

        if (numberOfAnswer.equals("2")) {
            textOfAnswer = GameLogic.getIfChosenSecondAnswer((int) session.getAttribute("numberOfQuestion"));
        }

        if (textOfAnswer.contains("Правильный ответ")) {
            numberOfQuestion++;
            session.setAttribute("numberOfQuestion", numberOfQuestion);
            getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);
        }

        if (textOfAnswer.contains("Победа")) {
            numberOfGamesPlayed++;
            session.setAttribute("numberOfGamesPlayed", numberOfGamesPlayed);
            session.setAttribute("resultMessage", textOfAnswer);
            getServletContext().getRequestDispatcher("/win.jsp").forward(req, resp);
        }

        if (textOfAnswer.contains("Поражение")) {
            numberOfGamesPlayed++;
            session.setAttribute("numberOfGamesPlayed", numberOfGamesPlayed);
            session.setAttribute("resultMessage", textOfAnswer);
            getServletContext().getRequestDispatcher("/lose.jsp").forward(req, resp);
        }
    }
}
