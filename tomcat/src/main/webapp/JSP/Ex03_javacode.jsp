<%@ page import="com.example.tomcat.kosa.Emp" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-20
  Time: 오후 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Emp emp = new Emp();
    emp.setEmpNo(9999);
    emp.setEName("aaaa");

    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
    <h3>출력 표현식</h3>
<%--    <%=emp.getEmpNo()%><br>--%>
<%--    <%=emp.getEName()%><br>--%>
<%--    <%=emp.toString()%><br>--%>
<%--    년도 <%=year%>--%>
</body>
</html>
