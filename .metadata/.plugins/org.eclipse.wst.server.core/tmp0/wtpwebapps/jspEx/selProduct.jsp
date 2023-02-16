<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	if(request.getParameter("username").isEmpty()) {
		out.println("<script> alert('이름을 입력하세요.')</script>");
		out.println("<script> history.go(-1)</script>");
	}
	request.setCharacterEncoding("utf-8");
	session.setAttribute("username", request.getParameter("username"));
%>
<html>
<head>
<meta charset="UTF-8">
<title>selProduct.jsp</title>
</head>
<body>
	<div align=center>
		<form name=form1 method=post action=add.jsp>
		<h2>상품선택</h2>
		<hr>
		<%= session.getAttribute("username")%>님 환영합니다
		<hr>
		<select name=product>
			<option selected>사과</option>
			<option>파인애플</option>
			<option>오렌지</option>
			<option>포도</option>
		</select>
		<input type=submit value="추가">
		</form>
		<a href=checkOut.jsp>계산</a>
	</div>
</body>
</html>