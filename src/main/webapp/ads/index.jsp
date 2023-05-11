<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Ad" />
</jsp:include>
<head>
    <meta charset="UTF-8">
    <title>All Ads</title>
</head>
<body>

<h1>All Ads</h1>

<c:forEach var="ad" items="${ads}">
    <div>
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
