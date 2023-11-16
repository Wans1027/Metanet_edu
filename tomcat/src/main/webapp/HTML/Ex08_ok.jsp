<%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-15
  Time: 오후 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //java 코드를 사용할 수 있는 곳 back단
    //실 개발에서는 jsp 페이지는 view 역할

    String userid = request.getParameter("id");
    String pwd = request.getParameter("pwd");
%>
<html>
<head>
    <title>Form Test</title>
</head>
<body>
    <h3>당신이 입력한 데이터</h3>
    ID : <%=userid%>
    PWD : <%=pwd%>
</body>
</html>
