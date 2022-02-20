<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.it.academy.MessengerHomeTask01.services.Storage" %>
<%@ page import="by.it.academy.MessengerHomeTask01.dto.Message" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>chats</title>
</head>
<body>
<h3><%= "Your massages" %></h3>

<c:forEach var="message" items="${requestScope.messagesList}">
    ${message}<br>
</c:forEach>
<form action="<c:url value="/messenger/profile.jsp"/>">
    <button type="submit">back</button>
</form>
</body>
</html>
