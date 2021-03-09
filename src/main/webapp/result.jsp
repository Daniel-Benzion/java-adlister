<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/9/21
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result!</title>
</head>
<body>
    <%--@elvariable id="correct" type="CorrectServlet"--%>
    <c:if test="${correct == true}">
        <h1>You guessed right!</h1>
        <a href="guess">Play again?</a>
    </c:if>
    <%--@elvariable id="incorrect" type="IncorrectServlet"--%>
    <c:if test="${incorrect == true}">
        <h1>You guessed wrong...</h1>
        <a href="guess">Play again</a>
    </c:if>

</body>
</html>
