<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	request useBean<br>
	<jsp:useBean id="pinfo" class="member.PersonalInfo" scope="request"></jsp:useBean>
	이름: <jsp:getProperty property="name" name="pinfo"/><br>
	성별: <jsp:getProperty property="gender" name="pinfo"/><br>
	나이: <jsp:getProperty property="age" name="pinfo"/>
</body>
</html>