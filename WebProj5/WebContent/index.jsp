<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>INDEX</title>
</head>
<body>
	<table>
	<tbody>
		<tr>
			<th>Hello Struts</th>
			<th>Welcome</th>
			<th>お問い合わせ</th>
			<th>GET通信</th>
			<th>POST通信</th>
		</tr>
		<tr>
			<td>
			<s:form action="HelloStrutsAction">
				<s:submit value="GO"/>
			</s:form>
			</td>
			<td>
			<s:form action="WelcomeAction">
				<s:submit value="GO"/>
			</s:form>
			</td>
			<td>
			<s:form action="InquiryAction">
				<s:submit value="GO"/>
			</s:form>
			</td>
			<td>
			<s:form method="get" action="TestAction">
				<s:textfield name="username"/>
				<s:password name="password"/>
				<s:submit value="GO"/>
			</s:form>
			</td>
			<td>
			<s:form method="post" action="TestAction">
				<s:textfield name="username"/>
				<s:password name="password"/>
				<s:submit value="GO"/>
			</s:form>
			</td>
		</tr>
	</tbody>
	</table>
</body>
</html>