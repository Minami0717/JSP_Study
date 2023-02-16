<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mall.ProductInfo" %>
<!DOCTYPE html>
<%
	ProductInfo product = new ProductInfo();
	product.setName("초코케이크 3호");
	product.setPrice(20000);
	request.setAttribute("product", product);
	RequestDispatcher dispatcher = request.getRequestDispatcher("productInfoView.jsp");
	dispatcher.forward(request, response);
%>