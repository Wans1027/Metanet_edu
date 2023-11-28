<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String msg = (String)request.getAttribute("board_msg");
  String url = (String)request.getAttribute("board_url");
    System.out.println(msg+"@@@@@");
  
  if(msg != null && url != null){
      System.out.println("!@!@!@!");
%>
	<script>
		<%--alert('<%= msg %>');		--%>
	    <%--location.href='<%=url%>';--%>
        console.log("slslsls");
	</script>
	
<%	  
  }
%>