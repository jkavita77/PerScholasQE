<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
<h1>Login </h1>
<form action="${pageContext.request.contextPath}/LoginUser" method="post">
        <table style="with: 50%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" /></td>
            </tr>
                <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="Login" /></form>
</body>


</html>