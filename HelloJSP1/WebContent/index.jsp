<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	static int add(int a, int b){
		return a * b;
	}

	static int countA = 0;
	double random = Math.random();

%>

<%
	int countB = 0;
	countA++;
	countB++;
%>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>TEST</title>
	</head>
	<body>

		<p>こんにちは！</p>
		<% out.println(new java.util.Date()); %>
		<br>

		<p>1 * 2 = <%= add(1, 2) %></p>
		<p>3 * 4 = <%= add(3, 4) %></p>
		<br>

		<p>宣言による変数countA = <%= countA %></p>
		<p>スクリプトレットによる変数countB = <%= countB %></p>
		<br>

		<p><%= random %></p>
		<br>

		<p>お名前を入力してください</p>
		<form method="post" action="greeting-out.jsp">
			<input type="text" name="user">
			<input type="submit" value="送信">
		</form>
		<br>

		<form method="post" action="total-out.jsp">
			<input type="text" name="price">円　×
			<input type="text" name="count">個　＋送料
			<input type="text" name="delivery">円＝
			<input type="submit" value="あああああああああ">
		</form>


	</body>
</html>