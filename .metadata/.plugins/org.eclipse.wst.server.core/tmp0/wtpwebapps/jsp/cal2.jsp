<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="calc" class="CalcBean" />
<jsp:setProperty name="calc" property="*" />
<%
	calc.calc();
%>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
	<div align=center>
		<h3>계산기 Bean</h3>
		<hr>
		<form name=form1 method=post>
			<input type="text" name="num1" width=200 size="5">
			<select name="operator">
				<option selected>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select>
			<input type="text" name="num2" width=200 size="5">
			<input type="submit" value="계산" name="B1">
			<input type="reset" value="다시입력" name="B2">
		</form>
		<hr>
		
		계산결과 :
		<jsp:getProperty property="result" name="calc"/>
	</div>
</body>
</html>