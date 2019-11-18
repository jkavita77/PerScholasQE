<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Cookies</h1>
<p>
	<%
	Cookie[] cookies = request.getCookies(); 
	for (Cookie c : cookies) { 
		if (c.getName().equals("myFavoriteCookie"))
	   out.print(c.getValue()); 
	 } 
	 %>
	</p>
</body>
</html>