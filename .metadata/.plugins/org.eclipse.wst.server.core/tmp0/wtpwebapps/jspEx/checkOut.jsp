<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkOut.jsp</title>
</head>
<body>
	<div align=center>
		<h2>계산</h2>
		선택한 상품 목록
		<hr>
		<% 
			ArrayList<String> list = (ArrayList)session.getAttribute("productlist"); 
			if(list == null)
				out.println("선택한 상품이 없습니다.");
			else{
				for(Object productName : list)
					out.println(productName+"<br>");
			}
		%>
		
	</div>
</body>
</html>