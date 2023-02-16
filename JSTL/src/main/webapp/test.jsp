<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="Intro"/>
<html>
	<body>
		<fmt:message key="TITLE"></fmt:message>
		<fmt:message key="greeting"></fmt:message>
		<%
		request.setAttribute("id", 6);
		%>
		<script>location.href='test1.jsp?id='+${id}</script>
	</body>
</html>