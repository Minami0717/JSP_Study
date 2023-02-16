<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("<script> alert('세션을 설정합니다.') </script>");
		session.setAttribute("login", "홍길동");
	%>
</body>
</html>