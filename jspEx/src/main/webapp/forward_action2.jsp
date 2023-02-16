<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% request.setCharacterEncoding("utf-8"); %>
<jsp:forward page="page_control_end.jsp">
	<jsp:param name="tel" value="010-1234-1234" />
</jsp:forward>