<%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-20
  Time: 오후 7:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2><%=id%></h2>
</body>
</html>
