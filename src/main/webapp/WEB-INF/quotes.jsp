<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The dao Quotes"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the Authors!</h1>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">name</th>
            <th scope="col">Author</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="quote" items="${quotes}">
            <tr>
                <th scope="row">${quote.id}</th>
                <td>${quote.content}</td>
                <td>${quote.author.name}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>

</body>
</html>