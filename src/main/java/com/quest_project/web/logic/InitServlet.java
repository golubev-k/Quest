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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession(true);

        session.setAttribute("name", req.getParameter("name"));
        session.setAttribute("numberOfQuestion", 0);
        session.setAttribute("ipAdress", req.getRemoteAddr());

        if (session.getAttribute("numberOfGamesPlayed") == null) {
            session.setAttribute("numberOfGamesPlayed", 0);
        }

        session.setAttribute("numberOfGamesPlayed", (int) session.getAttribute("numberOfGamesPlayed"));
        getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);

    }
}
