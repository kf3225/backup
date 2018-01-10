<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>Total Error</title>
	</head>
	<body>
		<p>数値を入力してください</p>
		<button onClick="history.back()">戻る</button>
		<br>
		<p><%= exception %></p>
		<table border=1>
			<tr>
				<td>エラーメッセージ</td>
				<td><%= exception.getMessage() %></td>
			</tr>
			<tr>
				<td><strong>例外を文字列に変換</strong></td>
				<td><%= exception.toString() %></td>
			</tr>
			<tr>
				<td><strong>スタックトレース</strong></td>
				<td><% exception.printStackTrace( new java.io.PrintWriter( out ) ); %></td>
			</tr>
		</table>
	</body>
</html>