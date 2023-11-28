<%@ page import="kr.or.kosa.dto.Member" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %><%--
  Created by IntelliJ IDEA.
  User: WAN
  Date: 2023-11-27
  Time: 오후 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //java 객체 json 데이터 변환
    // 1. JSONObject 사용 > { } json 객체 하나
    // 2. JSONArray 사용 > [{},{},{}] 생성

    Member member = new Member();
    JSONObject obj = new JSONObject();

%>
<%=obj%>


<%
    List<Member> memberList = new ArrayList<>();
    memberList.add(new Member("jogn", "1004", "서울시 강남구", "0"));
    memberList.add(new Member("asd", "1004", "서울시 강남구", "0"));
    memberList.add(new Member("jozxcgn", "1004", "서울시 강남구", "0"));
    memberList.add(new Member("qwer", "1004", "서울시 강남구", "0"));
    JSONArray jsonArray = JSONArray.toJSONString(memberList);
%>
<%=jsonArray%>
