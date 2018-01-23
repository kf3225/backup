<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>WELCOME</title>
</head>
<body>
	<table>
	<tbody>
	<tr>
		<th>名前とパスワードを入力してください</th>
	</tr>
	<tr>
	<s:form method="post" action="LoginAction">
		<td><s:textfield name="username" label="ユーザー名"/></td>
		<td><s:password name="password" label="パスワード"/></td>
		<td><s:submit value="送信"/></td>
	</s:form>
	</tr>
	</tbody>
	</table>
</body>
</html>