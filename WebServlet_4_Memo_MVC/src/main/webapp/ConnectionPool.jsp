<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-23
  Time: 오전 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //JNDI
    Context context = new InitialContext();
    //현재 프로젝트 에서 특정 이름을 가진 객체를 검색 (이름 기반 검색)

    DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
    //java:comp/env (정해진 약속) + 개발자 마음 (context.xml) name="jdbc/oracle"

    Connection conn = null;
    conn = ds.getConnection(); //튜브 빌려오기
    out.print("db 연결 : " + conn.isClosed());//false 나오면 됨
    //튜브 반환
    conn.close();//자원해제가 아니고 반환
    out.print("  db 연결 : " + conn.isClosed());

    //그래서 pool 객체의 scope > 함수로 제한하다 (method)
%>
</body>
</html>
