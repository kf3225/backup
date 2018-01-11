<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>HelloServlet</title>
	</head>
	<body>
		<input type="button" value="HelloServlet1" onClick="location.href='HelloServlet1'">
		<input type="button" value="WelcomeServlet" onClick="location.href='welcome.jsp'">
		<input type="button" value="InquiryServlet" onClick="location.href='inquiry.jsp'">
		<br>
		GET通信<br>
		<form method="get" action="TestServlet">
			<input type="text" name="username">
			<input type="password" name="password">
			<input type="submit" value="goooo">
		</form>
		<br>
		POST通信<br>
		<form method="post" action="TestServlet">
			<input type="text" name="username">
			<input type="password" name="password">
			<input type="submit" value="go">
		</form>
		<br>

		<input type="button" value="MySQLServlet" onClick="location='MySQLServlet'">
	</body>
</html>