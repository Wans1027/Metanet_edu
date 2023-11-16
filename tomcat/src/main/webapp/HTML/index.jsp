<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World!!!!</title>
<%--  적용범위: 현재 페이지 내에 모든 태그: 유지보수문제때문에 잘 안씀--%>
  <style type="text/css">
    body {
      background-color: rgb(128, 128, 128);
    }
    h3 {
      color: red;
    }

  </style>
  <link rel = "stylesheet" href="../css/common.css">
</head>
<body>
<h1><%= "Hello World!!!!!" %></h1>
<div>

</div>
<br/>
<a href="hello-servlet">Hello Servlet</a>
  <h3>inline</h3>
  <p style="background-color: aqua">문단태그</p>
  <h3 style="color: tomato;">난 토마토</h3>

  <h3>외부 파일 참조</h3>
  <h3> 이미지 서버: 파일 서버 (AWS s3 서버)</h3>
  <h3></h3>
  <h1>외부 css 적용</h1>
</body>
</html>