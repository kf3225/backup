<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>お問い合わせ</title>
	</head>
	<body>
		<s:form method="post" action="InquiryCompleteAction">
			お名前 : <input type="text" name="name"/><br>
			お問い合わせ種類 : <select name="qtype">
				<option value="company">会社について</option>
				<option value="product">製品について</option>
				<option value="support">サポートについて</option>
			</select><br>
			お問い合わせ内容
			<s:textarea name="body"/><br>
			<s:submit value="送信"/>
		</s:form>
	</body>
</html>