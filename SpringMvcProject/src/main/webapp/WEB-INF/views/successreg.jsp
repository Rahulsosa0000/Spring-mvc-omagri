<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>Welcome: ${name}</h1>
<h1>Your Email Address is: ${email}</h1>
<h1>Password is: ${password}</h1> --%>

<h1>Welcome: ${user.name}</h1>
<h1>Your Email Address is: ${user.email}</h1> <!--Use Of ModelAttribute  -->
<h1>Password is: ${user.password}</h1>
<h1></h1>
</body>
</html>