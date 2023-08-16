<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Знакомство</title>
</head>
<body>
    <form method="get" action="/hello?${name}">
        <p>
            Добро пожаловать в игру. Может представишься?
        </p>
        <p>
            <label>
                <input placeholder="Ваше имя" name="name" pattern="[A-Za-zА-Яа-яЁё]{3,}" required>
            </label>
        </p>
        <p>
            <button type="submit">Начать игру</button>
        </p>
    </form>
</body>
</html>
