<%@page import="mall.PostDao"%>
<%@page import="mall.Post"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	List<Post> list = PostDao.getInstance().selectAll();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Minami Mall</title>
<style>
	#title {background: #C3B091; height: 70px; padding: 100px;}
	.center {text-align: center;}
	table {display: inline-block; margin-top: 50px;
	border-top: 1px solid gainsboro;}
	th,td {border-bottom: 1px solid gainsboro; height: 30px;}
	table a {color: black;}
</style>
</head>
<body>
	<%@include file="menu.jsp" %>
	<div id=title><h1 class=center>공지사항</h1></div>
	<div class=center>
		<table>
			<tr>
				<th width=50px>번호
				<th width=500px>제목
				<th width=100px>작성자
				<th width=100px>작성일
				<th width=100px>조회수
			<%
				for (Post p : list) {
					%><tr>
						<td><%=p.getIdx() %>
						<td><a href="contentForm.jsp?idx=<%=p.getIdx() %>"><%=p.getTitle() %></a>
						<td><%=p.getWriter() %>
						<td><%=p.getDate().substring(0,10) %>
						<td><%=p.getHits() %><%
				}
			%>
		</table>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>