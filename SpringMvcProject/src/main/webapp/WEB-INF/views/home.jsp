<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This Is Home Page.....</h1>

	<%
  
	String name=(String) request.getAttribute("Name");
	int age=(int) request.getAttribute("Age");
	Object names= request.getAttribute("n");
	
     %>
     <%-- <h1>Name is: <%= name%></h1>
     <h1>Age is: <%= age%></h1>
     <h1>Names is: <%= names%></h1> --%>
     
     <h1>Name: ${Name}</h1> <!-- using EL   -->
     <h1>Age: ${Age}</h1> <!-- using EL   -->
     <h1>Students: ${n}</h1> <!-- using EL   -->
</body>
</html>