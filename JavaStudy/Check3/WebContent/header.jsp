<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!-- 日付表示をインポートし使えるようにしている -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
	<div class="h-div">
		<label class="h-label">login</label> <label class="date-time">
			<% Date date = new Date();
   			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
   			String formatDate = sdf.format(date);%> <%= formatDate %>
		</label>
	</div>
	</header>

</body>
</html>