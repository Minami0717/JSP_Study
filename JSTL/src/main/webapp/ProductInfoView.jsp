<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String arr[] = {"불","오","콩"};
	request.setAttribute("menu", arr);
%>
<jsp:forward page="test.jsp"></jsp:forward>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>