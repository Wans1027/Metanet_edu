<%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-22
  Time: 오후 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>forward된 페이지 (req 객체 공유)</h3>
    결과출력 : <%=request.getAttribute("result")%>

    <h3>EL</h3>
    ${requestScope.result}<br>
</body>
</html>
