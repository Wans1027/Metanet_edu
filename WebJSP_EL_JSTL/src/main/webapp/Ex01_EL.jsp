<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
/*
		Expression Language의 약자c
		JSP 2.0에서 새롭게 추가된 스크립트 언어
		기존의 Script tag의 표현식(정보: 스크립트 릿) tag에서 업그레이드된 버전 ( ${ 정보 } )
		[ 주요 특징 ]
		1) JSP 속성영역 (request,  response, session, application) 저장된 속성 객체의 property를 출력한다 
		2) 리터럴 데이터, 다양한 연산결과 출력이 가능하다 
		3) JSTL과 연동이 가능하다 
		
		EL(출력 표현식) : JSP 페이지에서 사용되는 출력 전용 스크립트 언어 (화면...) POINT) 서버에서 해석되는 스크립트언어
		이유 : 스파케티 코드 % + UI(정적) > 유지보수 어려움 > 코드의 가독성(해석)
		문제) EL & JSTL 만들어서 html 과 잘 놀고 ... JSP 사용가능 
		
		EL : tomcat 서버가 내장하고 있는 자원 (별도의 참조 필요 없다)
		JSTL : 다운로드 해서 (빌드 path....)  WEB-INF > lib > 복사 붙여넣기 > jar 파일
		
		
		EL 객체를 가지고 있다
		1. param
		2. paramValues
		3. requestScope
		4. sessionScope
		5. applicationScope 
*/
    //기존 자바 코드
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("userid");
    request.setAttribute("name", "kosa");
    request.setAttribute("user", "hong");

    //EL은 출력을 대체한다.
    //자원을 가지고 있거나 객체 다루는 기술은 아니다.
    Date today = new Date();
    request.setAttribute("day", today);
    session.setAttribute("day2", today);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>출력 기존 방식(JSP)</h3>
<b><%=id%></b>
<b><%=request.getAttribute("name")%></b>
<b><%=request.getAttribute("user")%></b>

<h3>EL출력</h3>
EL : ${100+100}<br>
EL : ${"1" + 1}<br>
EL : ${100+100}<br>
EL : ${false}<br>
EL : ${empty x}<br>

${requestScope.day}<br>

</body>
</html>