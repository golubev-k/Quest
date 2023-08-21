<%@ page import="com.quest_project.web.logic.GameLogic" %>
<%@ page import="com.quest_project.web.logic.InitServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .statistic{
            position: absolute;
            left: auto;
            bottom: 20px;
        }
    </style>
</head>
<body>
<% int numberOfQuestion = (int) session.getAttribute("numberOfQuestion");%>
    <form method="get"  name="radio" action="/game?${answer}">
        <p>
            <%=GameLogic.getTextOfQuestion(numberOfQuestion)%>

        </p>
        <p>
            <label>
                <input name="answer" type="radio" value="1" checked><%=GameLogic.getFirstAnswer(numberOfQuestion)%>
            </label>
        </p>
        <p>
            <label>
                <input name="answer" type="radio" value="2"><%=GameLogic.getSecondAnswer(numberOfQuestion)%>
            </label>
        </p>
        <p>
            <button type="submit" value="Answer">Ответить</button>
        </p>
    </form>
<div class="statistic">
    <p>Statistic:</p>
    <p>Ip адресс: <%=session.getAttribute(InitServlet.IP_ADDRESS)%></p>
    <p>Имя: <%=session.getAttribute(InitServlet.NAME)%></p>
    <p>Количество сыгранных игр: <%=(int)session.getAttribute(InitServlet.NUMBER_OF_GAMES_PLAYED)%></p>
</div>
</body>
</html>
