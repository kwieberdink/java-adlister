<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kaeden
  Date: 5/9/23
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login">

        </jsp:param>
    </jsp:include>
</head>
<body>
<h1>Please Log In</h1>
<form action="login.jsp" method="post">
    <input name="username" type="text">
    <input name="password" type="text">
    <input type="submit" value="Log In">
</form>

</body>
</html>

<c:if test="${param.username == 'admin' && param.password == 'password'}">
    <c:redirect url="/profile.jsp">

    </c:redirect>
</c:if>