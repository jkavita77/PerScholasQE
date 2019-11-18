<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome page</h1>

<a href="${pageContext.request.contextPath}/LinkTagServlet?param=Good Morning/">Page1</a>
<a href= "${pageContext.request.contextPath}/LinkTagServlet?param1=Good Evening">Page2</a>
</body>
</html>