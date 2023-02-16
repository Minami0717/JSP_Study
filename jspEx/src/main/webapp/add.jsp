<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	String productName = request.getParameter("product");
	ArrayList<String> list = (ArrayList)session.getAttribute("productlist");
	if(list == null){
		list = new ArrayList<String>();
		session.setAttribute("productlist", list);
	}
	list.add(productName);
%>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
</head>
<body>
	<script>
		alert("<%=productName%>이(가) 추가되었습니다.");
		history.go(-1);
	</script>
</body>
</html>