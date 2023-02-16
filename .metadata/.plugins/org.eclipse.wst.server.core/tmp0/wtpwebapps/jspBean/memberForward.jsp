<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="pinfo" class="member.PersonalInfo" scope="request"></jsp:useBean>
	<jsp:setProperty property="name" name="pinfo" value="김연희"/>
	<jsp:setProperty property="gender" name="pinfo" value="여"/>
	<jsp:setProperty property="age" name="pinfo" value="29"/>
	<jsp:forward page="personalInfoViewer.jsp"></jsp:forward>
</body>
</html>