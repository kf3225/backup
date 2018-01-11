<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>Inquiry</title>
	</head>
	<body>

	<form method="post" action="InquiryServlet">
		名前　:　<input type="text" name="name"><br>
		お問い合わせ種類　:　<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">サポート</option>
		</select><br>
		お問い合わせ内容<br>
		<textarea name="body"></textarea><br>
		<input type="submit" value="GO">
	</form>

	</body>
</html>