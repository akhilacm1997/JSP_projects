<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/foodzone/AdminServlet" method="post"> 
	 	<table>
		
		<tr>
		<td>User ID:</td>
		<td><input type="text" name="id"></td>
		</tr>
		<tr></tr>
		<tr>
		<td>Password:</td>
		<td><input type="text" name="password" ></td>
		</tr>
		<tr></tr>
		<tr>
		<td><input type="submit" value="login"></td>
		
		</tr>
		</table>
	 	
	 </form> 
</body>
</html>