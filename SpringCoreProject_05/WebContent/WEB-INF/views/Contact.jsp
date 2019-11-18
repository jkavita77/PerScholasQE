<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactPage</title>
</head>
<body>
<h1> Contact Page </h1>

<form action="${pageContext.request.contextPath}/ContactUser" method="post">
        <table style="with: 50%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" /></td>
            </tr>
                <tr>
                <td>Question</td>
                <td><input type="question" name="question" /></td>
            </tr>
        </table>
        <input type="submit" value="Login" /></form>
        
        
        <p><a href="AboutmePage">Aboutme Page</a></p>
</body>

</html>