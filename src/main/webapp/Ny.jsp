<%@ page import="NewYear.User" %><%--
  Created by IntelliJ IDEA.
  User: denissv
  Date: 28.12.2022
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello
<% User tt = (User) request.getAttribute("name");%>

<%= tt.getName()%>
Какую ты хочешь зарплату?
<%= tt.getSalary()%>
</body>
</html>
