<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error_OK.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Test</title>
</head>
<body>
	<%
	//String str = "100";
	String str = "test";
	int i = Integer.parseInt(str);
	out.println(i+"<br>");
	out.println(str.toString()+"**");
	%>
</body>
</html>