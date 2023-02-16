<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Cookie[] cookies = request.getCookies(); %>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 데이터 읽기1</title>
</head>
<body>
	쿠키 데이터 읽기1 <br>
	이름: <%= getCookieValue(cookies, "NAME") %> <br>
	성별: <%= getCookieValue(cookies, "GENDER") %> <br>
	나이: <%= getCookieValue(cookies, "AGE") %> <br>
</body>
</html>

<%!
	private String getCookieValue(Cookie[] cookies, String name) {
		String value = null;
		if (cookies == null)
			return null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(name))
				return cookie.getValue();
		}
		return null;
	}
%>