<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL & JSTL 으로 전환</h3>

	<c:set var="name" value="${param.name}" />

	<c:choose>
		<c:when test="${name == 'kglim'}"> <b>${name}</b> </c:when>
		<c:when test="${name == 'hong'}"> <b>${name}</b></c:when>
		<c:otherwise><b>${name}</b></c:otherwise>
	</c:choose>

</body>
</html>