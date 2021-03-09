<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/9/21
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form method="POST" action="guess">
    <label for="guess">Guess a number between 1-3</label>
    <input id="guess" name="guess" type="number" min="1" max="3" required>
    <input type="submit">
</form>

</body>
</html>
