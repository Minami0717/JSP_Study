<%@page import="mall.CartDao"%>
<%@page import="mall.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	String addr = request.getParameter("addr");
	String name = request.getParameter("name");
	String code = request.getParameter("code");
	String date = request.getParameter("date");
	int total = 0;
	
	List<Cart> list = CartDao.getInstance().selectAll(session.getAttribute("id").toString());
%>
<html>
<head>
<meta charset="UTF-8">
<title>Minami Mall</title>
<style>
	#title {background: #C3B091; height: 70px; padding: 100px;}
	.center {text-align: center;}
	.left {float: left; text-align: left;}
	.right {float: right;}
	th,td {border-top: 1px solid gainsboro; height: 50px;}
	#receipt {background: darkturquoise; margin: 50px 30%; padding: 20px;}
	table {clear: both;}
	#h {clear: both;}
	button {height: 35px; width: 55px; background: darkslateblue; border: none;
		border-radius: 5px; color: white; cursor: pointer;}
	.left button:first-child,.left button:last-child {background: gray;}
	.left button:nth-child(2) {width: 80px;}
</style>
</head>
<body>
	<%@include file="menu.jsp" %>
	<div id=title><h1 class=center>주문 정보</h1></div>
	<div class=center id=receipt>
		<h2>영수증</h2>
		<div class=left>
			<p><b>배송 주소</b>
			<p>성명 : <%=name %>
			<p>우편번호 : <%=code %>
			<p>주소 : <%=addr %>
		</div>
		<div class=right>배송일 : <%=date %></div>
		<table>
			<tr>
				<th width=300px>상품
				<th width=100px>수량
				<th width=200px>가격
				<th width=200px>소계
			<%
				for (Cart c : list) {
					total += c.getPrice()*c.getCount();
					%><tr>
						<td><%=c.getId()+" - "+c.getProduct() %>
						<td><%=c.getPrice() %>
						<td><%=c.getCount() %>
						<td><%=c.getPrice()*c.getCount() %><%
				}
			%>
			<tr>
				<td><td><td><b>총액 : </b><td><b style="color: red"><%=total %></b>
		</table>
		<div class=left>
			<button onclick=back()>이전</button>
			<button onclick=order()>주문 완료</button>
			<button onclick=cancel()>취소</button>
		</div>
		<div id=h></div>
	</div>
</body>
<script>
	function back() {
		history.back();
	}
	function order() {
		alert("주문이 완료되었습니다.");
		location.href="order.jsp";
	}
	function cancel() {
		if (confirm("주문을 취소할까요?"))
			location.href="cartForm.jsp"
	}
</script>
</html>