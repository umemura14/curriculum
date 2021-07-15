<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
<!-- includeディレクティブを使用してheader.jspパスを読み込む -->
	<div class="jsp-div">
		<table>
			<tr>
				<td><label class="jsp-label">name</label></td>
				<td><input></td>
			</tr>
			<tr>
				<td><label class="jsp-label">id</label></td>
				<td><input></td>
			</tr>
		</table>
	</div>

	<%@ include file="footer.jsp"%>
	<!-- 上記と同様にfooter.jspパスを読み込む -->
</body>
</html>