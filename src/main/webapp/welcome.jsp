<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/4/21
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int count = 0; %>
<% count++; %>
<html>
<head>
    <title>My First Java Server Page</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>The current count is: <%= count %></h1>

</body>
</html>
