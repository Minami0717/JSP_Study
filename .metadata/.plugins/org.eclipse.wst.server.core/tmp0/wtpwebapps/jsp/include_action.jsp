<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include action</title>
</head>
<body>
	<h2>include_action.jsp 에서 footer.jsp 호출</h2>
	<hr>
	include_action.jsp 에서 출력한 메세지입니다.<br>
	<jsp:include page="footer.jsp">
		<jsp:param value="test@naver.com" name="email"/>
		<jsp:param value="053-382-4859" name="tel"/>
	</jsp:include>
</body>
</html>