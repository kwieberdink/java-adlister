<%--
    JSP TAGS [JavaServerPages]
    @: Directive, defining attributes
    V taglib: TAG LIBRARY
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Declaration, JSP variable can be declared here--%>
<%! int count = -2; %>
<% count += 1;%>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<<<<<<< HEAD
<c:if test="true">
    <h1>Variable names should be very descriptive</h1>
</c:if>
<c:if test="false">
    <h1>single letter variable names are good</h1>
</c:if>

<!-- This is an HTML comment you will see this in the HTML-->
<%--This is a JSP comment you will not see this in the HTML--%>

<%--Can either close is like such or by using </jsp:include>--%>
    <head>
        <jsp:include page="partials/head.jsp">
            <jsp:param name="title" value="Start Page"/>
        </jsp:include>
    </head>
    <jsp:include page="partials/navbar.jsp"/>
    <h1>Implicit Objects in action:</h1>
    <p>Path: <%= request.getRequestURL()%></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name")%></p>
    <p>"method" attribute: <%= request.getMethod()%></p>

    <h2>EL / Expression Language</h2>
    <p>"name" parameter: ${param["name"]}</p>

    <p>${2 + 2}</p>
    <p>${"2" + "2"}</p>

<%-- 4 --%>

    <p>${"2 + 2"}</p>
<%-- 2 + 2--%>

    <% request.setAttribute("numbers", new int[]{222, 777, 21, 7, 14, 3}); %>

    <ul>
<%--    ForEach "number" of numbers Array, OUTPUT <li> number </li>    --%>
        <c:forEach var="number" items="${numbers}">
            <li>${number}</li>
        </c:forEach>
    </ul>

    <% request.setAttribute("five", 5); %>
    <c:choose>
        <c:when test="number < 3">
            <p>Expression 1 is True</p>
        </c:when>
        <c:when test="${five > 6}">
            <p>Expression 2 is false </p>
        </c:when>
        <c:otherwise>
            <p>Both expressions are false</p>
        </c:otherwise>
    </c:choose>

<%--Expression applies the variable declared in the head--%>
    <h1>The current count is <%= count %></h1>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>