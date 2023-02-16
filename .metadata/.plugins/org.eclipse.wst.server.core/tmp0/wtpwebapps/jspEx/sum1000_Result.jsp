<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression Attribute Result</title>
</head>
<body>
	1부터 1000까지 더한 결과는?
	<%= request.getAttribute("result") %>
</body>
</html>