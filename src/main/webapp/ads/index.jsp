<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/10/21
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Ad Listings"/>
    </jsp:include>
</head>
<body class="bg-dark">
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1 class="text-red">Your ads:</h1>

    
    <%--@elvariable id="ads" type="ViewAdsServlet"--%>
    <c:forEach var="ad" items="${ads}">
        <h2 class="text-green">Title: ${ad.title}</h2>
        <p class="text-blue">Description: ${ad.description}</p>
    </c:forEach>

</div>
</body>
</html>
