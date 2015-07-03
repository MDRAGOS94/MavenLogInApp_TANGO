<%--
  Created by IntelliJ IDEA.
  User: DRAGOS_M
  Date: 7/1/2015
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TITLU NOU</title>
</head>
<body>
<c:out value="${requestScope.user.userName}"></c:out>
<%=session.getAttribute("userName")%>
</body>
</html>
