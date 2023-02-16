<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	String username = request.getParameter("username");
	String job = request.getParameter("job");
	String[] favorites = request.getParameterValues("favorite");
%>
<html>
<head>
<meta charset="UTF-8">
<title>request_result.jsp</title>
</head>
<body>
	<div align=center>
		<h2>request 테스트 결과 - 1</h2>
		<hr>
		<table border=1 cellspacing=1 cellpadding=5>
			<tr>
				<td>이름</td>
				<td><%=username %></td>
			</tr>
			<tr>
				<td>직업</td>
				<td><%=job %></td>
			</tr>
			<tr>
				<td>관심분야</td>
				<td><%for (String favorite : favorites) {
						out.println(favorite + "<br>");
					} %>
				</td>
			</tr>
		</table>
		<hr>
		<h2>request 테스트 결과 - 2</h2>
		1. 클라이언트 IP 주소 : <%= request.getRemoteAddr() %><br>
		2. 요청 메서드 : <%= request.getMethod() %><br>
		<% Cookie cookie[] = request.getCookies(); %>
		3. <%= cookie[0].getName() %>에 설정된 쿠키 값 : <%= cookie[0].getValue() %><br>
		4. 프로토콜 : <%= request.getProtocol() %>
	</div>
</body>
</html>