<%@ page import="com.quest_project.web.logic.GameLogic" %><%--
  Created by IntelliJ IDEA.
  User: kostyagolubev
  Date: 14.08.2023
  Time: 08:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% int numberOfQuestion = (int) session.getAttribute("numberOfQuestion");%>
<h2 style="color: green"><%= session.getAttribute("resultMessage")%></>
<br>
<br>
<form action="index.jsp">
    <button>Начать заново</button>
</form>
</body>
</html>
