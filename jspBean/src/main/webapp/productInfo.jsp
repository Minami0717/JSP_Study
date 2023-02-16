<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="pinfo" class="product.ProductInfo" scope="request"></jsp:useBean>
코드: <jsp:getProperty name="pinfo" property="code" /><br>
제품명: <jsp:getProperty name="pinfo" property="name" /><br>
가격: <jsp:getProperty name="pinfo" property="price" /><br>