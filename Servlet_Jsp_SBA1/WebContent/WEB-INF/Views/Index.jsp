<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Project 1</title>
</head>
<body>
  <jsp:useBean id="now" class="java.util.Date" />
       <p>Welcome
           <fmt:formatDate value="${now}"
                           type="both" /></p>
</body>
</html>