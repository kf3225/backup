<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<style type="text/css">

/* ===== TAG LAYOUT ===== */
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
	text-align:center;
	margin:0 auto;
	border:1px solid #333;
}

/* ===== ID LAYOUT ===== */
#top {
	width:60%;
	margin:30px auto;
	text-align:center;
	border:1px solid #333;
}

#header {
	width:100%;
	height:80px;
	background-color:black;
}

#main {
	width:100%;
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

<title>BUY ITEM</title>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>

	<div id="main">
		<div id="top"><p>BUY ITEM</p></div>
		<div>
			<s:form action="BuyItemAction">
			<table>
				<tr>
					<td><span>商品名</span></td>
					<td><s:property value="session.buyItem_name" /><br></td>
				</tr>
				<tr>
					<td><span>値段</span></td>
					<td><s:property value="session.buyItem_price" /><span>円</span></td>
				</tr>
				<tr>
					<td><span>購入個数</span></td>
					<td>
					<select name="count">
						<option value="1" selected="selected">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
					</td>
				</tr>
				<tr>
					<td><span>支払い方法</span></td>
					<td>
						<input type="radio" name="pay" value="1" checked="checked">現金払い
						<input type="radio" name="pay" value="2">クレジットカード払い
					</td>
				</tr>
				<tr>
					<th><s:submit value="確定" /></th>
				</tr>
			</table>
			</s:form>
			<div>
				<p>前画面に戻る方は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
				<p>マイページに戻る方は<a href='<s:url action="MyPageAction" />'>こちら</a></p>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>