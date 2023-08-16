<%--
  Created by IntelliJ IDEA.
  User: kostyagolubev
  Date: 15.08.2023
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% int numberOfQuestion = (int) session.getAttribute("numberOfQuestion");%>
<h2 style="color: red"><%= session.getAttribute("resultMessage")%></>
<br>
<br>
<form action="index.jsp">
    <button>Начать заново</button>
</form>
</body>
</html>
