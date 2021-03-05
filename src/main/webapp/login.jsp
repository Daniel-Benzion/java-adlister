<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/5/21
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	if (username.equalsIgnoreCase("admin") && password.equals("password123")) {
    		response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="POST" action="login.jsp">
    <input type="text" name="username" placeholder="Email address">
    <input type="password" name="password" placeholder="Password">
    <button type="submit" name="submit">Login</button>
</form>

</body>
</html>
