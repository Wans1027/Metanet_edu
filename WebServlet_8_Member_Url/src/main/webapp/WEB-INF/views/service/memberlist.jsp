
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>EMPNO</th>
        <th>ENAME</th>
        <th>HIREDATE</th>
    </tr>
    <!-- EL & JSTL forEach 출력하세요
    <tr>
        <td></td>
        <td></td>
        <td></td>
    </tr>
     -->
    <c:forEach var="data" items="${requestScope.data}">
        <tr>
            <td>${data.empno}</td>
            <td>${data.ename}</td>
            <td>${data.hiredate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
