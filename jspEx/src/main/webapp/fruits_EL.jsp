<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	ArrayList<String> items = new ArrayList<String>();
	items.add("딸기");
	items.add("오렌지");
	items.add("복숭아");
	request.setAttribute("fruits", items);
	RequestDispatcher dispatcher = request.getRequestDispatcher("fruitsView.jsp");
	dispatcher.forward(request, response);
%>