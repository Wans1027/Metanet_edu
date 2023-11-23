<%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-23
  Time: 오후 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete.do" method="post">
    EMPNO  :  <input type="text" 		name="empno"    placeholder="empno입력"    required="required"><br>
    <%--		EMAIL: <input type="text" 		name="email" placeholder="email입력" required="required"><br>	--%>
    <input type="submit" value="회원지우기">
</form>
<form action="${pageContext.request.contextPath}/searchbyname.do" method="post">
    EMPNO  :  <input type="text" 		name="empno"    placeholder="empno입력"    required="required"><br>
    <%--		EMAIL: <input type="text" 		name="email" placeholder="email입력" required="required"><br>	--%>
    <input type="submit" value="회원지우기">
</form>
</body>
</html>
