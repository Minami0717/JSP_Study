<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int sum = 0;
	for (int cnt = 1; cnt <=100; cnt++)
		sum += cnt;
	request.setAttribute("result", new Integer(sum));
%>
<jsp:forward page="sum100_result.jsp"/>