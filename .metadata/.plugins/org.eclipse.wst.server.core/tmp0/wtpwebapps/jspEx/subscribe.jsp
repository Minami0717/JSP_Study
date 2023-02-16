<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String agree = request.getParameter("agree");
	String result = null;
	if (agree.equals("yes")) {
		String id = session.getAttribute("id").toString();
		String password = session.getAttribute("password").toString();
		String name = session.getAttribute("name").toString();
		PrintWriter writer = null;
		try {
			String filePath = application.getRealPath("/WEB-INF/" + id + ".txt");
			writer = new PrintWriter(filePath);
			writer.println("아이디: " + id);
			writer.println("패스워드: " + password);
			writer.println("이름: " + name);
			result = "success";
		}
		catch (IOException ioe) {
			result = "fail";
		}
		finally {
			try {
				writer.close();
			}
			catch (Exception e) {
			}
		}
	}
	else {
		result = "fail";
	}
	session.invalidate();
	response.sendRedirect("result.jsp?result=" + result);
%>