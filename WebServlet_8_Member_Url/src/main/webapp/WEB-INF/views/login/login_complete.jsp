<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h3>로그인 성공</h3>
    <a href="default.html">MAIN</a>
<%--    <input type="text" placeholder="empno">--%>
<%--    <input type="text" placeholder="empno">--%>
<%--    <input type="text" placeholder="empno">--%>
<%--    <input type="text" placeholder="empno">--%>
<%--    <h3>${requestScope.data.empno}</h3>--%>
<%--    <h3>${requestScope.data.ename}</h3>--%>

    <div class="container mt-3">
        <h2>직원 정보</h2>
        <form name="form">
            <div class="mb-3 mt-3">
                <label for="empno">EMPNO:</label>
                <input type="text" class="form-control" id="empno" placeholder="EMPNO" name="empno" value="${requestScope.data.empno}">
            </div>
            <div class="mb-3">
                <label for="ename">ENAME:</label>
                <input type="text" class="form-control" id="ename" placeholder="ENAME" name="ename" value="${requestScope.data.ename}">
            </div>
            <div class="mb-3">
                <label for="job">JOB:</label>
                <input type="text" class="form-control" id="job" placeholder="JOB" name="job" value="${requestScope.data.job}">
            </div>
            <div class="mb-3">
                <label for="mgr">MGR:</label>
                <input type="text" class="form-control" id="mgr" placeholder="MGR" name="mgr" value="${requestScope.data.mgr}">
            </div>
            <div class="mb-3">
                <label for="hiredate">HIREDATE:</label>
                <input type="text" class="form-control" id="hiredate" placeholder="HIREDATE" name="hiredate" value="${requestScope.data.hiredate}">
            </div>
            <div class="mb-3">
                <label for="sal">SAL:</label>
                <input type="text" class="form-control" id="sal" placeholder="SAL" name="sal" value="${requestScope.data.sal}">
            </div>
            <div class="mb-3">
                <label for="comm">COMM:</label>
                <input type="text" class="form-control" id="comm" placeholder="COMM" name="comm" value="${requestScope.data.comm}">
            </div>
            <div class="mb-3">
                <label for="deptno">DEPTNO:</label>
                <input type="text" class="form-control" id="deptno" placeholder="DEPTNO" name="deptno" value="${requestScope.data.deptno}">
            </div>
<%--            <button type="submit" class="btn btn-primary">변경하기</button>--%>
            <input type="submit" class="btn btn-primary" value="변경하기" onclick="javascript: form.action='${pageContext.request.contextPath}/update.do';"/>
            <input type="submit" class="btn btn-primary" value="지우기" onclick="javascript: form.action='${pageContext.request.contextPath}/delete.do';"/>
        </form>
    </div>
</body>
</html>
