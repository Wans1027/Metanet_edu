<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
    jsp:include : 공통UI작업(필요한 페이지에서 사용)

    header.jsp
    footter.jsp

    a.jsp >> include header.jsp
    b.jsp >> include header.jsp
--%>
<html>
<head>
    <title>Title</title>

</head>
<body>
    SITE MAIN PAGE 상단
    <hr>
        <jsp:include page="/commonmodule/sub.jsp"></jsp:include>
    <hr>
</body>
</html>
