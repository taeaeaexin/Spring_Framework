<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    //실행되는 자바코드
    String searchWord = request.getParameter("searchWord");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Document </title>
</head>
<body>
    <h1>Your searchWord : <%= searchWord%></h1>
</body>
</html>