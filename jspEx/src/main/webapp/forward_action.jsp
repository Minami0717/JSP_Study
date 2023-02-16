<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward action 테스트</title>
</head>
<body>
	<h2>forward_action.jsp 에서 footer.jsp 호출</h2>
	<hr>
	forward_action.jsp 의 모든 내용은 출력되지 않습니다.
	<%!
		int a = 10;
	%>
	<%=a %>
	<jsp:forward page="page_control_end.jsp">
		<jsp:param name="email" value="test@test.net" />
		<jsp:param name="tel" value="010-1234-1234" />
	</jsp:forward>
</body>
</html>