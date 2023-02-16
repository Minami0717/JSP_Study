<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id="pinfo" class="member.PersonalInfo"></jsp:useBean>
	<jsp:setProperty property="name" name="pinfo" param="name"/>
	<jsp:setProperty property="gender" name="pinfo" param="gender"/>
	<jsp:setProperty property="age" name="pinfo" param="age"/>
	
	이름: <jsp:getProperty property="name" name="pinfo"/><br>
	성별: <jsp:getProperty property="gender" name="pinfo"/><br>
	나이: <jsp:getProperty property="age" name="pinfo"/>
</body>
</html>