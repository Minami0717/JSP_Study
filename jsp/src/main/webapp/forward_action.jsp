<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward action</title>
</head>
<body>
	<h2>forward_action.jsp 에서 footer.jsp 호출</h2>
	<hr>
	forward_action.jsp 에서 출력한 메세지입니다.<br>
	<jsp:forward page="footer.jsp">
		<jsp:param value="test@test.net" name="email"/>
		<jsp:param value="000-000-0000" name="tel"/>
	</jsp:forward>
</body>
</html>