<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script>
        /*
	Jquery 제공하는 비동기 함수
	https://www.w3schools.com/jquery/jquery_ajax_intro.asp
	https://api.jquery.com/category/ajax/

		Ajax
		Global Ajax Event Handlers  (10%)
		Helper Functions (10%)
		Low-Level Interface (30%) 모든 옵션을 개발자가 제어 >> $.ajax()
		Shorthand Methods   (50%) 기본 옵션을 가지고 있는 함수 >>  load() , get() , post()

		.load( url [, data ] [, complete ] )
	    Description: Load data from the server and place the returned HTML into the matched elements.

	    url
	    Type: String
	    A string containing the URL to which the request is sent.

	    data
	    Type: PlainObject or String
	    A plain object or string that is sent to the server with the request.


	    complete (서버에서 응답이 오면 readyState == 4번이면 자동호출)
	    Type: Function( String responseText, String textStatus, jqXHR jqXHR )
	    A callback function that is executed when the request completes.

	    load 함수
	    1. 서버에서 받는 데이터가 (html , text) 방식
	    2. Client 에서 정의한 특정 요소에 매핑할 목적 ( 자동 innerHTML)

	    data 두번째 parameter  설정
	    jsp?empno=7788


	    data 두번째 객체(json)
	    {name:"kglim",age:100}
	    servlet.do?name=kglim&age=100


	    complete 함수 (callback)

	*/
    </script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>