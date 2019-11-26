<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
	<body>
	 	<form action="/application/LoginServlet" method="post"> 
	 	<table>
		
		<tr>
		<td>User Name:</td>
		<td><input type="text" name="name"></td>
		</tr>
		<tr></tr>
		<tr>
		<td>Password:</td>
		<td><input type="text" name="password" ></td>
		</tr>
		<tr></tr>
		<tr>
		<td><input type="submit" value="login"></td>
		<td><a href="Register.jsp">NewUser</a></td>
		</tr>
		</table>
	 	
	 </form> 
		
	<p style="color:red">${data2}</p>
	
	
	</body>
</html>