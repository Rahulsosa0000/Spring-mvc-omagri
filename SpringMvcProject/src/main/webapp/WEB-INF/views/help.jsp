<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help-page</title>
</head>
<body>
	<h1>This is help page</h1>

	<%
		String sname= (String) request.getAttribute("StudentName");
		String sname2= (String) request.getAttribute("StudentName2");
%>
<h1>StudentName: <%= sname %> </h1>
<h1>StudentName2: <%= sname2 %> </h1>
</body>
</html>