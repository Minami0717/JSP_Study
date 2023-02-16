<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String winners[] = new String[3];
	winners[0] = "이수현";
	winners[1] = "정세훈";
	winners[2] = "김진희";
	request.setAttribute("winners", winners);
	RequestDispatcher dispatcher = request.getRequestDispatcher("winnersView.jsp");
	dispatcher.forward(request, response);
%>