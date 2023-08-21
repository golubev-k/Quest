package com.quest_project.web.logic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/hello")
public class InitServlet extends HttpServlet {

    public static final String NAME = "name";
    public static final String NUMBER_OF_GAMES_PLAYED = "numberOfGamesPlayed";
    public static final String NUMBER_OF_QUESTION = "numberOfQuestion";
    public static final String IP_ADDRESS = "ipAddress";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession(true);

        session.setAttribute(NAME, req.getParameter(NAME));
        session.setAttribute(NUMBER_OF_QUESTION, 0);
        session.setAttribute(IP_ADDRESS, req.getRemoteAddr());

        if (session.getAttribute(NUMBER_OF_GAMES_PLAYED) == null) {
            session.setAttribute(NUMBER_OF_GAMES_PLAYED, 0);
        }

        session.setAttribute(NUMBER_OF_GAMES_PLAYED, (int) session.getAttribute(NUMBER_OF_GAMES_PLAYED));
        getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);

    }
}
