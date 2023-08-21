<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: green"><%= session.getAttribute("resultMessage")%></>
<br>
<br>
<form action="index.jsp">
    <button>Начать заново</button>
</form>
</body>
</html>
