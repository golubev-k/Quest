<%@ page import="com.quest_project.web.logic.GameLogic" %>
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
    <p>Ip адресс: <%=session.getAttribute("ipAdress")%></p>
    <p>Имя: <%=session.getAttribute("name")%></p>
    <p>Колличество сыгранных игр: <%=(int)session.getAttribute("numberOfGamesPlayed")%></p>
</div>
</body>
</html>
