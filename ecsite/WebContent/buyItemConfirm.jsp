<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<title>BUY ITEM CONFIRM</title>

<style type="text/css">

/* =====TAG LAYOUT ===== */
body {
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background-color:#fff;
}

table {
	margin:0 auto;
	text-align:center;
}

/* ===== ID LAYOUT ===== */
#top {
	width:60%;
	margin:30px auto;
	border:1px solid #333;
}

#header {
	width:100%;
	height:80px;
	background-color:black;
}

#main {
	width:100%
	height:500px;
	background-color:#fff;
	text-align:center;
}

#footer {
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}
</style>

<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>

</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>

	<div id="main">
		<div id="top"><p>BUY ITEM CONFIRM</p></div>
		<div>
			<s:form>
			<table>
				<tr>
					<td><span>商品名<s:property value="session.id" /></span></td>
					<td><s:property value="session.itemName" /></td>
				</tr>
				<tr>
					<td><span>値段</span></td>
					<td><s:property value="session.total_price" /></td>
				</tr>
				<tr>
					<td><span>個数</span></td>
					<td><s:property value="session.count" /></td>
				</tr>
				<tr>
					<td><span>支払い方法</span></td>
					<td><s:property value="session.pay" /></td>
				</tr>
				<tr>
					<td><br></td>
					<td><input type="button" value="戻る" onClick="submitAction('HomeAction')" /></td>
					<td><input type="button" value="完了" onClick="submitAction('BuyItemConfirmAction')" /></td>
				</tr>
			</table>
			</s:form>
		</div>
		<div>
			<p>前画面に戻るには<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
			<p>マイページは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>