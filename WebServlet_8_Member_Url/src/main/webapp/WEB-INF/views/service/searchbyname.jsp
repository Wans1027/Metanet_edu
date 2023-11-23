<%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-23
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/searchbynameOk.do" method="post">
    ENAME :  <input type="text" 	name="ename"   placeholder="ename입력"   required="required"><br>
    <input type="submit" value="검색하기">
</form>
</body>
</html>
