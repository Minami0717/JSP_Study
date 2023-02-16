<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="calc" class="jspbook.CalcBean" />
<jsp:setProperty name="calc" property="*" />
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title> 
</head> 
<body>
<h2>계산기 bean</h2>
	<hr>
	계산 결과 : ${calc.calculate()}
</body>
</html>