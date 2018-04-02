<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>

	<table>
		<s:form action="LoginAction">

			<tr>
				<th>USERID:</th>
				<td><s:textfield name="userId" /></td>
			</tr>
			<tr>
				<th>PASSWORDS:</th>
				<td><s:password name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><s:submit value="submit" /></td>
			</tr>

		<s:if test="errorMessageList != null">
			<tr>
				<td><s:iterator value="errorMessageList">
						<s:property />
					</s:iterator></td>
			</tr>
		</s:if>

		</s:form>
	</table>





</body>
</html>