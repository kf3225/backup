<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page errorPage="total-error.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	int price = Integer.parseInt(request.getParameter("price"));
	int count = Integer.parseInt(request.getParameter("count"));
	int delivery = Integer.parseInt(request.getParameter("delivery"));
%>

<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>Total</title>
	</head>
	<body>
		<%= price %>　円　×<%= count %>個　＋　送料<%= delivery %>円　＝
		<%= price * count + delivery %>円
	</body>
</html>