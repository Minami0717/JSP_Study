<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	int sum = java+web+iot+android;
	double avg = (double)sum/4;
	String grade = "";
	
	if (avg >= 95)
		grade = "A+";
	else if (avg >= 90)
		grade = "A";
	else if (avg >= 85)
		grade = "B+";
	else if (avg >= 80)
		grade = "B";
	else if (avg >= 75)
		grade = "C+";
	else if (avg >= 70)
		grade = "C";
	else if (avg >= 65)
		grade = "D+";
	else if (avg >= 60)
		grade = "D";
	else
		grade = "E";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 200px;
		border: 1px solid;
		text-align: center;
	}
</style>
</head>
<body>
	<table>
			<tr>
				<td colspan=2>성적확인프로그램</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("name") %></td>
			</tr>
			<tr>
				<td>JAVA점수</td>
				<td><%=java %></td>
			</tr>
			<tr>
				<td>WEB점수</td>
				<td><%=web %></td>
			</tr>
			<tr>
				<td>IOT점수</td>
				<td><%=iot %></td>
			</tr>
			<tr>
				<td>ANDROID점수</td>
				<td><%=android %></td>
			</tr>
			<tr>
				<td>합계</td>
				<td><%=sum %></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%=avg %></td>
			</tr>
			<tr>
				<td>학점</td>
				<td><%=grade %></td>
			</tr>
		</table>
</body>
</html>